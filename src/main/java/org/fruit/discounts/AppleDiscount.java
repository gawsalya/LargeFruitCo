package org.fruit.discounts;

import java.util.Map;

public class AppleDiscount {
    Map<String, Integer> allFruits;

    public AppleDiscount(Map<String, Integer> allFruits) {
        this.allFruits = allFruits;
    }

    public Integer discountAmount() {
        if (allFruits.containsKey("Apple")) {
            return allFruits.get("Apple") * 8;
        }
        return 0;
    }

    public String discountString() {
        Integer discount = discountAmount();
        if (discount > 0) {
            return "Apple Discount -" + discountAmount() + "p";
        }
        return "";
    }

}
