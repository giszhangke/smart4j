package org.smart4j.framework.bean;

import lombok.Getter;
import org.smart4j.framework.util.CastUtil;

import java.util.Map;

/**
 * Created by klovis on 2018/11/19.
 */
@Getter
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

}
