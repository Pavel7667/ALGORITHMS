package org.algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insertion sort");

        int[] array = {1, 2415, 567, 4564, 443242, 775, 453, 756745, 34, 64, 342, 7456};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));


    }

    /**
     * Simple insertionSort O (n^2), may be good in small Data
     * (better than bubbleSort)
     *
     * @param array of digit
     */
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}