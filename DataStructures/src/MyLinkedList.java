public class MyLinkedList {
    Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void append(Object object) {
        Node newNode = new Node(object);
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

    public void prepend(Object object) {
        this.size++;
        Node newNode = new Node(object);
        newNode.next = this.head;
        this.head = newNode;
    }

    public Object getItem(int index) {
        if (index > this.size - 1 || index < 0) {
            return null;
        }
        int i = 0;
        Node current = this.head;
        while (current != null) {
            if (i == index) {
                return current.value;
            }
            current = current.next;
            i++;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public Object pop() {
        Object val = this.peek();
        if (this.head == null) {
            return null;
        } else if (this.size == 1) {
            this.head = null;
        } else {
            Node current = this.head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        this.size--;
        return val;
    }

    public Object peek() {
        if (this.head == null) {
            return null;
        }
        else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            return current.value;
        }
    }

    public int remove(Object object) {
        if (this.size == 0) {
            return -1;
        }
        else if (this.head.value == object) {
            this.head = this.head.next;
            this.size--;
            return 1;
        }
        else {
            Node current = this.head;
            while (current.next != null) {
                if (current.next.value == object) {
                    current.next = current.next.next;
                    this.size--;
                    return 1;
                }
                current = current.next;
            }
        }
        return -1;
    }

    public int indexOf(Object object) {
        Node current = this.head;
        int i = 0;
        while (current != null) {
            if (current.value == object) {
                return i;
            }
            current = current.next;
            i++;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = this.head;
        while (current != null) {
            builder.append(current.value).append(" -> ");
            current = current.next;
        }
        return builder.toString();
    }
}
