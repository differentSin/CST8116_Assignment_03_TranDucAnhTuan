package starter.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class FitnessTrackerTest2 {
	
	FitnessTracker fitnessTracker;
	
	
	
	@Test @Order(1) @DisplayName("test calculateDistance() method with valid arguments ")
	void testCalculateDistance() {
		fitnessTracker = new FitnessTracker(5000, "female");
		assertEquals(3500, fitnessTracker.calculateDistance());
	}

}
