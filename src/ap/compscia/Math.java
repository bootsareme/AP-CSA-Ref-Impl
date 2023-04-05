package ap.compscia;

/**
 * Implementation of the Math class as specified by the AP Computer Science A Java Quick Reference standard.
 * @author  bootsareme
 * @see     java.lang.StrictMath
 */
public final class Math {

    /**
     * @param x int value input
     * @return the absolute value of an int value
     */
    public static int abs(int x) {
        return x < 0 ? -x : x;
    }

    /**
     * Overloaded absolute value method.
     * @param x double value input
     * @return the absolute value of an double value
     */
    public static double abs(double x) {
        return x < 0 ? -x : x;
    }

    /**
     * Mathematical truth: base^exponent = e^(exponent * ln(base)).
     * @param base the base
     * @param exponent the exponent
     * @return the value of the first parameter raised to the power of the second parameter
     */
    public static double pow(double base, double exponent) {
        return java.lang.Math.exp(exponent * java.lang.Math.log(base));
    }

    /**
     * sqrt(x) is defined to be x^0.5
     * @param x the radicand
     * @return the positive square root of a double value
     */
    public static double sqrt(double x) {
        return Math.pow(x, 0.5);
    }

    /**
     * A pseudorandom generator using the seed set to the current time in nanoseconds.
     * This implementation is not cryptographically secure and is predictable.
     * @return a double value greater than or equal to 0.0 and less than 1.0
     */
    public static double random() {
        long seed = (System.nanoTime() ^ 0x5DEECE66DL) & ((1L << 48) - 1);
        int next26 = (int)((seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1) >>> 22);
        int next27 = (int)((seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1) >>> 21);
        return (((long)next26 << 27) + next27) / (double)(1L << 53);
    }
}
