package com;

public abstract class Chicken {
    public abstract double getPrice();

    public String getType() {
        return getClass().getSimpleName();
    }
}
