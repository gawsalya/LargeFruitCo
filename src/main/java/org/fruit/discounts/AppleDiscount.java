package org.fruit.discounts;

import java.util.Map;

public class AppleDiscount {
    Map<String, Integer> allFruits;

    public AppleDiscount(Map<String, Integer> allFruits) {
        this.allFruits = allFruits;
    }

    Integer discountAmount() {
        if (allFruits.containsKey("Apple")) {
            return allFruits.get("Apple") * 8;
        }
        return 0;
    }

    String discountString() {
        Integer discount = discountAmount();
        if (discount > 0) {
            return "Apple Discount -" + discountAmount() + "p";
        }
        return "";
    }

    // discount collection and pass the basket into this

    // class on whether to apply on shopping basket -- return object with amount of money and string
    // apply discount class to acc print and subtract from subtotal

    //All Apples are currently 10% off

}
