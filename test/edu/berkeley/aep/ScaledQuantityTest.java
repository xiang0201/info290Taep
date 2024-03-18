package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ScaledQuantityTest {
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
        ArithmeticQuantity oneMile = new ArithmeticQuantity(1, Unit.MILES);
        ArithmeticQuantity oneMileInYards = new ArithmeticQuantity(1760, Unit.YARDS);
        assertEquals(oneMile, oneMileInYards);
    }

    @Test
    public void oneTbspShouldEqualTo3tsp(){
        ArithmeticQuantity oneTbsp = new ArithmeticQuantity(1,Unit.TBSP);
        ArithmeticQuantity threeTsp= new ArithmeticQuantity(3,Unit.TSP);
        assertEquals(oneTbsp, threeTsp);
    }

    @Test
    public void oneOzShouldEqualTo2tbsp(){
        ArithmeticQuantity oneOz = new ArithmeticQuantity(1,Unit.OZ);
        ArithmeticQuantity twoTbsp= new ArithmeticQuantity(2,Unit.TBSP);
        assertEquals(oneOz, twoTbsp);
    }

    @Test
    public void eightOzShouldEqualTo1Cup(){
        ArithmeticQuantity oneCup = new ArithmeticQuantity(1,Unit.CUP);
        ArithmeticQuantity eightOz= new ArithmeticQuantity(8,Unit.OZ);
        assertEquals(oneCup, eightOz);
    }

    @Test
    public void threeTbspShouldNotEqualTo1Foot(){
        ArithmeticQuantity threeTbsp = new ArithmeticQuantity(3,Unit.TBSP);
        ArithmeticQuantity oneFoot= new ArithmeticQuantity(1,Unit.FEET);
        assertNotEquals(threeTbsp, oneFoot);
    }

    @Test
    public void twoInchPlus2InchShouldEqualTo4Inch(){
        ArithmeticQuantity twoInch=new ArithmeticQuantity(2,Unit.INCHES);
        ArithmeticQuantity fourInch=new ArithmeticQuantity(4,Unit.INCHES);
        assertEquals(fourInch,twoInch.add(twoInch));
    }

    @Test
    public void twoTbspPlus1OzShouldEqualTo12Tsp(){
        ArithmeticQuantity twoTbsp=new ArithmeticQuantity(2,Unit.TBSP);
        ArithmeticQuantity oneOz=new ArithmeticQuantity(1,Unit.OZ);
        ArithmeticQuantity twelveTsp=new ArithmeticQuantity(12,Unit.TSP);
        assertEquals(twelveTsp,twoTbsp.add(oneOz));
    }

    @Test(expected = RuntimeException.class)
    public void oneFootPlusOneOunceShouldThrowException(){
        ArithmeticQuantity oneFoot = new ArithmeticQuantity(1, Unit.FEET);
        ArithmeticQuantity oneOunce = new ArithmeticQuantity(1, Unit.OZ);
        oneFoot.add(oneOunce);
    }

    @Test
    public void twoHundredTwelveFahrenheitShouldEqualTo100Celsius(){
        ScaledQuantity twoHundredTwelveFahrenheit=new ScaledQuantity(212,Unit.FAHRENHEIT);
        ScaledQuantity oneHundredCelsius=new ScaledQuantity(100,Unit.CELSIUS);
        assertEquals(twoHundredTwelveFahrenheit,oneHundredCelsius);
    }

    @Test
    public void thirtyTwoFahrenheitShouldEqualZeroCelsius() {
        ScaledQuantity thirtyTwoF = new ScaledQuantity(32, Unit.FAHRENHEIT);
        ScaledQuantity zeroC = new ScaledQuantity(0, Unit.CELSIUS);
        assertEquals(thirtyTwoF, zeroC);
    }
}