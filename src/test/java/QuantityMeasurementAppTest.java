import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // 🔹 UC3 + UC4: SAME UNIT EQUALITY

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
    void testEquality_YardToYard_SameValue() {
        Quantity q1 = new Quantity(2.0, LengthUnit.YARD);
        Quantity q2 = new Quantity(2.0, LengthUnit.YARD);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_CmToCm_SameValue() {
        Quantity q1 = new Quantity(2.0, LengthUnit.CENTIMETER);
        Quantity q2 = new Quantity(2.0, LengthUnit.CENTIMETER);

        assertTrue(q1.equals(q2));
    }

    // 🔹 DIFFERENT VALUE TESTS

    @Test
    void testEquality_FeetToFeet_DifferentValue() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(2.0, LengthUnit.FEET);

        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_InchToInch_DifferentValue() {
        Quantity q1 = new Quantity(1.0, LengthUnit.INCH);
        Quantity q2 = new Quantity(2.0, LengthUnit.INCH);

        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_YardToYard_DifferentValue() {
        Quantity q1 = new Quantity(1.0, LengthUnit.YARD);
        Quantity q2 = new Quantity(2.0, LengthUnit.YARD);

        assertFalse(q1.equals(q2));
    }

    // 🔹 CROSS UNIT EQUALITY

    @Test
    void testEquality_FeetToInch_Equivalent() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_YardToFeet_Equivalent() {
        Quantity q1 = new Quantity(1.0, LengthUnit.YARD);
        Quantity q2 = new Quantity(3.0, LengthUnit.FEET);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_YardToInch_Equivalent() {
        Quantity q1 = new Quantity(1.0, LengthUnit.YARD);
        Quantity q2 = new Quantity(36.0, LengthUnit.INCH);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_CmToInch_Equivalent() {
        Quantity q1 = new Quantity(1.0, LengthUnit.CENTIMETER);
        Quantity q2 = new Quantity(0.393701, LengthUnit.INCH);

        assertTrue(q1.equals(q2));
    }

    // 🔹 NON-EQUIVALENT CROSS UNIT

    @Test
    void testEquality_YardToFeet_NotEqual() {
        Quantity q1 = new Quantity(1.0, LengthUnit.YARD);
        Quantity q2 = new Quantity(2.0, LengthUnit.FEET);

        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_CmToFeet_NotEqual() {
        Quantity q1 = new Quantity(1.0, LengthUnit.CENTIMETER);
        Quantity q2 = new Quantity(1.0, LengthUnit.FEET);

        assertFalse(q1.equals(q2));
    }

    // 🔹 REFLEXIVE PROPERTY

    @Test
    void testEquality_SameReference() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);

        assertTrue(q1.equals(q1));
    }

    // 🔹 NULL SAFETY

    @Test
    void testEquality_NullComparison() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);

        assertFalse(q1.equals(null));
    }

    // 🔹 TRANSITIVE PROPERTY

    @Test
    void testEquality_TransitiveProperty() {
        Quantity a = new Quantity(1.0, LengthUnit.YARD);
        Quantity b = new Quantity(3.0, LengthUnit.FEET);
        Quantity c = new Quantity(36.0, LengthUnit.INCH);

        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));
    }

    // 🔹 SYMMETRIC PROPERTY

    @Test
    void testEquality_SymmetricProperty() {
        Quantity a = new Quantity(1.0, LengthUnit.YARD);
        Quantity b = new Quantity(3.0, LengthUnit.FEET);

        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }
}