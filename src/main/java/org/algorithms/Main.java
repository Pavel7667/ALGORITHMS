package org.algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("binary search");

        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }


        int index = Arrays.binarySearch(array, 45);
        if (index != -1) {
            System.out.println("Element in array = " + index);
        } else {
            System.out.println("Element not found");
        }

    }

}