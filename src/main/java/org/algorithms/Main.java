package org.algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quick sort");

        int[] array = {1, 2415, 567, 4564, 443242, 775, 453, 756745, 34, 64, 342, 7456};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));


    }

    /**
     * Simple quickSort O = n log (n)
     * Space complexity O = log (n)
     * In case when array already sorted O = n^2
     *
     * @param array of digit
     */
    public static void quickSort(int[] array, int start, int end) {

        if (end <= start) {
            return; // base case
        }

        int pivot = partition(array, start, end);

        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    public static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

}