package org.fruit;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Fruit> options = fruitChoices();

        Scanner input = new Scanner(System.in);
        String fruits = input.nextLine();
        String [] splitFruits = fruits.split(" ");

        List<Fruit> toPurchase = new ArrayList<>();

        for (int i = 0; i < splitFruits.length; i++) {
            if (options.containsKey(splitFruits[i])) {
                toPurchase.add(options.get(splitFruits[i]));
            } else {
                System.out.println("Fruit does not exist");
            }
        }
        ShoppingBasket basket = new ShoppingBasket(toPurchase);
        Map<String, Integer> allItems = basket.allItems();
        allItems.forEach((key, value) -> System.out.println(value + " x " + key));
        System.out.println("Sub-total £" + String.format("%.2f", basket.getTotalPrice()));

        double total = discountPrice(allItems, options);

    }

    public static double discountPrice(Map<String, Integer> items, Map<String, Fruit> fruitOptions) {
        System.out.println(items);
        items.forEach((key,value) -> {
            if (key.equals("Apple")) {
                Fruit temp = (Fruit) fruitOptions.get("Apple");
                double discount = temp.getPrice() * 0.1 * value;
                System.out.println(discount);
            }
        });
        return 0.00;
    }

    //All Apples are currently 10% off
    //If you buy more than 4 cherries you get a 50p discount
    //If you buy 3 or more Mangos you get 1 Apple free
    //If you spend more than £5 (once all other discounts are taken into account) you get a 2% big spender discount

    public static Map fruitChoices() {
        Map<String, Fruit> fruitMap = new HashMap<>();
        fruitMap.put("Apple", new Fruit("Apple", 0.80));
        fruitMap.put("Orange", new Fruit("Orange", 0.75));
        fruitMap.put("Mango", new Fruit("Mango", 2.50));
        fruitMap.put("Cherry", new Fruit("Cherry", 0.24));

        return fruitMap;
    }

}