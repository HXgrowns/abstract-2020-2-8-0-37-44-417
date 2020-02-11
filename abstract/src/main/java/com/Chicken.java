package com;

public abstract class Chicken {
    public abstract double getPrice();

    public abstract String getType();

    public void buy(double price) {
        System.out.format("%.2f元可以买%s %d只\n", price, this.getType(), (int) (100 / this.getPrice()));
    }
}
