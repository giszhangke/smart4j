package org.smart4j.framework.bean;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by klovis on 2018/11/19.
 */
@Getter
public class View {
    private String path;

    private Map<String, Object> model;

    private View(String path) {
        this.path = path;
        model = new HashMap<>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

}
