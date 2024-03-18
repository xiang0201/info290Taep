package edu.berkeley.aep;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BestQuantityTest {

    @Test
    public void fiveTspIsBestOutOfOneTwoThreeTsp() {
        Bestable fiveTsp = new ScaledQuantity(5, Unit.TSP);
        Bestable OneTsp = new ScaledQuantity(1, Unit.TSP);
        Bestable TwoTsp = new ScaledQuantity(2, Unit.TSP);
        Bestable ThreeTsp = new ScaledQuantity(3, Unit.TSP);
        List<Bestable> allList = List.of(fiveTsp,OneTsp,TwoTsp,ThreeTsp);
        assertEquals(fiveTsp, BestQuantity.bestQuantity(allList));
    }

    @Test
    public void OneChanceIsBestOutOfHalfAndQuarter() {
        Bestable One = new Chance(1.0);
        Bestable Half = new Chance(0.5);
        Bestable Quarter = new Chance(0.25);
        List<Bestable> allList = List.of(One, Half,Quarter);
        assertEquals(One, BestQuantity.bestQuantity(allList));
    }
    
}
