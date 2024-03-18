package edu.berkeley.aep;
import java.util.Objects;

public class Chance implements Bestable{
    private double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    public Chance not() {
        return new Chance(1 - probability);
    }
    public Chance and(Chance chanceOther){
        return new Chance(probability * chanceOther.probability);
    }
    public Chance or(Chance chanceOther){
        return this.not().and(chanceOther.not()).not();
    }

    @Override
    public boolean equals(Object otherChance) {
        System.out.println(this.probability);
        System.out.println(((Chance )otherChance).probability);
        if (!(otherChance instanceof Chance)) return false;
        return Double.compare(probability, ((Chance) otherChance).probability) == 0;
    }

    @Override
    public boolean betterThan(Bestable other){
        Chance otherProbability = (Chance) other;
        return probability > otherProbability.probability;
    }


}
