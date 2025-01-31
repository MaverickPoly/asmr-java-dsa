public class Stack {
    Node top ;
    int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);

        newNode.next = this.top;
        this.top = newNode;
        /* Adds to the end instead of top!
        Node current = this.top;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
         */
        this.size++;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Object peek() {
        if (this.top == null)
            return null;
        return this.top.value;
    }

    public Object pop() {
        this.size--;
        if (this.top == null) {
            return null;
        }
        else {
            Object value = peek();
            this.top = this.top.next;
            return value;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = this.top;
        while (current != null) {
            builder.append(current.value).append(" -> ");
            current = current.next;
        }
        return builder.toString();
    }
}
