package org.fruit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {
    Fruit testFruit = new Fruit ("fake", 500);
    @Test
    void getFakeName() {
        assert testFruit.getName().equals("fake");
    }

    @Test
    void getFakePrice() {
        assert testFruit.getPrice() == 500;
    }

}