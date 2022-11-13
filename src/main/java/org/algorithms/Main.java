package org.algorithms;

public class Main {
    public static void main(String[] args) {
        System.out.println("linear search");

        int[] array = {1, 2, 3, 45, 6, 7, 8, 9, 12, 9678, 678, 5675, 57657};

        int index = linerSearch(array, 45);
        if (index != -1) {
            System.out.println("Element in array = " + index);
        } else {
            System.out.println("Element not found");
        }

    }

    /**
     * Simple linerSearch
     *
     * @param array of digit
     * @param value looking digit in array
     * @return value or -1 if not found
     */
    public static int linerSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}