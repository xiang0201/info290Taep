package edu.berkeley.aep;

// Understands how to compare arithmetic measurements in different units
public class ArithmeticQuantity extends ScaledQuantity {

    public ArithmeticQuantity(int size, Unit unit) {
        super(size, unit);
    }

    public ScaledQuantity add(ScaledQuantity other) {
        int otherSize = other.unit.convertTo(other.size, unit);
        return new ArithmeticQuantity(size + otherSize, unit);
    }
}