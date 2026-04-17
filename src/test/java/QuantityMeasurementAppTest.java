import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // 🔹 Feet tests (already exist)

    @Test
    void testFeetEquality_SameValue() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f1.equals(f2));
    }

    // 🔹 NEW: Inches tests

    @Test
    void testInchEquality_SameValue() {
        QuantityMeasurementApp.Inch i1 = new QuantityMeasurementApp.Inch(1.0);
        QuantityMeasurementApp.Inch i2 = new QuantityMeasurementApp.Inch(1.0);

        assertTrue(i1.equals(i2));
    }

    @Test
    void testInchEquality_DifferentValue() {
        QuantityMeasurementApp.Inch i1 = new QuantityMeasurementApp.Inch(1.0);
        QuantityMeasurementApp.Inch i2 = new QuantityMeasurementApp.Inch(2.0);

        assertFalse(i1.equals(i2));
    }

    @Test
    void testInchEquality_NullComparison() {
        QuantityMeasurementApp.Inch i1 = new QuantityMeasurementApp.Inch(1.0);

        assertFalse(i1.equals(null));
    }

    @Test
    void testInchEquality_SameReference() {
        QuantityMeasurementApp.Inch i1 = new QuantityMeasurementApp.Inch(1.0);

        assertTrue(i1.equals(i1));
    }
}