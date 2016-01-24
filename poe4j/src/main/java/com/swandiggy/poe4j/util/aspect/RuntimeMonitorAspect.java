package com.swandiggy.poe4j.util.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * Monitors the runtime of methods annotated with {@link MonitorRuntime}.
 *
 * @author Jacob Swanson
 * @since 9/1/2015
 */
@Slf4j
@Aspect
public class RuntimeMonitorAspect {

    public RuntimeMonitorAspect() {
    }

    @Pointcut("@annotation(monitorRuntime)")
    public void monitorRuntimeMethods(MonitorRuntime monitorRuntime) {
    }

    /**
     * Output the runtime of a method to the log.
     *
     * @param pjp            Join point
     * @param monitorRuntime {@link MonitorRuntime} annotations on the monitored method
     * @return Return value of the monitored method.
     * @throws Throwable
     */
    @Around(value = "monitorRuntimeMethods(monitorRuntime)", argNames = "pjp,monitorRuntime")
    public Object profile(ProceedingJoinPoint pjp, MonitorRuntime monitorRuntime) throws Throwable {
        long start = System.currentTimeMillis();

        Object output = pjp.proceed();

        long elapsed = System.currentTimeMillis() - start;
        log.info(String.format(monitorRuntime.value(), elapsed / 1000.0));

        return output;
    }
}
