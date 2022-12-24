package org.example;

public class Main {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        Main main = new Main();

        System.out.println(main.findSumLoop(999999));

        System.out.println("time taken " + (System.currentTimeMillis()-now)+" millisecond");
    }

    private int findSumAlgo(int i) {
        return i * (i + 1) / 2;
    }

    private int findSumLoop(int i) {
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum = sum + j;
        }
        return sum;
    }

}