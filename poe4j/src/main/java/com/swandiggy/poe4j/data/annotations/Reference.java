package com.swandiggy.poe4j.data.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Jacob Swanson
 * @since 2/9/2016
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Reference {

    /**
     * Type of reference.
     */
    Class<? extends Number> value() default Long.class;

    /**
     * Number to add to value when loading references.
     */
    long offset() default 0L;

    /**
     * Whether the relation is required. If no value is found an exception will be thrown.
     */
    boolean required() default false;

}
