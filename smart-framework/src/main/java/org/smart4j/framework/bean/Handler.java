package org.smart4j.framework.bean;

import lombok.Getter;

import java.lang.reflect.Method;

/**
 * Created by klovis on 2018/11/12.
 */
@Getter
public class Handler {
    private Class<?> controllerClass;
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }
}
