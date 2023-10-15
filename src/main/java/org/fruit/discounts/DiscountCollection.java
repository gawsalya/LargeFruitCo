package org.fruit.discounts;

import org.fruit.Fruit;

import java.util.List;

public interface DiscountCollection {

    boolean canApply(List<Fruit> basket);

    public void getFinalPrice();

}
