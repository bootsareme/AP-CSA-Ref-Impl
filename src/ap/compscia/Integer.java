package ap.compscia;

/**
 * Implementation of the Integer class as specified by the AP Computer Science A Java Quick Reference standard.
 * @author  bootsareme
 * @see     java.lang.Integer
 */
public final class Integer {

    public static final int MAX_VALUE = 2147483647; // signed 32-bit integers cannot exceed 2^31 - 1
    public static final int MIN_VALUE = -2147483648; // signed 32-bit integers cannot go below -2^31

    private final int value; // the private field that contains the integer value

    /**
     * Constructs a new Integer object that represents the specified int value.
     * @param value the primitive integer value
     */
    public Integer(int value) {
        this.value = value;
    }

    /**
     * @return the value of this Integer int
     */
    public int intValue() {
        return this.value;
    }
}
