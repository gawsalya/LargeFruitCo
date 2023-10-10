package org.fruit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {
    Fruit testFruit = new Fruit ("fake", 0.00);
    @Test
    void apple() {
        assert testFruit.getName().equals("fake");

    }
}