package org.fruit.discounts;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CherryDiscountTest {

    Map<String, Integer> fakeFruits() {
        Map<String, Integer> fakeFruit = new HashMap<>();
        fakeFruit.put("Apple", 4);
        fakeFruit.put("Cherry", 10);
        return fakeFruit;
    }

    CherryDiscount fake = new CherryDiscount(fakeFruits());

    @Test
    void testDiscount() {
        assert fake.discountAmount() == 50;
    }

    @Test
    void testDiscountString() {
        assert fake.discountString().equals("Cherry Discount -50p");
    }

    Map<String, Integer> fakeFruitsTwo() {
        Map<String, Integer> fakeFruitTwo = new HashMap<>();
        fakeFruitTwo.put("Apple", 4);
        fakeFruitTwo.put("Cherry", 3);
        return fakeFruitTwo;
    }

    CherryDiscount fakeTwo = new CherryDiscount(fakeFruitsTwo());


    @Test
    void testNoDiscount() {
        assert fakeTwo.discountAmount() == 0;
    }

    @Test
    void testNoDiscountString() {
        assert fakeTwo.discountString().equals("");
    }

    }


