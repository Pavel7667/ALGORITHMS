package com.algorithms;

import java.util.Arrays;

/**
 * Base class for calling method
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("hi ALGO");
        int n = 100;
        long[] memorization = new long[n + 1];
        Arrays.fill(memorization, -1);
        System.out.println(fibonacci(n, memorization));
    }

    /**
     * For 0 and 1 set n as 1, for another use Fibonacci
     * formula. Using array for saving result of calc
     *
     * @param n Fibonacci number
     * @param arr Fibonacci number
     * @return Fibonacci count
     */
    // slow version -> optimization
    public static long fibonacci(int n, long[] arr) {
        if (arr[n] != -1) {
            return arr[n];
        }
        if (n <= 1) {
            return n;
        }
        long result = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);
        arr[n] = result;
        return result;
    }
}
