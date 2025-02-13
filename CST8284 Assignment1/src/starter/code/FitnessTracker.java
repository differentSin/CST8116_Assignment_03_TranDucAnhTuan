/*
 * Student Name: Tran Duc Anh Tuan
 * Student ID: 041151991
 * Section: CST8284 311
 * Description: Assignment1 FitnessTracker class file
 */
package starter.code;

/**
 * FitnessTracker.java Starter code for FitnessTracker assignment.
 * @author Tran Duc Anh Tuan
 */
public class FitnessTracker {

	/*	TODO 1: INCLUDE YOUR ATTRIBUTES HERE. CHECK THE UML CLASS DIAGRAM TO INCLUDE
	 * 			ALL ATTRIBUTES LISTED AND THEIR TYPES.
	 *
	 */

	// START CODE
	/**
	 * User's first name
	 */
	private String firstName;
	
	/**
	 * User's last name
	 */
	private String lastName;
	
	/**
	 * User's gender
	 */
	private String gender;
	
	/**
	 * Steps taken daily
	 */
	private int stepsTakenDaily;
	
	/**
	 * Calories burned daily
	 */
	private double caloriesBurnedDaily;
	
	/**
	 * Daily active minutes
	 */
	private double activeMinutesDaily;
	
	/**
	 * Daily maintenance calories
	 */
	private double maintenanceCalories;
	
	/**
	 * Constant for a male step: 0.8
	 */
	public static final double MALE_WALK = 0.8;
	
	/**
	 * Constant for a female step: 0.7
	 */
	public static final double FEMALE_WALK = 0.7;
	// END CODE


	/*	TODO 2: INCLUDE YOUR CONSTRUCTOR HERE.
	 *
	 */

	// START CODE
	/**
	 * Default constructor with no parameter to print out a message
	 */
	public FitnessTracker() {
		System.out.println("No information input!");
	}
	
