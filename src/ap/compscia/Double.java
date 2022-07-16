package ap.compscia;

/**
 * Implementation of the Double class as specified by the AP Computer Science A Java Quick Reference standard.
 * @author  bootsareme
 * @see     java.lang.Double
 */
public class Double {

    private double value; // private field that holds the double value

    /**
     * Constructs a new Double object that represents the specified double value
     * @param value the primitive double value.
     */
    public Double(double value) {
        this.value = value;
    }

    /**
     * @return the value of this Double as a double
     */
    public double doubleValue() {
        return this.value;
    }

    /**
     * Overrides java.lang.Object.toString() as it prints the object's hashcode by default
     * @return String representation of a Double
     */
    @Override
    public String toString() {
        return this.value + "";
    }

    /**
     * Overrides java.lang.Object.equals()
     * @return true if the other Double equals this Double; returns false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) // objects' classes must match in order to compare
            return false;
        /* must cast, because overriden method signature does not specify WHICH object type */
        return this.value == ((ap.compscia.Double)other).value;
    }
}
