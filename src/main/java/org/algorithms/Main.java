package org.algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merge sort");

        int[] array = {1, 2415, 567, 4564, 443242, 775, 453, 756745, 34, 64, 342, 7456};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));


    }

    /**
     * Simple mergeSort
     * run-time O ( n log n)
     * space complexity O(n)
     *
     * @param array of digit
     */
    public static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array;
        int j = 0; // right array;

        // filling arrays
        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0;
        int left = 0;
        int right = 0;

        while (left < leftSize && right < rightSize) {
            if (leftArray[left] < rightArray[right]) {
                array[i] = leftArray[left];
                i++;
                left++;
            } else {
                array[i] = rightArray[right];
                i++;
                right++;
            }
        }
        while (left < leftSize) {
            array[i] = leftArray[left];
            i++;
            left++;
        }
        while (right < rightSize) {
            array[i] = rightArray[right];
            i++;
            right++;
        }
    }
}