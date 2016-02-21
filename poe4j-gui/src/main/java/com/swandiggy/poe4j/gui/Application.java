package com.swandiggy.poe4j.gui;

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
public class Application extends javafx.application.Application {

    @Autowired
    private MainWindowController mainWindowController;

    private static String[] launchArgs;
    private static ConfigurableApplicationContext applicationContext;

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainWindowController.setStage(primaryStage);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainwindow.fxml"));
        loader.setController(mainWindowController);
        Parent root = loader.load();
        primaryStage.setTitle("poe4j");
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
        Application.launch(Application.class, args);
    }
}
