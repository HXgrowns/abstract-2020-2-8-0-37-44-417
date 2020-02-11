package com;

public class ChildChicken extends Chicken {
    @Override
    public double getPrice() {
        return 1;
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }

}
