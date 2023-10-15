package org.fruit;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String fruits = input.nextLine();
        String [] splitFruits = fruits.split(" ");

        List<Fruit> toPurchase = new ArrayList<>();
        ProductCollection products = new FruitCollection();

        for (int i = 0; i < splitFruits.length; i++) {
            if (products.exists(splitFruits[i])) {
                toPurchase.add(products.select(splitFruits[i]));
            } else {
                System.out.println("Fruit does not exist");
            }
        }

        ShoppingBasket basket = new ShoppingBasket(toPurchase);
        Map<String, Integer> allItems = basket.allItems();
        allItems.forEach((key, value) -> System.out.println(value + " x " + key));
        System.out.println("Sub-total £" + (float) basket.getTotalPrice()/100);

        basket.getFinalPrice();

    }

}