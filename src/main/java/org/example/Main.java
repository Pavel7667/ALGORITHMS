package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeEven(arr)));
        reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];

        int idx = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                result[idx] = j;
                idx++;
            }
        }
        return result;
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}