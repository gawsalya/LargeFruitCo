package org.fruit.discounts;

import org.fruit.Fruit;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppleDiscountTest {

    Map<String, Integer> fakeFruits () {
        Map<String, Integer> fakeFruit = new HashMap<>();
        fakeFruit.put("Apple", 4);
        return fakeFruit;
    }

    AppleDiscount fake = new AppleDiscount(fakeFruits());

    @Test
    void testDiscount() {
        assert fake.discountAmount() == 32;
    }

    @Test
    void testDiscountString() {
        assert fake.discountString().equals("Apple Discount -32p");
    }

    Map<String, Integer> fakeFruitsTwo() {
        Map<String, Integer> fakeFruitTwo = new HashMap<>();
        fakeFruitTwo.put("Apple", 0);
        fakeFruitTwo.put("Cherry", 3);
        return fakeFruitTwo;
    }

    AppleDiscount fakeTwo = new AppleDiscount(fakeFruitsTwo());


    @Test
    void testNoDiscount() {
        assert fakeTwo.discountAmount() == 0;
    }

    @Test
    void testNoDiscountString() {
        assert fakeTwo.discountString().equals("");
    }

}