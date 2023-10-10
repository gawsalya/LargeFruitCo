package org.fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitCollection implements ProductCollection{

    public List fruitsList () {
        List<String> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList("Apple", "Orange", "Mango", "Cherry"));
        return fruits;
    }

    @Override
    public boolean exists(String name) {
        List fruits = fruitsList();
        return fruits.contains(name);
    }

    @Override
    public Fruit select(String name) {
        if ("Apple".equalsIgnoreCase(name)) {
            return new Fruit ("Apple", 0.80);
        }
        if ("Orange".equalsIgnoreCase(name)) {
            return new Fruit ("Orange", 0.75);
        }
        if ("Mango".equalsIgnoreCase(name)) {
            return new Fruit ("Mango", 2.50);
        }
        if ("Cherry".equalsIgnoreCase(name)) {
            return new Fruit ("Cherry", 0.24);
        }
        return null;
    }
}
