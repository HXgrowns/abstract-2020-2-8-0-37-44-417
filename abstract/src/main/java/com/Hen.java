package com;

public class Hen extends Chicken {

    @Override
    public double getPrice() {
        return 3;
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public void buy(double price) {
        System.out.format("%.2f元可以买%s %d只\n", price, this.getType(), (int) (100 / this.getPrice()));
    }
}
