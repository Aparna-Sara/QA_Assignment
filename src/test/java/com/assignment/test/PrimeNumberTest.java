package com.assignment.test;

import com.assignment.core.Constants;
import com.assignment.core.PrimeNumberDetector;
import com.assignment.testData.TestDataProvider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.util.List;


/**
 * Test class for PrimeNumberDetector functionality.
 */
public class PrimeNumberTest {
	
	 	ExtentReports extent = ExtentManager.createInstance();
	    ExtentTest test;
	    
	    @BeforeMethod
	    public void setUp() {
	        extent = ExtentManager.createInstance();
	        test = extent.createTest("testFindPrimesInRange");
	    }

	    @AfterMethod
	    public void tearDown() {
	        extent.flush();
	    }

    /**
     * Tests the findPrimesInRange method of PrimeNumberDetector.
     *
     * @param firstNumber  The start of the range.
     * @param secondNumber The end of the range.
     */
    @Test(dataProvider = "testData", dataProviderClass = TestDataProvider.class)
    public void testFindPrimesInRange(Integer firstNumber, Integer secondNumber) {

        /* Conditions:
           - The second number is required.
           - The second number should not be null.
           - The second number should not be less than the first number. */

    	
    	/* Condition: Set default value for firstNumber = 1 if it's null */
    	if(firstNumber == null) {
    		firstNumber = Constants.DEFAULT_FIRST_NUMBER;
    	}
		
    	if(firstNumber == 0 && secondNumber == null) {
    		System.out.println(Constants.INVALID_SECOND_NUMBER_RANGE_MESSAGE);
    		test.log(Status.SKIP, Constants.INVALID_SECOND_NUMBER_RANGE_MESSAGE);
            return;
    	}
		//edge case detected
    			if(firstNumber == 0 && secondNumber == 0) {
    				System.out.println(String.format(Constants.INVALID_RANGE_MESSAGE_FORMAT, firstNumber, secondNumber));;
    				test.log(Status.SKIP, Constants.INVALID_SECOND_NUMBER_RANGE_MESSAGE);
    				return;
    			}
    			
    	
    			
        if (secondNumber == null || (firstNumber != null && secondNumber < firstNumber)) {
        	System.out.println(Constants.INVALID_SECOND_NUMBER_RANGE_MESSAGE);
        	test.log(Status.SKIP, Constants.INVALID_SECOND_NUMBER_RANGE_MESSAGE);
            return;
        }

        PrimeNumberDetector primeNumberDetector = new PrimeNumberDetector();

        List<Integer> primes = primeNumberDetector.findPrimesInRange(firstNumber, secondNumber);

        // Add assertions or print statements to validate the result
        if (!primes.isEmpty()) {
            String primesMessage = String.format(Constants.PRIMES_MESSAGE_FORMAT, firstNumber, secondNumber, primes);
            System.out.println(primesMessage);
            test.log(Status.PASS, primesMessage);


            // Add assertions based on the primes message
            assertTrue(primesMessage.contains("Prime numbers"), "Expected message to contain 'Prime numbers'");
            // Intentionally fail the assertion
            //assertTrue(primesMessage.contains("Invalid range"), "Expected message to contain 'Invalid range'");
            
        } else {
            String invalidRangeMessage = primeNumberDetector.getInvalidRangeMessage(firstNumber, secondNumber);
            System.out.println(invalidRangeMessage);
            test.log(Status.FAIL, invalidRangeMessage);

            // Add assertions based on the invalid range message
            assertTrue(invalidRangeMessage != null && invalidRangeMessage.contains("Invalid range"), "Expected message to contain 'Invalid range'");

            // Intentionally fail the assertion
           // assertTrue(invalidRangeMessage.contains("Prime numbers"), "Expected message to contain 'Prime numbers'");
        }
    }
}