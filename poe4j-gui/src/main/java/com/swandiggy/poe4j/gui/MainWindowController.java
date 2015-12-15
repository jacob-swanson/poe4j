package com.swandiggy.poe4j.gui;

import com.swandiggy.poe4j.ggpkg.Ggpkg;
import com.swandiggy.poe4j.ggpkg.GgpkgExtractor;
import com.swandiggy.poe4j.ggpkg.GgpkgFactory;
import com.swandiggy.poe4j.gui.log.ObservableLogAppender;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;

/**
 * @author Jacob Swanson
 * @since 12/9/2015
 */
@Slf4j
@Service
public class MainWindowController implements Initializable {

    private StringProperty ggpkgPathText = new SimpleStringProperty();
    private StringProperty extractDirText = new SimpleStringProperty();

    @FXML
    private TextField ggpkgFileTextField;
    @FXML
    private TextField extractDirectoryTextField;
    @FXML
    private ListView logView;

    @Autowired
    private GgpkgFactory ggpkgFactory;

    @Autowired
    private GgpkgExtractor ggpkgExtractor;

    public void extract(ActionEvent event) {
        if (StringUtils.isEmpty(ggpkgPathText)) {
            log.error("No selected GGPKG file");
            return;
        }

        if (StringUtils.isEmpty(extractDirText)) {
            log.error("No extract directory");
            return;
        }

        File ggpkgFile = new File(ggpkgPathText.get());
        if (!ggpkgFile.canRead()) {
            log.error("Could not read '{}'", ggpkgFile.getAbsolutePath());
            return;
        }

        File extractDir = new File(extractDirText.get());
        if (!extractDir.exists()) {
            log.error("Extract directory did not exist");
            return;
        }

        Thread thread = new Thread(new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                Ggpkg ggpkg = ggpkgFactory.load(ggpkgFile);
                ggpkgExtractor.extract(ggpkg, extractDir);

                return null;
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        logView.setItems(ObservableLogAppender.events);

        ggpkgFileTextField.textProperty().bindBidirectional(ggpkgPathText);
        extractDirectoryTextField.textProperty().bindBidirectional(extractDirText);

        Preferences prefs = Preferences.userNodeForPackage(getClass());

        ggpkgPathText.setValue(prefs.get("ggpkgPath", ""));
        extractDirText.setValue(prefs.get("extractDir", ""));

        ggpkgPathText.addListener((observable, oldValue, newValue) -> {
            if (StringUtils.isEmpty(newValue)) {
                prefs.remove("ggpkgPath");
            } else {
                prefs.put("ggpkgPath", newValue);
            }
        });

        extractDirText.addListener((observable, oldValue, newValue) -> {
            if (StringUtils.isEmpty(newValue)) {
                prefs.remove("extractDir");
            } else {
                prefs.put("extractDir", newValue);
            }
        });
    }

    public void browseForGgpkg(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Content.ggpkg");
        File file = fileChooser.showOpenDialog(logView.getScene().getWindow());
        if (file == null) {
            return;
        }

        if (file.exists()) {
            ggpkgPathText.setValue(file.getAbsolutePath());
        } else {
            log.info("File '{}' does not exist", file.getAbsolutePath());
        }
    }

    public void browseForExtractDir(ActionEvent event) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Select Extraction Directory");
        File file = directoryChooser.showDialog(logView.getScene().getWindow());
        if (file == null) {
            return;
        }

        if (file.exists()) {
            extractDirText.setValue(file.getAbsolutePath());
        } else {
            log.info("File '{}' does not exist", file.getAbsolutePath());
        }
    }
}
