package edu.berkeley.aep;

import java.util.List;

// Understands to select the best quantity from a list of quantities
public class BestQuantity {

    public static Bestable bestQuantity(List<Bestable> allList){
        Bestable bestQuantityValue = allList.get(0);
        for(Bestable item : allList){
            if (!bestQuantityValue.betterThan(item)) bestQuantityValue = item;
        }
        return bestQuantityValue;

    }

}
