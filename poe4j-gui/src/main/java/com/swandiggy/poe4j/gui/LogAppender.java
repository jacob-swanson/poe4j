package com.swandiggy.poe4j.gui;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * @author Jacob Swanson
 * @since 12/10/2015
 */
public class LogAppender extends AppenderBase<ILoggingEvent> {

    public static ObservableList<ILoggingEvent> events = FXCollections.observableArrayList();

    @Override
    protected void append(ILoggingEvent event) {
        events.add(event);

        if (events.size() > 500) {
            events.remove(events.size() - 1);
        }
    }
}
