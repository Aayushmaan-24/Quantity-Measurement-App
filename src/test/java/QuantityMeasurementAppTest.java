import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void testEquality_FeetToFeet_SameValue() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(1.0, LengthUnit.FEET);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_InchToInch_SameValue() {
        Quantity q1 = new Quantity(1.0, LengthUnit.INCH);
        Quantity q2 = new Quantity(1.0, LengthUnit.INCH);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_FeetToInch_Equivalent() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_DifferentValues() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(2.0, LengthUnit.FEET);

        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_NullComparison() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);

        assertFalse(q1.equals(null));
    }

    @Test
    void testEquality_SameReference() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);

        assertTrue(q1.equals(q1));
    }
}