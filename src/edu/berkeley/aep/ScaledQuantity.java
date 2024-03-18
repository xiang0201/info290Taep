package edu.berkeley.aep;

public class ScaledQuantity implements Bestable {
    protected final int size;
    protected final Unit unit;


    public ScaledQuantity(int size, Unit unit) {
        this.size = size;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return size + " " + unit;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof ScaledQuantity otherQuantity)) return false;
        if (!isComparableTo(otherQuantity)) return false;
        return otherQuantity.unit.convertTo(otherQuantity.size, unit) == size;
    }

    @Override
    public boolean betterThan(Bestable other){
        ScaledQuantity otherQuantity = (ScaledQuantity) other;
        int otherSize = otherQuantity.unit.convertTo(otherQuantity.size, unit);
        return size > otherSize;
    }

    private boolean isComparableTo(ScaledQuantity other) {
        return unit.isComparableTo(other.unit);
    }
}