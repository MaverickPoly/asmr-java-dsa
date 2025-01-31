package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 6, 8, 7, 4, 3, 2, 1, 0};
        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        insertionSort(array);
        System.out.println("\nSorted array!");
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int value = array[i];
            int j = i - 1;

            while (j >= 0 && value < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = value;
        }
    }
}
