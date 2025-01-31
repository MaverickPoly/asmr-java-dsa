package Searching;

public class Linear {
    public static void main(String[] args) {
        Object[] array = {"Hello", "World", 3.1415, 2029, '$', "Java"};
        int target = 2029;
        int index = linearSearch(array, (Object)target);
        System.out.printf("Found %s at index %d\n", target, index);
    }

    public static int linearSearch(Object[] array, Object target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target))
                return i;
        }
        return -1;
    }
}
