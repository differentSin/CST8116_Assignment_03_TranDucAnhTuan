/*
 * Student Name: Tran Duc Anh Tuan
 * Student ID: 041151991
 * Section: CST8284_311
 * Description: Assignment1 FitnessTrackerTest class contains the main method
 */

package starter.code;

import java.util.Scanner;

/**
 * Output class to print the result to console
 * 
 * @author Tran Duc Anh Tuan
 */
public class FitnessTrackerTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter first name: ");
		String firstName = input.next();
		

		System.out.print("Enter last name: ");
		String lastName = input.next();
		
		
		System.out.print("Enter gender (male/female): ");
		String gender = input.next();

		
		System.out.print("Enter daily steps: ");
		int stepsTakenDaily = input.nextInt();
		
		
		System.out.print("Enter daily calories burned: ");
		int caloriesBurnedDaily = input.nextInt();
		
		
		System.out.print("Enter daily active minutes: ");
		double activeMinutesDaily = input.nextDouble();
		
		
		System.out.print("Enter daily maintenance calories: ");
		int maintenanceCalories = input.nextInt();
		
		
		System.out.println();
		input.close(); //close the scanner to prevent resource leak
		
		//Initiate object with full parameters
		FitnessTracker fitnessTracker = new FitnessTracker(firstName, lastName, gender, stepsTakenDaily, caloriesBurnedDaily, activeMinutesDaily, maintenanceCalories);
		fitnessTracker.displayFitnessData();
		
	}

}
