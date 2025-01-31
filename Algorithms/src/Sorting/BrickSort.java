package Sorting;

public class BrickSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 7, 3, 2, 8, 1, 9};

        System.out.println("Initial Array:");
        for (int el : array) {
            System.out.print(el + " ");
        }

        brick_sort(array);
        System.out.println("Sorted array:");
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    // Brick Sort: First Method
    public static void brick_sort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted  = true;
            for (int i = 0; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
            for (int i = 1; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    // Brick Sort: Second Method
    public static void brick_sort2(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i += 1) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
