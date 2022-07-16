package ap.compscia;

/**
 * Implementation of the Integer class as specified by the AP Computer Science A Java Quick Reference standard.
 * @author  bootsareme
 * @see     java.lang.Integer
 */
public class Integer {

    public static final int MAX_VALUE = 2147483647; // signed 32-bit integers cannot exceed 2^31 - 1
    public static final int MIN_VALUE = -2147483648; // signed 32-bit integers cannot go below -2^31

    private final int value; // the private field that contains the integer value

    /**
     * Constructs a new Integer object that represents the specified int value
     * @param value the primitive integer value.
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

    /**
     * Overrides java.lang.Object.toString() as it prints the object's hashcode by default
     * @return String representation of an Integer
     */
    @Override
    public String toString() {
        return this.value + "";
    }

    /**
     * Overrides java.lang.Object.equals()
     * @return true if the other Integer equals this Integer; returns false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) // objects' classes must match in order to compare
            return false;
        /* must cast, because overriden method signature does not specify WHICH object type */
        return this.value == ((ap.compscia.Integer)other).value;
    }
}
