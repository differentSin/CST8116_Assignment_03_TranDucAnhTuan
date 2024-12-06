/*Project: Assignment 3
 * Student Name: Tran Duc Anh Tuan
 * Student ID: 041151991
 * Course: CST8116 370
 * Desription: a program that is used to roll dice and to test git commit
 * 
 */

public class Assignment03TranDucAnhTuan {

	public static void main(String[] args) {
		// The program rolls a 6-sided dice NUM_ROLLS times, records the results, // and then counts how many times each number was rolled.
		final int NUM_ROLLS = 10;
		int[] rollResults = new int[NUM_ROLLS];
		//countResults[i] represents the number of times i+1 is rolled
		int[] countResults = new int[6];
		// Roll the dice NUM_ROLLS times
		for(int count = 0; count < NUM_ROLLS; ++count) {
		    // Math.random() generates a random number between 0.0 and 1.0, multiply by 6 to get 0-5,
		    // add 1 to get a number between 1 and 6 for each roll
		    rollResults[count] = (int)(Math.random() * 6) + 1;
		    // Increment the count for the rolled number
		    countResults[rollResults[count] - 1]++;
		}
		// Display the results
		for(int rollNum = 0; rollNum <= rollResults.length; ++rollNum) {  //Crashes
		    System.out.printf("Result of roll #%d is: %d%n", rollNum, rollResults[rollNum]);
		}
		System.out.println("\nCount of each number rolled:");
		for(int i = 0; i < countResults.length; ++i) {
		    System.out.printf("Number %d was rolled %d times.%n", i + 1, countResults[i]);
		}
		
		System.out.println("Program by Tran Duc Anh Tuan");
	}

}
