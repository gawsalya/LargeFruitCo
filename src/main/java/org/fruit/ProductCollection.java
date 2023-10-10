package org.fruit;

public interface ProductCollection {

    boolean exists(String name);
    Fruit select (String name);
}
