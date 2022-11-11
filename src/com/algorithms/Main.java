package com.algorithms;

/**
 * Base class for calling method
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("hi ALGO");
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(100));
	}
	
	/**
	 * For 0 and 1 set n as 1, for another use Fibonacci
	 * formula. Use swapping of digit to Optimize calc
	 *
	 * @param n Fibonacci number
	 * @return Fibonacci count
	 */
	// fast version !!!
	public static long fibonacci(int n) {
		long a = 0;
		long b = 1;
		long c;
		
		if (n == 0)
			return a;
		
		for (int i = 2; i <= n; i++) { // start from 2
			c = a + b;
			a = b; //Use swapping of digit to Optimize calc
			b = c; //Use swapping of digit to Optimize calc
		}
		return b;
	}
}
