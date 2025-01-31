package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        final int size = 100;
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = 100 + i;
        }
        System.out.println("Length: " + array.length);
        System.out.println("Content of array:");
        for (int el : array) {
            System.out.print(el + " ");
        }
        int target = 190;
        int index = searchBinary(array, target);
        System.out.printf("\n\nFound %d at index: %d\n", target, index);
    }

    public static int searchBinary(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > target) {
                end = mid;
            } else if (array[mid] < target) {
                start = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
