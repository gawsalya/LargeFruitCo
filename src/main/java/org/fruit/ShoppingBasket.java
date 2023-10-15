package org.fruit;

import org.fruit.discounts.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingBasket implements DiscountCollection {
    List<Fruit> basket;

    public ShoppingBasket(List<Fruit> basket) {
        this.basket = basket;
    }

    public Integer getTotalPrice() {
        Integer price = 0;
        for (int i = 0; i < basket.size(); i++) {
            Fruit tempFruit = basket.get(i);
            price += tempFruit.getPrice();
        }
        return price;
    }

    public Integer getDiscountedPrice() {
        Integer finalPrice = getTotalPrice();
        Map<String,Integer> itemsInBasketCount = allItems();
        MangoDiscount mangoDis = new MangoDiscount(itemsInBasketCount);
        if (mangoDis.discountAmount() != 0) {
            System.out.println(mangoDis.discountString());
        }
        AppleDiscount applesDis = new AppleDiscount(itemsInBasketCount);
        if (applesDis.discountAmount() != 0) {
            System.out.println(applesDis.discountString());
        }
        CherryDiscount cherryDis = new CherryDiscount(itemsInBasketCount);
        if (cherryDis.discountAmount() != 0) {
            System.out.println(cherryDis.discountString());
        }
        finalPrice = finalPrice - applesDis.discountAmount() - cherryDis.discountAmount() - mangoDis.discountAmount();

        if (finalPrice > 500) {
            BigSpend spendDis = new BigSpend(finalPrice);
            finalPrice = finalPrice - spendDis.bigDiscount();
            System.out.println(spendDis.bigString());
        }
        return finalPrice;
    }

    public Map<String,Integer> allItems() {
        Map<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < basket.size(); i++) {
            Fruit tempFruit = basket.get(i);
            if (countMap.containsKey(tempFruit.getName())) {
                countMap.put(tempFruit.getName(), countMap.get(tempFruit.getName()) + 1);
            } else {
                countMap.put(tempFruit.getName(), 1);
            }
        }
        return countMap;
    }

    @Override
    public boolean canApply(List<Fruit> basket) {
        Map<String,Integer> itemsInBasketCount = allItems();
        if (itemsInBasketCount.containsKey("Apple") ||  getTotalPrice() > 500 || (itemsInBasketCount.containsKey("Cherry") && itemsInBasketCount.get("Cherry") > 4) || (itemsInBasketCount.containsKey("Mango") && itemsInBasketCount.get("Mango") > 2)) {
            return true;
        }
        return false;
    }

    @Override
    public void getFinalPrice() {
        if (canApply(basket)) {
            System.out.println("");
            System.out.println("Discounts");
            float finalAmount = (float) getDiscountedPrice()/100;
            System.out.println("");
            System.out.println("Total £" + finalAmount);
        } else {
            System.out.println("");
            System.out.println("Total £" + (float) getTotalPrice()/100);
        }
    }

}
