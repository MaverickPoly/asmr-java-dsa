package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 6, 4, 3, 7, 8, 2, 9, 1};

        System.out.println("Initial array:");
        for (int el : array) {
            System.out.print(el + " ");
        }

        bubble_sort(array);
        System.out.println("\nSorted array:");
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    public static void bubble_sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                return;
        }
    }
}
