package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 7, 3, 8, 2, 1, 9, 0};

        System.out.println("Array before sorting:");
        for (int el : array) {
            System.out.print(el + " ");
        }

        selection_sort(array);
        System.out.println("\nArray after being sorted:");
        for(int el : array) {
            System.out.print(el + " ");
        }
    }

    public static void selection_sort(int[] array) {
        // Iterate over the whole array, find the minimum, and swap the current 'i' with it...
        for (int i = 0; i < array.length - 1; i++) {
            int index = i; // Minimum values index
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
