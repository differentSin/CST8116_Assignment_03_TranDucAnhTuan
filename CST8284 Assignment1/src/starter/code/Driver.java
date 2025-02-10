package starter.code;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		input.close();
		FitnessTracker fitnessTracker = new FitnessTracker(firstName, lastName, gender, stepsTakenDaily, caloriesBurnedDaily, activeMinutesDaily, maintenanceCalories);
		fitnessTracker.displayFitnessData();
		
	}

}
