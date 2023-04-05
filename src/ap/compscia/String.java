package ap.compscia;

/**
 * Implementation of the String class as specified by the AP Computer Science A Java Quick Reference standard.
 * @author  bootsareme
 * @see     java.lang.String
 */
public final class String {

    private final char[] value;

    /**
     * Constructs a new String object that represents the same sequence of characters as str
     * @param str the string to be initialized
     */
    public String(java.lang.String str) {
        this.value = str.toCharArray();
    }

    /**
     * @return the number of characters in a String object
     */
    public int length() {
        return this.value.length;
    }

    /**
     * @param from starting position
     * @param to ending position
     * @return the substring beginning at index from and ending at index to - 1
     */
    public java.lang.String substring(int from, int to) {
        java.lang.String substr = "";
        for (int i = from; i < to; i++)
            substr += this.value[i];
        return substr;
    }

    /**
     * Overloaded substring call.
     * @param from starting position
     * @return the substring from specified beginning to the string's absolute end
     */
    public java.lang.String substring(int from) {
        return this.substring(from, this.length());
    }

    /**
     * @param str the string to find
     * @return the index of the first occurrence of str; -1 if not found
     */
    public int indexOf(String str) {
        int consecutiveMatches = 0;
        int indexOccurrence = -1;
        for (int i = 0; i < this.length() - str.length() + 1; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (this.value[i + j] == str.value[j]) { // if chars match at index
                    consecutiveMatches++; // add to a running total
                    if (indexOccurrence == -1) // do not keep resetting index each time
                        indexOccurrence = i; // note the index
                } else { // if chars do not match, reset all counters
                    consecutiveMatches = 0;
                    indexOccurrence = -1;
                }
                if (consecutiveMatches == str.length())
                    return indexOccurrence;
            }
        }
        return -1;
    }

    /**
     * @param other the string to compare
     * @return true if this is equal to other; returns false otherwise
     */
    public boolean equals(String other) {
        return this.compareTo(other) == 0;
    }

    /**
     * The result is less than 0 if this string sorts before the other,
     * 0 if they are equal, and greater than 0 otherwise.
     * @param other the string to compare
     * @return a value <0 if this is less than other; returns zero if this is equal to other;
     * returns a value >0 if this is greater than other
     */
    public int compareTo(String other) {
        int i = java.lang.Math.min(this.length(), other.length());
        int x = 0, y = 0;
        while (--i >= 0) {
            int result = this.value[x++] - other.value[y++];
            if (result != 0)
                return result;
        }
        return this.length() - other.length();
    }
}
