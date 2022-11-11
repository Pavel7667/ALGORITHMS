package com.algorithms;

/**
 * Base class for calling method
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("hi ALGO");
		System.out.println(countOfDigitInNumber(234239424,
				2));
		
	}
	
	/**
	 * The countOfDigitInNumber show count of digit in
	 * Number, like 123123 for digit 1, count = 2
	 *
	 * @param number some int number, like 23423942698324
	 * @param lookingDigit some int digit, like 2
	 * @return count
	 */
	public static int countOfDigitInNumber(
			int number, int lookingDigit
	) {
		if (number == 0) {// break condition
			return 0;
		}
		// if condition true cont++ and, slice digit
		if (number % 10 == lookingDigit) {
			return 1 + countOfDigitInNumber(number / 10,
					lookingDigit);
		} else {
			return countOfDigitInNumber(number / 10,
					lookingDigit);
		}
	}
}
