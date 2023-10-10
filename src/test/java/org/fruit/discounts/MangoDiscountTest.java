package org.fruit.discounts;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MangoDiscountTest {


    Map<String, Integer> fakeFruits() {
        Map<String, Integer> fakeFruit = new HashMap<>();
        fakeFruit.put("Apple", 4);
        fakeFruit.put("Cherry", 10);
        fakeFruit.put("Mango", 3);
        return fakeFruit;
    }

    MangoDiscount fake = new MangoDiscount(fakeFruits());

    @Test
    void testDiscount() {
        assert fake.discountAmount() == 80;
    }

    @Test
    void testDiscountString() {
        assert fake.discountString().equals("1 Free Apple -80p");
    }

    Map<String, Integer> fakeFruitsTwo() {
        Map<String, Integer> fakeFruitTwo = new HashMap<>();
        fakeFruitTwo.put("Cherry", 3);
        fakeFruitTwo.put("Mango", 5);
        return fakeFruitTwo;
    }

    MangoDiscount fakeTwo = new MangoDiscount(fakeFruitsTwo());

    @Test
    void testNoDiscount() {
        assert fakeTwo.discountAmount() == 0;
    }

    @Test
    void testNoDiscountString() {
        assert fakeTwo.discountString().equals("");
    }

}


