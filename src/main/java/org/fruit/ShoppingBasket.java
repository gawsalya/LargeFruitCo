package org.fruit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingBasket {
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
}
