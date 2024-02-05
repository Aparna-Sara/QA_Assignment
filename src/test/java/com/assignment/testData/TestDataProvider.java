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
			
			// Invalid range: negative number for both
			{0, -2},
		
			//Edge cases
			{null, 5},
			{1,6},
			{-2,9},
			{3,null},
			{null,0},
			{0,null},
			{null, -1},
			{-1,null},
			{1,-4},
			{3,0},
			{5,3},
			{-5,5},
			{0,1},
			{0,2},
			{1,0},
			{1,1},
			{1,2},
			{2,2},
			{2,3},
			{-0,-0},
			{1000, null},
//			{null, 1000000},
		//	{99999, 9999999},
		//	{1000000,2000000},
		
		};
	}
}