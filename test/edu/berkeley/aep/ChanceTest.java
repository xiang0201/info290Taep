package edu.berkeley.aep;

import org.junit.Test;

import javax.swing.event.ChangeEvent;

import static org.junit.Assert.*;

public class ChanceTest {
    @Test
    public void twoChancesShouldBeEqualToEachOther(){
        var coinToss=new Chance(0.5);
        var anotherCoinToss=new Chance(0.5);
        assertEquals(coinToss,anotherCoinToss);
    }

    @Test
    public void twoDifferentChancesShouldNotBeEqual(){
        var coinToss=new Chance(0.5);
        var diceRoll=new Chance(1.0/6.0);
        assertNotEquals(coinToss,diceRoll);
    }

    @Test
    public void aChanceShouldBeAbleToSayIfAnEventNotHappen(){
        var headsCoinToss =new Chance(0.5);
        var tailsCoinToss = headsCoinToss.not();
        assertEquals(tailsCoinToss, new Chance(0.5));
    }

    @Test
    public void aDiceRollChanceShouldBeAbleToSayIfAnEventNotHappen(){
        var diceRollLandingOn1 =new Chance(1.0/6.0);
        var diceRollNotLandingOn1 = diceRollLandingOn1.not();
        assertEquals(diceRollNotLandingOn1, new Chance(5.0/6.0));
    }

    @Test
    public void testThePossibilityOfTwoEventHappenTogether(){
        var eventA=new Chance(0.6);
        var eventB=new Chance(0.4);
        assertEquals(new Chance(0.6*0.4),eventA.and(eventB));
    }

    @Test
    public void testThePossibilityOfEitherOneOfEventHappen(){
        var eventA=new Chance(0.6);
        var eventB=new Chance(0.4);
        assertEquals(new Chance((0.6+0.4-0.6*0.4)),eventA.or(eventB));
    }

}
