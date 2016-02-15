package com.swandiggy.poe4j.data.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark a class as one that maps to a .dat file.
 *
 * @author Jacob Swanson
 * @since 9/5/2015
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DatFile {
    /**
     * Name of the .dat file. Defaults to the name of the class. To have the class a different name of the file, set the
     * file name here. For an example see {@link BaseItemType}.
     */
    String value() default "";
}
