package org.algorithms;

public class Main {
    public static void main(String[] args) {
        System.out.println("interpolation search");

        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }


        int index = interpolationSearch(array, 45);
        if (index != -1) {
            System.out.println("Element in array = " + index);
        } else {
            System.out.println("Element not found");
        }

    }

    /**
     * Simple interpolationSearch O = log (log (n)) in best case
     * In worst O (n)
     *
     * @param array of digit
     * @param value looking digit in array
     * @return index of looking value or -1, if not found
     */
    public static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) *
                    (value - array[low]) /
                    (array[high] - array[low]);

            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                low = probe - 1;
            }
        }
        return -1;
    }
}