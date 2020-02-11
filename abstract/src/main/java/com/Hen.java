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
}
