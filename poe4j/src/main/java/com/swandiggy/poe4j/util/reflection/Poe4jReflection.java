package com.swandiggy.poe4j.util.reflection;

import com.swandiggy.poe4j.Poe4jException;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.util.ReflectionUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Simplify some reflection operations to make other code look pretty.
 *
 * @author Jacob Swanson
 * @since 1/15/2016
 */
public class Poe4jReflection {

    /**
     * Create a lazy loaded class.
     *
     * @param superclass Class that you want to lazy load
     * @param callback   Callback to load the target class
     * @return Enhanced class
     */
    public static Object lazyLoad(Class superclass, Callback callback) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(superclass);
        enhancer.setCallback(callback);

        return enhancer.create();
    }

    /**
     * Get a field without worrying about exceptions.
     *
     * @param type  Class to get field on
     * @param value Name of the field
     * @return Field
     */
    public static Field getField(Class<?> type, String value) {
        try {
            return type.getDeclaredField(value);
        } catch (NoSuchFieldException e) {
            throw new Poe4jException(type.getSimpleName() + "." + value + " not found", e);
        }
    }

    /**
     * Read a property value on a class.
     *
     * @param target Object to read property on
     * @param value  Name of property to read
     * @return Property value
     */
    public static Object readProperty(Object target, String value) {
        PropertyDescriptor pd = BeanUtils.getPropertyDescriptor(target.getClass(), value);
        Method getter = pd.getReadMethod();
        return ReflectionUtils.invokeMethod(getter, target);
    }

}
