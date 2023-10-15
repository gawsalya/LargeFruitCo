package org.fruit.discounts;

public class BigSpend {
    Integer subTotal;

    public BigSpend(Integer subTotal) {
        this.subTotal = subTotal;
    }

    public Integer bigDiscount() {

        return subTotal * 2/100;
    }

    public String bigString() {
        if (bigDiscount() > 0) {
            return "Big Spender Discount -" + bigDiscount() + "p";
        }
        return "";
    }

    //If you spend more than £5 (once all other discounts are taken into account) you get a 2% big spender discount

}
