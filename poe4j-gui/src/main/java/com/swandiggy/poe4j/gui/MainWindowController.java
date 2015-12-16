package com.swandiggy.poe4j.gui;

import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.rows.AbstractRow;
import com.swandiggy.poe4j.ggpkg.Ggpk;
import com.swandiggy.poe4j.ggpkg.GgpkExtractor;
import com.swandiggy.poe4j.ggpkg.GgpkFactory;
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
import java.util.List;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;

import static java.util.stream.Collectors.toList;

/**
 * @author Jacob Swanson
 * @since 12/9/2015
 */
@Slf4j
@Service
public class MainWindowController implements Initializable {

    @FXML
    public TextField datFileTextField;
    @FXML
    public TextField datExtractDirTextField;

    private StringProperty ggpkPathText = new SimpleStringProperty();
    private StringProperty extractDirText = new SimpleStringProperty();

    private StringProperty datFileText = new SimpleStringProperty();
    private StringProperty datExtractDirText = new SimpleStringProperty();

    @FXML
    private TextField ggpkFileTextField;
    @FXML
    private TextField extractDirectoryTextField;
    @FXML
    private ListView logView;

    @Autowired
    private GgpkFactory ggpkFactory;

    @Autowired
    private GgpkExtractor ggpkExtractor;

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;

    public void extract(ActionEvent event) {
        if (StringUtils.isEmpty(ggpkPathText.get())) {
            log.error("No selected GGPKG file");
            return;
        }

        if (StringUtils.isEmpty(extractDirText.get())) {
            log.error("No extract directory");
            return;
        }

        File ggpkgFile = new File(ggpkPathText.get());
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
                Ggpk ggpk = ggpkFactory.load(ggpkgFile);
                ggpkExtractor.extract(ggpk, extractDir);

                return null;
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        logView.setItems(ObservableLogAppender.events);

        ggpkFileTextField.textProperty().bindBidirectional(ggpkPathText);
        extractDirectoryTextField.textProperty().bindBidirectional(extractDirText);

        datFileTextField.textProperty().bindBidirectional(datFileText);
        datExtractDirTextField.textProperty().bindBidirectional(datExtractDirText);

        Preferences prefs = Preferences.userNodeForPackage(getClass());

        ggpkPathText.setValue(prefs.get("ggpkgPath", ""));
        extractDirText.setValue(prefs.get("extractDir", ""));

        datFileText.setValue(prefs.get("datFilePath", ""));
        datExtractDirText.setValue(prefs.get("datExtractDir", ""));

        ggpkPathText.addListener((observable, oldValue, newValue) -> {
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

        datFileText.addListener((observable, oldValue, newValue) -> {
            if (StringUtils.isEmpty(newValue)) {
                prefs.remove("datFilePath");
            } else {
                prefs.put("datFilePath", newValue);
            }
        });
        datExtractDirText.addListener((observable, oldValue, newValue) -> {
            if (StringUtils.isEmpty(newValue)) {
                prefs.remove("datExtractDir");
            } else {
                prefs.put("datExtractDir", newValue);
            }
        });
    }

    public void browseForGgpk(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Content.ggpk");
        File file = fileChooser.showOpenDialog(logView.getScene().getWindow());
        if (file == null) {
            return;
        }

        if (file.exists()) {
            ggpkPathText.setValue(file.getAbsolutePath());
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

    public void browseForDatFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select *.dat");
        File file = fileChooser.showOpenDialog(logView.getScene().getWindow());
        if (file == null) {
            return;
        }

        if (file.exists()) {
            datFileText.setValue(file.getAbsolutePath());
        } else {
            log.info("File '{}' does not exist", file.getAbsolutePath());
        }
    }

    public void browseForDatExtractDir(ActionEvent event) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Select Extraction Directory");
        File file = directoryChooser.showDialog(logView.getScene().getWindow());
        if (file == null) {
            return;
        }

        if (file.exists()) {
            datExtractDirText.setValue(file.getAbsolutePath());
        } else {
            log.info("File '{}' does not exist", file.getAbsolutePath());
        }
    }

    public void extractDatFile(ActionEvent event) {
        List<AbstractRow> rows = datFileReaderFactory.create(new File(datFileText.get())).read().collect(toList());
        log.info("asdf");
    }
}
