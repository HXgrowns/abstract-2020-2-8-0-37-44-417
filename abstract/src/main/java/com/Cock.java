package com;


public class Cock extends Chicken {
    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }

}
