public class DynamicArray {
    Object[] array;
    protected int size = 0;
    int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[this.capacity];

    }

    public void add(Object object) {
        if (this.size == this.capacity) {
            grow();
        }
        this.array[size] = object;
        this.size++;
    }

    public void remove(Object object) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(object)) {
                // Delete this: Move objects from right to left
                for (int j = i; j < this.size - 1; j++)
                    this.array[j] = this.array[j + 1];
                this.size--;
                this.array[this.size] = null;
                if (this.size < this.capacity / 2)
                    shrink();
                return;
            }
        }
    }

    public Object pop() {
        if (this.size == 0)
            return null;
        else {
            Object val = this.array[this.size - 1];
            this.array[this.size - 1] = null;
            this.size--;
            if (this.size < this.capacity / 2)
                shrink();
            return val;
        }
    }

    // Index of object
    public int index(Object object) {
        for (int i = 0; i < this.size; i++)
            if (this.array[i].equals(object))
                return i;
        return -1;
    }

    public void insert(Object object, int index) {
        if (index < 0 || index > this.size) {
            return;
        }

        if (this.size == this.capacity){
            grow();
        }
        for (int i = this.size; i > index; i--)
            this.array[i] = this.array[i - 1];
        this.array[index] = object;
        this.size++;
    }

    public void clear() {
        this.array = new Object[this.capacity];
        this.size = 0;
    }

    public Object valueAt(int index) {
        if (index >= this.size)
            return null;
        return this.array[index];
    }

    public void reverse() {
        for (int i = 0; i < this.size / 2; ++i) {
            Object temp = this.array[i];
            this.array[i] = this.array[this.size - 1 - i];
            this.array[this.size - 1 - i] = temp;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.size; i++) {
            res += this.array[i].toString();
            if (i < this.size - 1) {
                res += ", ";
            }
        }
        return "[" + res + "]";
    }

    protected void grow() {
        int newCapacity = this.capacity * 2;
        Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < this.size; ++i) {
            newArr[i] = this.array[i];
        }
        this.array = newArr;
        this.capacity = newCapacity;
    }

    protected void shrink() {
        int newCapacity = this.capacity / 2;
        Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < this.size; ++i) {
            newArr[i] = this.array[i];
        }
        this.array = newArr;
        this.capacity = newCapacity;
    }
}
