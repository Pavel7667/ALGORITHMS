package org.algorithms;

public class Main {
    public static void main(String[] args) {

        int sum = factorial(3);
        System.out.println(sum);

    }

    /**
     * Make factorial calculation with recursion
     *
     * @param num of factorial
     * @return sum of factorial
     */
    private static int factorial(int num) {
        if (num < 1) return 1;
        System.out.println("This is factorial in Recursion " + num);
        return num * factorial(num - 1);
    }

}