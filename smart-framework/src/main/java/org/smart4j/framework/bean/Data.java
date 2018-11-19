package org.smart4j.framework.bean;

import lombok.Getter;

/**
 * Created by klovis on 2018/11/19.
 */
@Getter
public class Data {
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

}
