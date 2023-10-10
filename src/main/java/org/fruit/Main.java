package org.fruit;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Fruit> options = fruitChoices();

        Scanner input = new Scanner(System.in);
        String fruits = input.nextLine();
        String [] splitFruits = fruits.split(" ");

        List<Fruit> toPurchase = new ArrayList<>();
        ProductCollection products = new FruitCollection();

        for (int i = 0; i < splitFruits.length; i++) {
            if (products.exists(splitFruits[i])) {
                toPurchase.add(options.get(splitFruits[i]));
            } else {
                System.out.println("Fruit does not exist");
            }
        }
        ShoppingBasket basket = new ShoppingBasket(toPurchase);
        Map<String, Integer> allItems = basket.allItems();
        allItems.forEach((key, value) -> System.out.println(value + " x " + key));
        System.out.println("Sub-total £" + String.format("%.2f", basket.getTotalPrice()));


    }

    //All Apples are currently 10% off
    //If you buy more than 4 cherries you get a 50p discount
    //If you buy 3 or more Mangos you get 1 Apple free
    //If you spend more than £5 (once all other discounts are taken into account) you get a 2% big spender discount

    public static Map<String, Fruit> fruitChoices() {
        Map<String, Fruit> fruitMap = new HashMap<>();
        fruitMap.put("Apple", new Fruit("Apple", 0.80));
        fruitMap.put("Orange", new Fruit("Orange", 0.75));
        fruitMap.put("Mango", new Fruit("Mango", 2.50));
        fruitMap.put("Cherry", new Fruit("Cherry", 0.24));

        return fruitMap;
    }

}