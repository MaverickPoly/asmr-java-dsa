public class Main {
    public static void main(String[] args) {
        // -- 1. Dynamic Array
        // testDynamicArray();

        // -- 2. Stack
        // testStack();

        // -- 3. Queue
        // testQueue();

        // -- 4. Linked List
        // testLL();

        // -- 5. HashMap
        // testsHashMap();
    }

    public static void testDynamicArray() {
        DynamicArray dynamicArray = new DynamicArray(10);
        System.out.println("Is Empty: " + dynamicArray.isEmpty());

        dynamicArray.add("Hello");
        dynamicArray.add("World");
        dynamicArray.add(29);
        dynamicArray.add(3.14);
        dynamicArray.add('$');
        dynamicArray.add('!');
        dynamicArray.add("Programmer");
        System.out.println("Is Empty: " + dynamicArray.isEmpty());
        System.out.println(dynamicArray.valueAt(1));
        dynamicArray.remove(29);
        dynamicArray.remove(30);
        System.out.println(dynamicArray.valueAt(2));
        System.out.println(dynamicArray.pop());
        System.out.println("Index of $: " + dynamicArray.index('$'));
        System.out.println("Index of name: " + dynamicArray.index("name"));
        System.out.println(dynamicArray);

        dynamicArray.clear();
        System.out.println(dynamicArray);
        dynamicArray.add(2025);
        dynamicArray.add(2009);
        dynamicArray.add(2029);
        dynamicArray.insert(2010, 2);
        dynamicArray.add(2030);
        dynamicArray.add(2031);
        dynamicArray.add(2032);
        dynamicArray.add(2033);
        dynamicArray.add(2034);
        dynamicArray.add(2035);
        dynamicArray.add(2036);
        dynamicArray.add(2037);
        dynamicArray.add(2038);
        dynamicArray.add(2039);
        System.out.println("Capacity: " + dynamicArray.capacity);
        dynamicArray.pop();
        dynamicArray.pop();
        dynamicArray.pop();
        dynamicArray.pop();
        dynamicArray.pop();
        System.out.println("Capacity: " + dynamicArray.capacity);

        System.out.println(dynamicArray);
        dynamicArray.reverse();
        System.out.println(dynamicArray);
    }

    public static void testStack() {
        Stack stack = new Stack();
        System.out.println("Size: " + stack.getSize());
        stack.peek();
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println(stack.peek());
        stack.add("Hello");
        stack.add("Java!");
        stack.add(2029);
        stack.add("Programmer");
        System.out.println("Size: " + stack.getSize());
        System.out.println(stack);

        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop()); System.out.println(stack.pop());
        System.out.println("Size: " + stack.getSize());

        System.out.println(stack);
    }

    public static void testQueue() {
        Queue queue = new Queue();
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.getSize());

        queue.push("Python");
        queue.push("Java");
        queue.push("JavaScript");
        queue.push("Dart");
        queue.push("C++");
        queue.push("Go");

        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.getSize());

        System.out.println("Peek: " + queue.peek());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());

        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.getSize());

        System.out.println(queue);

        queue.clear();
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.getSize());
        System.out.println(queue);
    }

    public static void testLL() {
        MyLinkedList ll = new MyLinkedList();
        System.out.println("Size: " + ll.getSize());
        System.out.println("Is Empty: " + ll.isEmpty());
        ll.append("Hello");
        ll.append("World");
        ll.append(2029);
        ll.append(3.14);
        ll.append(2.71);
        ll.prepend('$');
        System.out.println("Size: " + ll.getSize());
        System.out.println(ll);
        System.out.println("Pop: " + ll.pop());
        System.out.println("Pop: " + ll.pop());
        System.out.println("Peek: " + ll.peek());
        System.out.println("Item: " + ll.getItem(2));
        System.out.println("Item: " + ll.getItem(3));
        System.out.println("Item: " + ll.getItem(8));
        System.out.println("Remove: " + ll.remove("World"));
        System.out.println("Index: " + ll.indexOf(2029));
        System.out.println("Index: " + ll.indexOf('$'));
        System.out.println("Index: " + ll.indexOf("Java"));

        System.out.println("Size: " + ll.getSize());
        System.out.println("Is Empty: " + ll.isEmpty());

        System.out.println(ll);
    }

    public static void testsHashMap() {
        MyHashMap map = new MyHashMap(10);
        map.put("name", "John");
        map.put("age", 25);
        map.put("city", "Dubai");

        System.out.println("Size: " + map.size());
        System.out.println("Contains name: " + map.contains("name"));
        System.out.println("\nKeys: ");
        for (Object key : map.keys()) {
            System.out.print(key + " ");
        }

        System.out.println("\nValues: ");
        for (Object value : map.values()) {
            System.out.print(value + " ");
        }

        System.out.println("\nItems: ");
        for (Object[] item : map.items()) {
            System.out.println(item[0] + ": " + item[1]);
        }

        map.remove("age");
        System.out.println("\nItems: ");
        for (Object[] item : map.items()) {
            System.out.println(item[0] + ": " + item[1]);
        }
        System.out.println("Size after removal: " + map.size());
    }
}