	/**
	 * Constructor takes all 7 arguments and assigned it to instance variables.
	 * Works like a setter
	 * @param firstName First name
	 * @param lastName Last name
	 * @param gender Gender
	 * @param stepsTakenDaily Daily steps taken
	 * @param caloriesBurnedDaily Calories burned per day
	 * @param activeMinutesDaily Minutes exercising per day
	 * @param maintenanceCalories Maintenance calories needs to burn
	 */
	public FitnessTracker(String firstName, String lastName, String gender, int stepsTakenDaily, int caloriesBurnedDaily, double activeMinutesDaily, int maintenanceCalories) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.stepsTakenDaily = stepsTakenDaily;
		this.caloriesBurnedDaily = caloriesBurnedDaily;
		this.activeMinutesDaily = activeMinutesDaily;
		this.maintenanceCalories = maintenanceCalories;
	}
	// END CODE

	
	
	

	/*		TODO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS DIAGRAM TO
	 *					ENSURE ALL ARE COMPLETE.
	 *
	 */

	// START CODE
	//No JavaDoc generated for getters and setters because it is obvious what they are doing
	//firstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	//lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	//gender
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

	//stepsTakenDaily
	public int getStepsTakenDaily() {
		return stepsTakenDaily;
	}
	public void setStepsTakenDaily(int stepsTakenDaily) {
		this.stepsTakenDaily = stepsTakenDaily;
	}
	

	//caloriesBurnedDaily
	public double getCaloriesBurnedDaily() {
		return caloriesBurnedDaily;
	}
	public void setCaloriesBurnedDaily(double caloriesBurnedDaily) {
		this.caloriesBurnedDaily = caloriesBurnedDaily;
	}
	

	//activeMinutesDaily
	public double getActiveMinutesDaily() {
		return activeMinutesDaily;
	}
	public void setActiveMinutesDaily(double activeMinutesDaily) {
		this.activeMinutesDaily = activeMinutesDaily;
	}

	
	//maintenanceCalories
	public double getMaintenanceCalories() {
		return maintenanceCalories;
	}
	
	public void setMaintenanceCalories(int maintenanceCalories) {
		this.maintenanceCalories = maintenanceCalories;
	}
	//END CODE
	


	/*	TODO 4: THIS METHOD SHOULD DISPLAY ALL USER FITNESS DATA. DO NOT MISS ANY
	 * 			DATA/INFORMATION.
	 */
	
	/**
	 * Calculate daily walking distance by taking the daily steps taken multiply with 
	 * FEMALE_WALK or MALE_WALK, based on gender
	 * @return daily distance calculated
	 * 
	 */
	public double calculateDistance() {
		double dailySteps = stepsTakenDaily; //Implicit casting of integer variable stepsTakenDaily to double
		double distanceWalkedDaily = 0;
		switch (gender) {
			case "male":
				distanceWalkedDaily = MALE_WALK * dailySteps;
				break;
			case "female":
				distanceWalkedDaily = FEMALE_WALK * dailySteps;
				break;
		}
		return distanceWalkedDaily;
	}
	
	
	/**
	 * Calculate total (NOT average) active minutes of the week
	 * @return daily active minutes multiply by 7 days
	 * 
	 */
	public double calculateActiveMinutesWeekly() {
		return activeMinutesDaily * 7;
	}
	
	
	/**
	 * Determine fitness level based on calculateActiveMinutesWeekly() method and caloriesBurnedDaily variable
	 * The calories condition is based on daily calories, resemble the sample output.
	 * If invalid arguments, return String "Error".
	 * 
	 * @return fitness level determined
	 */
	public String calculateFitnessLevel() {
		String fitnessLevel; //local variable to hold value for the method's return
		if (calculateActiveMinutesWeekly() > 150.0 && caloriesBurnedDaily > 2000.0) {
			fitnessLevel = "Active";
		} else if (calculateActiveMinutesWeekly() >= 75.0 && calculateActiveMinutesWeekly() <= 150.0 
				  && caloriesBurnedDaily > 2000.0) {
			fitnessLevel = "Moderately Active";
		} else if (calculateActiveMinutesWeekly() < 75.0 && caloriesBurnedDaily < 1000.0){
			fitnessLevel = "Sedentary";
		} else {
			return "Error";
		}
		return fitnessLevel;
	}
	
	
	/**
	 * Calculate calorie deficit by subtracting maintenanceCalories with caloriesBurnedDaily; 
	 * Both variables are double so the result can be negative
	 * If one of the variables are negative, IllegalArgumentException will be thrown.
	 * @return differences between maintenanceCalories and caloriesBurnedDaily
	 */
	public double calculateCalorieDeficit() {
		if (maintenanceCalories < 0) {
			throw new IllegalArgumentException("maintenance calories cannot be negative");
		} else {
			return maintenanceCalories - caloriesBurnedDaily;
		}
	}
	

	
	/**  
	 *	Display all fitness data data.
	 *	Uses printf to format double data type to contains only 1 decimal place
	 */
	public void displayFitnessData() {

		/*	TODO 5: USE System.out.printf TO SHOW ALL FITNESS DATA. DO NOT MISS ANY ITEM.
		 *
		 */

		// START CODE
		System.out.println("--- User Fitness Data ---");
		System.out.printf("Name: %s %s \n", firstName, lastName);
		System.out.printf("Gender: %s \n", gender);
		System.out.printf("Daily Steps: %d \n", stepsTakenDaily);
		System.out.printf("Daily Distance Walked: %.1f meters\n", calculateDistance());
		System.out.printf("Weekly Active Minutes: %.1f \n", calculateActiveMinutesWeekly());
		System.out.printf("Fitness Level: %s \n", calculateFitnessLevel());
		System.out.printf("Daily Calorie Deficit/Surplus: %.1f \n", calculateCalorieDeficit());
		System.out.println();
		// END CODE


		/*		You do not need to modify this piece of code; it is fine as it is.											*/
		System.out.println("Fitness Level Criteria:");
		System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
		System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
		System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
	}

}