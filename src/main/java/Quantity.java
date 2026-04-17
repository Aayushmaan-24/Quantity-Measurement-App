public class Quantity {

    private final double value;
    private final LengthUnit unit;

    public Quantity(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {

        // Same reference
        if (this == obj) return true;

        // Null or different class
        if (obj == null || getClass() != obj.getClass()) return false;

        Quantity other = (Quantity) obj;

        // Convert both to base unit (feet)
        double thisValue = this.unit.toBase(this.value);
        double otherValue = other.unit.toBase(other.value);

        return Double.compare(thisValue, otherValue) == 0;
    }
}