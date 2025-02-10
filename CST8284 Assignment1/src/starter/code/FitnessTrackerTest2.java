/*
 * Student Name: Tran Duc Anh Tuan
 * Student ID: 041151991
 * Section: CST8284_311
 * Description: Assignment1 FitnessTrackerTest2 JUnit Test
 */
package starter.code;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


/**
 * Test class for testing FitnessTracker class, uses JUnit version 5.
 * The tested methods are expected to push out an error message exactly like the one specify in the method to handle invalid arguments.
 * Only arguments used for the method will be passed into the method. 
 * Other parameter, if it is String, will be "". 
 * If it is int or double, will be 0
 * 
 * 
 * 
 * @author Tran Duc Anh Tuan
 * @version 5.11
 */
class FitnessTrackerTest2 {
	/** 
	 * Declare reference variable. Instantiation happened during test method
	 */
	FitnessTracker fitnessTracker;
	

	/**
	 * Pass in "female" gender, 5000 steps daily, should return 3500
	 */
	@Test @Order(1) @DisplayName("calculateDistance() method with all valid arguments ")
	void testCalculateDistance() {
		fitnessTracker = new FitnessTracker("", "", "female", 5000, 0, 0, 0);
		assertEquals(3500, fitnessTracker.calculateDistance());
	}
	
	/**
	 * Pass in 0 activeMinutesDaily, multiply with 7 is 0.
	 * If it is not equal to 7, it passes
	 */
	@Test @Order(2) @DisplayName("calculateActiveMinutesWeekly() method with argument value 0")
	void testCalculateActiveMinutesWeekly() {
		fitnessTracker = new FitnessTracker("", "", "", 0, 0, 0, 0);
		assertFalse(fitnessTracker.calculateActiveMinutesWeekly() == 7, "The result should be 0");
	}
	
	
	
	/**
	 * Pass in 3000 caloriesBurnedDaily, -5 activeMinutesDaily, 
	 * expect a string of value "Error" to pass the test
	 */
	
	@Test @Order(3) @DisplayName("calculateFitnessLevel() method invalid arguments")
	void testCalculateFitnessLevel() {
		//firstName, lastName, gender, stepspTakenDaily, caloriesBurnedDaily, activeMinutesDaily, maintenanceCalories
		fitnessTracker = new FitnessTracker("", "", "", 0, 3000, -5, 0);
		assertTrue(fitnessTracker.calculateFitnessLevel().equals("Error"));
	}
	
	/**
	 * Pass in 5000 caloriesBurnedDaily, -2000 maintenanceCalories, 
	 * expect an IllegalArgumentException to pass the test
	 */
	
	@Test @Order(4) @DisplayName("calculateCalorieDeficit() method invalid arguments")
	void testCalculateCalorieDeficit() {
		fitnessTracker = new FitnessTracker("", "", "", 0, 0, 5000, -2000);
		assertThrows(IllegalArgumentException.class,
				() -> fitnessTracker.calculateCalorieDeficit(), 
				"Expected IllegalArgumentException thrown"); //fail message
	}
}
