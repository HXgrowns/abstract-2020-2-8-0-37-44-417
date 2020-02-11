package com;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    List<Chicken> chickens = new ArrayList<>();
    chickens.add(new Cock());
    chickens.add(new Hen());
    chickens.add(new ChildChicken());
    for (Chicken chicken : chickens) {
      chicken.buy(100);
    }
  }

}
