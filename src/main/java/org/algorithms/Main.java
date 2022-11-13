package org.algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selection_sort");

        int[] array = {1, 2415, 567, 4564, 443242, 775, 453, 756745, 34, 64, 342, 7456};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));


    }

    /**
     * Simple selectionSort O (n^2), may be good in small Data
     *
     * @param array of digit
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}