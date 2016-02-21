package com.swandiggy.poe4j.gui;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.config.Poe4jProperties;
import com.swandiggy.poe4j.data.DatFileLookup;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.ggpkg.Ggpk;
import com.swandiggy.poe4j.ggpkg.GgpkExtractor;
import com.swandiggy.poe4j.ggpkg.GgpkFactory;
import com.swandiggy.poe4j.gui.log.ObservableLogAppender;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import lombok.Data;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;

import static java.util.stream.Collectors.toList;

/**
 * Created by Jacob on 2/20/2016.
 */
@Slf4j
@Service
public class MainWindowController implements Initializable {

    private Preferences prefs = Preferences.userNodeForPackage(Application.class);

    @FXML
    private TextField ggpkPathTextField;

    @FXML
    private TextField ggpkExtractDirectoryTextField;

    @FXML
    private ComboBox dataClassComboBox;

    @FXML
    private TabPane tabPane;

    @FXML
    private TextArea dataFileText;

    @FXML
    private ListView logView;

    private ListChangeListener logViewChangeListener = new ListChangeListener() {
        @Override
        public void onChanged(Change c) {
            if (logView == null) {
                return;
            }

            log.debug("Scrolling to {}", ObservableLogAppender.events.size());
            logView.scrollTo(ObservableLogAppender.events.size());
        }
    };

    @Autowired
    private Poe4jProperties poe4jProperties;

    @Autowired
    private GgpkFactory ggpkFactory;

    @Autowired
    private GgpkExtractor ggpkExtractor;

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;

    private ObjectMapper objectMapper = new ObjectMapper();

    private boolean scrollToEnd = true;

    @Setter
    private Window stage;

    @Data
    private class DatClass {
        private String name;
        private Class value;

        @Override
        public String toString() {
            return name;
        }
    }

    private ObservableList<DatClass> dataClasses = FXCollections.observableArrayList();

    @SuppressWarnings("unchecked")
    private void storePrefsFor(TextField field) {
        field.textProperty().setValue(prefs.get(field.getId(), null));
        field.textProperty().addListener(((observable, oldValue, newValue) -> {
            prefs.put(field.getId(), newValue);
        }));
    }

    private Runnable exLog(Runnable r) {
        return () -> {
            try {
                r.run();
            } catch (Exception e) {
                log.error("Exception occurred in runnable {}", e);
                throw e;
            }
        };
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        logView.setItems(ObservableLogAppender.events);
        ObservableLogAppender.events.addListener(logViewChangeListener);

        ggpkPathTextField.textProperty().addListener(((observable, oldValue, newValue) -> {
            poe4jProperties.setGgpk(newValue);
        }));
        storePrefsFor(ggpkPathTextField);

        if (StringUtils.isEmpty(ggpkPathTextField.textProperty().get())) {
            for (String path : poe4jProperties.getGgpkLocations()) {
                File file = new File(path);
                if (file.exists()) {
                    ggpkPathTextField.textProperty().set(path);
                }
            }
        }

        storePrefsFor(ggpkExtractDirectoryTextField);

        DatFileLookup.ROW_CLASSES.entrySet().stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .map(entry -> {
                    DatClass datClass = new DatClass();
                    datClass.setName(entry.getKey());
                    datClass.setValue(entry.getValue());

                    return datClass;
                }).forEach(entry -> dataClasses.add(entry));

        dataClassComboBox.setItems(dataClasses);
        dataClassComboBox.getSelectionModel().select(prefs.getInt(dataClassComboBox.getId(), 0));
        dataClassComboBox.valueProperty().addListener(((observable) -> {
            prefs.putInt(dataClassComboBox.getId(), dataClassComboBox.getSelectionModel().getSelectedIndex());
        }));

        tabPane.getSelectionModel().select(prefs.getInt("tabPane", 0));
        tabPane.getSelectionModel().selectedIndexProperty().addListener(observable -> {
            prefs.putInt("tabPane", tabPane.getSelectionModel().getSelectedIndex());
        });
    }

    public void browseForGgpk(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Content.ggpk");
        File file = fileChooser.showOpenDialog(stage);
        if (file == null) {
            return;
        }

        if (file.exists()) {
            ggpkPathTextField.setText(file.getAbsolutePath());
        } else {
            log.info("File '{}' does not exist", file.getAbsolutePath());
        }
    }

    public void browseForGgpkFolder(ActionEvent event) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Select Extracted Content.ggpk Directory");
        File file = directoryChooser.showDialog(stage);
        if (file == null) {
            return;
        }

        if (file.exists()) {
            ggpkPathTextField.setText(file.getAbsolutePath());
        } else {
            log.info("File '{}' does not exist", file.getAbsolutePath());
        }
    }

    public void browseForGgpkExtractDir(ActionEvent event) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Select Directory to Extract to");
        File file = directoryChooser.showDialog(stage);
        if (file == null) {
            return;
        }

        if (file.exists()) {
            ggpkExtractDirectoryTextField.setText(file.getAbsolutePath());
        } else {
            log.info("File '{}' does not exist", file.getAbsolutePath());
        }
    }

    public void extractGgpk(ActionEvent event) {
        File ggpkgFile = new File(ggpkPathTextField.textProperty().get());
        if (!ggpkgFile.canRead()) {
            log.error("Could not read '{}'", ggpkgFile.getAbsolutePath());
            return;
        }

        File extractDir = new File(ggpkExtractDirectoryTextField.textProperty().get());
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

    public void loadData(ActionEvent event) {
        Thread thread = new Thread(exLog(() -> {
            List<BaseRow> rows = datFileReaderFactory.createUnsafe(((DatClass) dataClassComboBox.getSelectionModel().getSelectedItem()).getValue()).read().collect(toList());
            try {
                String text = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rows);
                Platform.runLater(exLog(() -> dataFileText.setText(text)));
            } catch (JsonProcessingException e) {
                throw new Poe4jException("Could not write JSON", e);
            }
        }));
        thread.setDaemon(true);
        thread.start();
    }

    public void copyDataToClipboard(ActionEvent event) {
        ClipboardContent content = new ClipboardContent();
        content.putString(dataFileText.getText());
        Clipboard.getSystemClipboard().setContent(content);

        log.info("Copied into clipboard");
    }

    public void saveDataAsFile(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Data");
        fileChooser.setInitialFileName(((DatClass) dataClassComboBox.getSelectionModel().getSelectedItem()).getName() + ".json");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("JSON file", "json"));

        File file = fileChooser.showSaveDialog(stage);
        if (file == null) {
            return;
        }

        List<BaseRow> rows = datFileReaderFactory.createUnsafe(((DatClass) dataClassComboBox.getSelectionModel().getSelectedItem()).getValue()).read().collect(toList());
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, rows);
    }

    public void toggleScrollToEnd(ActionEvent event) {
        scrollToEnd = !scrollToEnd;

        if (scrollToEnd) {
            ObservableLogAppender.events.addListener(logViewChangeListener);
        } else {
            ObservableLogAppender.events.removeListener(logViewChangeListener);
        }
    }
}
