package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cловарь х10");


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

    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("invalid input");
        }
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int findSecondMaximumValues(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        return secondMax;
    }
}