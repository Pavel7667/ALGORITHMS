package com.algorithms;

/**
 * Base class for calling method
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("hi ALGO");
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum;
		sum = getSumOfArrayWithOutLoops(array, 0);
		System.out.println(sum);
	}
	
	/**
	 * The getSumOfArrayWithOutLoops, use recursion for get
	 * sum of loop. Get i=numbers.length and than go
	 * descending to zero, doing some logic
	 *
	 * @param numbers array
	 * @param i       index should starts with 0
	 * @return sum array of digit
	 */
	public static int getSumOfArrayWithOutLoops(int[] numbers, int i) {
		if (i == numbers.length) { // till = length, i++
			return 0;
		}
		return numbers[ i ] + getSumOfArrayWithOutLoops(numbers, i + 1);
	}
}
