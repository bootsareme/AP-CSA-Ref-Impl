# AP Computer Science A Java Quick Reference Implementations

This library contains implementations for the AP Computer Science A Java Quick Reference as specified by College Board. As of 2022, the standard is defined as follows:

| Class Constructors and Methods | Explanation |
| --- | --- |
| `String(String str)` | Constructs a new `String` object that represents the same sequence of characters as `str` |
| `int length()` | Returns the number of characters in a `String` object
| `String substring(int from, int to)` | Returns the substring beginning at index `from` and ending at index `to - 1`
| `String substring(int from)` | Returns `substring(from, length())`
| `int indexOf(String str)` | Returns the index of the first occurrence of `str`; returns `-1` if not found
| `boolean equals(String other)` | Returns `true` if `this` is equal to `other`; returns `false` otherwise
| `int compareTo(String other)` | Returns a value `<0` if `this` is less than `other`; returns zero if `this` is equal to `other`; returns a value `>0` if `this` is greater than `other`
| `Integer(int value)` | Constructs a new `Integer` object that represents the specified `int` value
| `Integer.MIN_VALUE` | The minimum value represented by an `int` or `Integer`
| `Integer.MAX_VALUE` | The maximum value represented by an `int` or `Integer`
| `int intValue()` | Returns the value of this `Integer` as an `int`
| `Double(double value)` | Constructs a new `Double` object that represents the specified `double` value
| `double doubleValue()` | Returns the value of this `Double` as a `double`
| `static int abs(int x)` | Returns the absolute value of an `int` value
| `static double abs(double x)` | Returns the absolute value of an `double` value
| `static double pow(double base, double exponent)` | Returns the value of the first parameter raised to the power of the second parameter
| `static double sqrt(double x)` | Returns the positive square root of a `double` value
| `static double random()` | Returns a double value greater than or equal to `0.0` and less than `1.0`
| `int size()` | Returns the number of elements in the list
| `boolean add(E obj)` | Appends `obj` to end of list; returns `true`
| `void add(int index, E obj)` | Inserts `obj` at position `index (0 <= index <= size)`, moving elements at position `index` and higher to the right (adds 1 to their indices) and adds 1 to size
| `E get(int index)` | Returns the element at position `index` in the list
| `E set(int index, E obj)` | Replaces the element at position `index` with `obj`; returns the element formely at position `index`
| `E remove(int index)` | Removes element from position `index`, moving elements at position `index + 1` and higher to the left (subtracts 1 from their indices) and subtracts 1 from size; returns the element formely at position `index`

## Implementation Details

As the Quick Reference already uses Java's standard library as its foundation, this library serves no practical purpose outside the teaching environment. Its creation is meant for educators and students to learn about the implementations of frequently discussed concepts in the Advanced Placement Computer Science A curriculum.
- ❌ IT IS NOT: a wrapper for Java's standard library.
- ❌ IT IS NOT: an efficient or highly-optimized library; use Java's standard library for all practical purposes.
- ❌ IT DOES NOT: contain all the methods for specified classes. (ONLY contains the methods listed in the Quick Reference; for example, this `String` class doesn't have `char charAt(int index)`.)
- ❌ IT DOES NOT: follow enterprise documentation conventions; it is merely a teaching tool.
- ✔️IT DOES: allow learners to explore the inner-workings of common Java functions without cluttered boilerplate code.
- ✔️IT DOES: actually work! The implmentation behaves according to the Quick Reference and is fully tested with AP Free Response Questions and custom-defined objectives.
- ✔️IT DOES: balance time and space complexity with the difficulty of algorithms. (Maybe not the most efficient, but very easy to understand.)

Every method will be furnished with comments and documentation and the implementation will always be the most intuitive and simple to grasp, although the implementations are NOT reflective of Java's official implementations. The goal is to provide accurate and simple implementations for learners who may feel daunted when looking at Java's source code.

## How To Use
Download the JAR library in the "Releases" section and add it as an external JAR reference to start using the library. Ways of importing the JAR may differ between IDEs, so please search up how to import a JAR library as your mileage may vary. Except for the `ArrayList` class, all other classes are defined in `java.lang`, which may cause confusion in naming. To prevent this ambiguity, the recommended way of defining all objects is as follows:

```java
import ap.compscia.ArrayList; // only ArrayList can be imported

public class Example {
    
    public static void main(String[] args) {
        ArrayList<E> arrayList = new ArrayList<E>(); // refers to ap.compscia.ArrayList
        Integer someInt = 59; // this refers to java.lang.Integer
        ap.compscia.Integer someApInt = ap.compscia.Integer(59); // different from Java's built-in Integer wrapper class
        Double someDouble = 495.5; // this refers to java.lang.Double
        ap.compscia.Double someApDouble = ap.compscia.Double(495.5); // different from Java's built-in Double wrapper class
    }
}
```