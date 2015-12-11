package com.swandiggy.poe4j.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

/**
 * @author Jacob Swanson
 * @since 12/10/2015
 */
@Lazy
@SpringBootApplication
public class App extends SpringJavaFxApplication {

    @Autowired
    private MainWindowController mainWindowController;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample.fxml"));
        loader.setController(mainWindowController);
        Parent root = loader.load();
        primaryStage.setTitle("Select Content.ggpkg");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launchApp(App.class, args);
    }
}
