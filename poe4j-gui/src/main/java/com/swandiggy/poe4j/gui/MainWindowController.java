package com.swandiggy.poe4j.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import org.springframework.stereotype.Service;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Jacob Swanson
 * @since 12/9/2015
 */
@Service
public class MainWindowController implements Initializable {

    private File currentFile;

    @FXML
    public TextField textField;

    @FXML
    public ListView listView;

    public void extract(ActionEvent event) {
        textField.setText("test");
    }

    public void browse(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Content.ggpkg");
        File file = fileChooser.showOpenDialog(textField.getScene().getWindow());
        if (file != null && file.exists()) {
            textField.setText(file.getAbsolutePath());
            currentFile = file;
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(LogAppender.events);
    }
}
