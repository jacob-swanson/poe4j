package com.swandiggy.poe4j.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;

/**
 * @author Jacob Swanson
 * @since 12/10/2015
 */
@Lazy
@EnableCaching
@ComponentScan("com.swandiggy")
@SpringBootApplication
public class App extends Application {

    @Autowired
    private MainWindowController mainWindowController;

    private static String[] launchArgs;
    private static ConfigurableApplicationContext applicationContext;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample.fxml"));
        loader.setController(mainWindowController);
        Parent root = loader.load();
        primaryStage.setTitle("Select Content.ggpkg");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @Override
    public void init() {
        applicationContext = SpringApplication.run(getClass(), launchArgs);
        applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
    }

    public static void main(String[] args) {
        launchArgs = args;
        Application.launch(App.class, args);
    }
}
