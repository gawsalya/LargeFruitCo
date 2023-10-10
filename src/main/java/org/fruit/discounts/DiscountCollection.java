package org.fruit.discounts;

import org.fruit.Fruit;

import java.util.List;

public interface DiscountCollection {

    boolean canApply(List<Fruit> fruityFruits);

    // discount collection and pass the basket into this

    // class on whether or not to apply on shopping basket -- return object with amount of money and string
    // apply discount class to acc print and subtract from subtotal

    //All Apples are currently 10% off
    //If you buy more than 4 cherries you get a 50p discount
    //If you buy 3 or more Mangos you get 1 Apple free
    //If you spend more than £5 (once all other discounts are taken into account) you get a 2% big spender discount

}
