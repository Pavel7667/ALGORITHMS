package com.algorithms;

/**
 * Base class for calling method
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("hi ALGO");
		System.out.println(fibonacci(20));
		
		
	}
	
	/**
	 * For 0 and 1 set n as 1, for another use Fibonacci
	 * formula.
	 *
	 * @param n Fibonacci number
	 * @return Fibonacci count
	 */
	// slow version
	public static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
		
	}
}
