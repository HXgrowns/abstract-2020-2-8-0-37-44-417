package com;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Cock cock = new Cock();
        buy(100, cock);
        Hen hen = new Hen();
        buy(100, hen);
        ChildChicken childChicken = new ChildChicken();
        buy(100, childChicken);
    }

    public static void buy(double price, Chicken chicken) {
        System.out.format("%.2f元可以买%s %d只\n", price, chicken.getType(), (int) (100 / chicken.getPrice()));
    }

}
