package com.algorithms;

import java.util.Arrays;

/**
 * Base class for calling method
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("log n > sqrt n > n > n log n > n^2 > 2^n");
        int[] test = {1, 2, 3, 1, 2, 3};
        System.out.println(getMaxNumberFromArray(test));
    }

    /**
     * For array {1, 2, 3, 1, 2, 3} max value would be = 332211
     *
     * @param digits array of digits
     * @return max_number
     */
    public static String getMaxNumberFromArray(int[] digits) {
        Arrays.sort(digits);       // O = n log n
        StringBuilder max_number = new StringBuilder();
        for (int i = digits.length - 1; i > 0; i--) {    // O = n
            max_number.append(digits[i]);
        }
        return max_number.toString();
    }

}
