package com.swandiggy.poe4j.data.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Reference another row, not by index, but by matching against a value in the referenced row.
 *
 * @author Jacob Swanson
 * @since 1/15/2016
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReferenceOne {
    /**
     * Name of the foreign field.
     */
    String value();

    /**
     * Whether the relation is required. If no value is found an exception will be thrown.
     */
    boolean required() default false;
}
