package edu.berkeley.aep;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuantityTest {
    @Test
    public void twelveInchesShouldEqualOneFoot() {
        ArithmeticQuantity twelveInches = new ArithmeticQuantity(12, Unit.INCHES);
        ArithmeticQuantity oneFoot = new ArithmeticQuantity(1, Unit.FEET);
        assertEquals(twelveInches, oneFoot);
    }

    @Test
    public void threeFeetShouldEqualOneYard() {
        ArithmeticQuantity oneYard = new ArithmeticQuantity(1, Unit.YARDS);
        ArithmeticQuantity threeFeet = new ArithmeticQuantity(3, Unit.FEET);
        assertEquals(oneYard, threeFeet);
    }

    @Test
    public void oneMileShouldEqual1760Feet() {
        ArithmeticQuantity oneMile = new ArithmeticQuantity(1, Unit.MILES); // miles
        ArithmeticQuantity oneMileInYards = new ArithmeticQuantity(1760, Unit.YARDS); // yards
        assertEquals(oneMile, oneMileInYards);
    }

    @Test
    public void oneTablespoonShouldEqualThreeTeaspoons() {
        ArithmeticQuantity oneTablespoon = new ArithmeticQuantity(1, Unit.TBSP);
        ArithmeticQuantity threeTeaspoons = new ArithmeticQuantity(3, Unit.TSP);
        assertEquals(oneTablespoon, threeTeaspoons);
    }

    @Test
    public void oneOzShouldEqual2Tbsp() {
        ArithmeticQuantity oneTablespoon = new ArithmeticQuantity(1, Unit.OZ);
        ArithmeticQuantity threeTeaspoons = new ArithmeticQuantity(3, Unit.TBSP);
        assertEquals(oneTablespoon, threeTeaspoons);
    }

    @Test
    public void eightOzShouldEqualOneCup() {
        ArithmeticQuantity oneTablespoon = new ArithmeticQuantity(1, Unit.CUP);
        ArithmeticQuantity threeTeaspoons = new ArithmeticQuantity(8, Unit.OZ);
        assertEquals(oneTablespoon, threeTeaspoons);
    }

    @Test
    public void fourTablespoonsShouldNotEqualOneFoot() {
        ArithmeticQuantity threeTeaspoons = new ArithmeticQuantity(4, Unit.TBSP);
        ArithmeticQuantity oneFoot = new ArithmeticQuantity(1, Unit.FEET);
        assertNotEquals(oneFoot, threeTeaspoons);
    }

    @Test
    public void twoInchesPlusTwoInchesShouldEqualFourInches() {
        ArithmeticQuantity twoInches = new ArithmeticQuantity(2, Unit.INCHES);
        assertEquals(new ArithmeticQuantity(4, Unit.INCHES), twoInches.add(twoInches));
    }

    @Test
    public void twoTablespoonsPlusOneOzShouldEqualTwelveTeaspoons() {
        ArithmeticQuantity twoTablespoons = new ArithmeticQuantity(2, Unit.TBSP);
        ArithmeticQuantity oneOz = new ArithmeticQuantity(1, Unit.OZ);
        assertEquals(new ArithmeticQuantity(12, Unit.TSP), twoTablespoons.add(oneOz));
    }

    @Test
    public void twoHundredAndTwelveFahrenheitShouldEqual100Celsius() {
        ScaledQuantity twoHundredTwelveF = new ScaledQuantity(212, Unit.FAHRENHEIT);
        ScaledQuantity oneHundredC = new ScaledQuantity(100, Unit.CELSIUS);
        assertEquals(twoHundredTwelveF, oneHundredC);
    }

    @Test
    public void thirtyTwoFahrenheitShouldEqualZeroCelsius() {
        ScaledQuantity thirtyTwoF = new ScaledQuantity(32, Unit.FAHRENHEIT);
        ScaledQuantity zeroC = new ScaledQuantity(0, Unit.CELSIUS);
        assertEquals(thirtyTwoF, zeroC);
    }

    @Test
    public void OneOzIsBetterThanThreeTSP() {
        ScaledQuantity OneOz = new ScaledQuantity(1, Unit.OZ);
        ScaledQuantity ThreeTsp = new ScaledQuantity(3, Unit.TSP);
        Assert.assertTrue(OneOz.betterThan(ThreeTsp));
    }

    @Test
    public void HundredCIsBetterThanThirtyTwoF() {
        ScaledQuantity HundredC = new ScaledQuantity(100, Unit.CELSIUS);
        ScaledQuantity ThirtyTwoF = new ScaledQuantity(32, Unit.FAHRENHEIT);
        Assert.assertTrue(HundredC.betterThan(ThirtyTwoF));
    }
}