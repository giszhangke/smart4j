package org.smart4j.chapter2.service;

import lombok.Data;
import org.junit.Test;

/**
 * Created by klovis on 2018/10/23.
 */
public class testGeneric {
    interface Fruit {

    }
    @Data
    private class Apple implements Fruit {
        private int size;
        private String color;
    }

    @Data
    private class Pie<T extends Fruit> {
        private T fruit;
    }

    @Test
    public void testGetGenericType () {
        System.out.println(new Pie<Apple>().getClass().getTypeParameters()[0].getClass());
    }
}
