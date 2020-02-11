package com;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    List<Chicken> chickens = new ArrayList<>();
    chickens.add(new Cock());
    chickens.add(new Hen());
    chickens.add(new ChildChicken());
    for (int i = 0; i < chickens.size(); i++) {
      System.out.format("100元可以买%s %d只\n", chickens.get(i).getType(), (int)(100 / chickens.get(i).getPrice()));
    }
  }

}
