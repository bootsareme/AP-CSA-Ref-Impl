package ap.compscia;

/**
 * Implementation of the Double class as specified by the AP Computer Science A Java Quick Reference standard.
 * @author  bootsareme
 * @see     java.lang.Double
 */
public final class Double {

    private final double value; // private field that holds the double value

    /**
     * Constructs a new Double object that represents the specified double value.
     * @param value the primitive double value
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
}
