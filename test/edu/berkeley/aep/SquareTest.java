package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void squareWithSidesEqualsToFourShouldHaveAreaSixteen(){
        Rectangle square1 = new Square(4);
        assertEquals(16, square1.area());
    }
}
