package org.fruit.discounts;

public class BigSpend {
    Integer subTotal;

    Integer bigDiscount (Integer subTotal) {
        return subTotal * 100 / 2;
    }

    //If you spend more than £5 (once all other discounts are taken into account) you get a 2% big spender discount

}
