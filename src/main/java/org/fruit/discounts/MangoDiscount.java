package org.fruit.discounts;

import java.util.Map;

public class MangoDiscount {

    Map<String, Integer> allFruits;

    public MangoDiscount(Map<String, Integer> allFruits) {
        this.allFruits = allFruits;
    }

    Integer discountAmount() {
        if (allFruits.containsKey("Mango") && allFruits.get("Mango") >= 3 && allFruits.containsKey("Apple")) {
            return 80;
        }
        return 0;
    }

    String discountString() {
        Integer discount = discountAmount();
        if (discount > 0 && allFruits.containsKey("Apple")) {
            return "1 Free Apple -" + discountAmount() + "p";
        }
        return "";
    }
    //If you buy 3 or more Mangos you get 1 Apple free

}
