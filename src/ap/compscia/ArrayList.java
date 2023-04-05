package ap.compscia;

/**
 * Implementation of the Math class as specified by the AP Computer Science A Java Quick Reference standard.
 * @author  bootsareme
 * @see     java.util.ArrayList
 */
public class ArrayList<E> {

    private transient E[] data; // transient generic array for storing the elements
    private int size; // number of elements in the list

    /**
     * Construct a new ArrayList with the supplied initial capacity.
     * @param capacity initial capacity of this ArrayList
     * @throws IllegalArgumentException if capacity is negative
     */
    public ArrayList(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException();
        this.data = (E[])new Object[capacity];
    }

    /**
     * Overloaded constructor with default size 16.
     */
    public ArrayList() {
        this(16);
    }

    /**
     * Private utility method that is NOT specified in the Quick Reference;
     * used to help reduce duplicate code and for clarity. Guarantees that this list
     * will have at least enough capacity to hold minCapacity elements. Will grow to
     * max(current * 2, minCapacity) if minCapacity > current.
     * @param minCapacity the minimum guaranteed capacity
     */
    private void ensureCapacity(int minCapacity) {
        int current = this.data.length;
        if (minCapacity > current) {
            E[] newData = (E[]) new Object[java.lang.Math.max(current * 2, minCapacity)];
            System.arraycopy(this.data, 0, newData, 0, this.size);
            this.data = newData;
        }
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        return this.size;
    }

    /**
     * Appends obj to end of list.
     * @param obj the object to be added
     * @return true if successful
     */
    public boolean add(E obj) {
        if (this.size == this.data.length)
            this.ensureCapacity(this.size + 1);
        this.data[this.size++] = obj;
        return true;
    }

    /**
     * Inserts obj at position index, moving elements at position
     * index and higher to the right (adds 1 to their indices) and
     * adds 1 to size.
     * @param index the index to insert
     * @param obj the object to be added
     * @throws IndexOutOfBoundsException if index > size or index < 0
     *
     */
    public void add(int index, E obj) {
        if (index > this.size || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        if (this.size == this.data.length)
            this.ensureCapacity(this.size + 1);
        if (index != size)
            System.arraycopy(this.data, index, this.data, index + 1, this.size - index);
        this.data[index] = obj;
        this.size++;
    }

    /**
     * @param index the index of the element to get
     * @return the element at position index in the list
     * @throws IndexOutOfBoundsException if index > size - 1 or index < 0
     */
    public E get(int index) {
        if (index >= this.size || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        return this.data[index];
    }

    /**
     * Replaces the element at position index with obj.
     * @param index the index of the element to be set
     * @param obj the element to set
     * @return the element formerly at position index
     * @throws IndexOutOfBoundsException if index > size - 1 or index < 0
     */
    public E set(int index, E obj) {
        if (index >= this.size || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        E result = this.data[index];
        this.data[index] = obj;
        return result;
    }

    /**
     * Removes element from position index, moving elements at position
     * index + 1 and higher to the left (subtracts 1 from their indices) and subtracts 1 from size.
     * @param index the index of the element to be removed
     * @return the element formerly at position index
     * @throws IndexOutOfBoundsException if index > size - 1 or index < 0
     */
    public E remove(int index) {
        if (index >= this.size || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        E removed = this.data[index];
        if (index != --this.size)
            System.arraycopy(this.data, index + 1, this.data, index, this.size - index);
        this.data[this.size] = null; // send to garbage collector by releasing pointer
        return removed;
    }
}
