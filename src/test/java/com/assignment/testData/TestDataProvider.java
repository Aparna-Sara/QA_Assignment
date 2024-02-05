package com.assignment.testData;

import org.testng.annotations.DataProvider;


/**
 * TestDataProvider class provides test data for the test cases in the PrimeNumberTest class.
 * It includes various scenarios with different input values to validate the behavior
 * of the PrimeNumberDetector's findPrimesInRange method.
 */



public class TestDataProvider {
	
	@DataProvider(name = "testData")
	public Object[][] testData(){
		return new Object[][] {
			
			// condition - convert null to 1
			{null, 20},
									
			// Invalid range: null values
			{null, null},
						
			// Invalid range: second number is null
			{4, null},
						
			// Valid range with prime numbers
			{5, 100},
			
			// Valid range with prime numbers
			{1, 50},
			
			// Valid range with prime numbers
			{10, 200},
			
			// Valid range with prime numbers
			{20, 25},
			
			// Valid range with prime numbers
			{5, 5},
			
			// Valid range with prime numbers
			{88, 1000},
			
			// Invalid range: both numbers < 1
			{0, 0},
			
			// Invalid range: second number 0
			{9, 0},
						
			// Invalid range: first number < 1
			{0, 7},
			
			// Invalid range: second number is less than the first number
			{3, 1},
		
			// Valid range: second number is equal to first number
			{13, 13},
						
			// Invalid range: negative first number
			{-5, 10},
			
			// Valid range with prime numbers
			{14, 33},
			
			// Invalid range: negative first number
			{-333, 10},
			
			// Invalid range: negative first number
			{-30, 20},
			
			// Invalid range: negative number for both
			{-6, -15},
		};
	}
}