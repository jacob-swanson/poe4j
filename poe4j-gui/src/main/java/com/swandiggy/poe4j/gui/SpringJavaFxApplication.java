package com.swandiggy.poe4j.gui;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Jacob Swanson
 * @since 12/10/2015
 */
public abstract class SpringJavaFxApplication extends Application {

    private static String[] launchArgs;
    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
        applicationContext = SpringApplication.run(getClass(), launchArgs);
        applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
    }

    protected static void launchApp(Class<? extends SpringJavaFxApplication> appClass, String[] args) {
        SpringJavaFxApplication.launchArgs = args;
        Application.launch(appClass, args);
    }
}
