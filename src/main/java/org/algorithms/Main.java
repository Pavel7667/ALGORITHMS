package org.algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bubble_sort");

        int[] array = {1, 2415, 567, 4564, 443242, 775, 453, 756745, 34, 64, 342, 7456};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));


    }

    /**
     * Simple bubbleSort O (n^2), may be good in small Data
     * using double fori and one if statement, in case true swap digit
     *
     * @param array of digit
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}