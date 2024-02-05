package com.assignment.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for detecting prime numbers in a given range.
 */
public class PrimeNumberDetector {

	/**
	 * Finds prime numbers in the specified range.
	 *
	 * @param firstNumber  The start of the range.
	 * @param secondNumber The end of the range.
	 * @return A list of prime numbers in the specified range.
	 */
	public List<Integer> findPrimesInRange(Integer firstNumber, Integer secondNumber) {
		List<Integer> primes = new ArrayList<>();

		// Check for invalid range
		if (secondNumber < firstNumber) {
			// Invalid range
			return primes;
		}

		
		// Iterate through the range and add prime numbers to the list
		for (Integer number = firstNumber; number <= secondNumber; number++) {
			if (isPrime(number)) {
				primes.add(number);
			}
		}

		return primes;
	}

	/**
	 * Generates an error message for an invalid range.
	 *
	 * @param firstNumber  The start of the range.
	 * @param secondNumber The end of the range.
	 * @return The error message for an invalid range.
	 */
	public String getInvalidRangeMessage(Integer firstNumber, Integer secondNumber) {
		 if (secondNumber == null || (firstNumber != null && secondNumber < firstNumber)) {
		        return String.format(Constants.INVALID_RANGE_MESSAGE_FORMAT, firstNumber, secondNumber);
		    }

		    return null; 
	    }

	/**
	 * Checks if a given number is prime.
	 *
	 * @param number The number to check for primality.
	 * @return True if the number is prime, false otherwise.
	 */
	private boolean isPrime(Integer number) {
		if (number < 2) {
			return false;
		}

		Integer sqrt = (int) Math.sqrt(number);

		// Check for factors
		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}