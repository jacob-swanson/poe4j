package com.swandiggy.poe4j.data.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Jacob Swanson
 * @since 1/15/2016
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Reference {
    /**
     * Name of the foreign field.
     *
     * @return
     */
    String value();
}
