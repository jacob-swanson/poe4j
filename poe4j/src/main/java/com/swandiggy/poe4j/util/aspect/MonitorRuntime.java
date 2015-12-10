package com.swandiggy.poe4j.util.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use this annotations to mark methods to have their runtime monitored by {@link RuntimeMonitorAspect}.
 *
 * @author Jacob Swanson
 * @since 9/1/2015
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MonitorRuntime {
    /**
     * Format string format. The execution time in seconds is passed as the only argument.
     */
    String value() default "Method executed in: %f seconds";
}
