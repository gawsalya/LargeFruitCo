package org.fruit.discounts;

import java.util.Map;

public class CherryDiscount {
    Map<String, Integer> allFruits;

    public CherryDiscount(Map<String, Integer> allFruits) {
        this.allFruits = allFruits;
    }

    public Integer discountAmount() {
        if (allFruits.containsKey("Cherry") && allFruits.get("Cherry") > 4) {
            return 50;
        }
        return 0;
    }

    public String discountString() {
        Integer discount = discountAmount();
        if (discount > 0) {
            return "Cherry Discount -" + discountAmount() + "p";
        }
        return "";
    }
}

//If you buy more than 4 cherries you get a 50p discount