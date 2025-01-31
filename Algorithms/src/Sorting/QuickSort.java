package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 1, 2, 3, 4, 6, 5, 0};

        System.out.println("Initial Array:");
        for (int number : array) {
            System.out.print(number + " ");
        }

        quickSort(array, 0, array.length - 1);
        System.out.println("\n\nSorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    protected static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int index = start - 1;
        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                index++;
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
        index++;
        int temp = array[index];
        array[index] = array[end];
        array[end] = temp;
        return index;
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int part = partition(array, start, end);
            quickSort(array, start, part - 1);
            quickSort(array, part + 1, end);
        }
    }
}
