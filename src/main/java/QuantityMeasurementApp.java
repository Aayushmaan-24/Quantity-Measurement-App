public class QuantityMeasurementApp {

    static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            // Same reference
            if (this == obj) return true;

            // Null or different class
            if (obj == null || getClass() != obj.getClass()) return false;

            // Type cast
            Feet feet = (Feet) obj;

            // Compare double values safely
            return Double.compare(this.value, feet.value) == 0;
        }
    }
}