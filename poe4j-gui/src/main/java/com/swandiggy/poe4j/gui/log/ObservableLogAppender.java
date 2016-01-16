package com.swandiggy.poe4j.gui.log;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Jacob Swanson
 * @since 12/10/2015
 */
public class ObservableLogAppender extends AppenderBase<ILoggingEvent> {

    public static ObservableList<ILoggingEvent> events = FXCollections.observableArrayList();

    @Override
    protected void append(ILoggingEvent event) {
        Platform.runLater(() -> {
            events.add(event);

            if (events.size() > 500) {
                events.remove(0);
            }
        });
    }
}
