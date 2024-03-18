package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {
    @Test
    public void rectangleWithSideFourShouldHaveAreaSixteen(){
        Rectangle rec1 = new Rectangle(4,4);
        assertEquals(16, rec1.area());
    }

    @Test
    public void squareWithSidesEqualsToFourShouldHaveAreaSixteen(){
        Rectangle square = Rectangle.createSquare(4);
        assertEquals(16, square.area());
    }
}
