public class Queue {
    Node head;
    protected int size;

    public Queue() {
        this.head = null;
        this.size = 0;
    }

    public void push(Object value) {
        Node newNode = new Node(value);
        this.size++;
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // First Value, Start
    public Object peek() {
        if (this.head == null) {
            return null;
        } else {
            return this.head.value;
        }
    }

    public int getSize() {
        return size;
    }

    public Object pop() {
        this.size--;
        if (this.head == null) {
            return null;
        } else {
            Object value = peek();
            this.head = this.head.next;
            return value;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = this.head;
        while (current != null) {
            builder.append(current.value).append(" <- ");
            current = current.next;
        }
        return builder.toString();
    }
}
