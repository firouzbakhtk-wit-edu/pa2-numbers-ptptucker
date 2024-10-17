package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Variables to store sums and counts
        int sumPositive = 0, sumNonPositive = 0, sumAll = 0;
        int countPositive = 0, countNonPositive = 0;

        // Array to hold the five numbers
        int[] numbers = new int[5];

        // Get input from the user
        System.out.print("Enter five whole numbers: ");

        for (int counter = 0; counter < 5; counter++) {
            numbers[counter] = scanner.nextInt();
            sumAll += numbers[counter];  // Sum of all numbers

            if (numbers[counter] > 0) {
                sumPositive += numbers[counter];  // Sum of positive numbers
                countPositive++;            // Count of positive numbers
            } else {
                sumNonPositive += numbers[counter];  // Sum of non-positive numbers
                countNonPositive++;            // Count of non-positive numbers
            }
        }

        // Calculate averages
        double avgAll = (double) sumAll / 5;
        double avgPositive = countPositive > 0 ? (double) sumPositive / countPositive : 0.0;
        double avgNonPositive = countNonPositive > 0 ? (double) sumNonPositive / countNonPositive : 0.0;
        
        String PluralPositive= "";
        if (countPositive != 1){
        	PluralPositive="s";
        }
        String PluralNegative= "";
        if (countNonPositive != 1){
        	PluralNegative="s";
        }
        // Output results
        System.out.printf("The sum of the %d positive number" + PluralPositive+": %d%n", countPositive, sumPositive);
        System.out.printf("The sum of the %d non-positive number" + PluralNegative + ": %d%n", countNonPositive, sumNonPositive);
        System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
        System.out.printf("The average of the %d positive number" + PluralPositive+": %.2f%n", countPositive, avgPositive);
        System.out.printf("The average of the %d non-positive number" + PluralNegative +": %.2f%n", countNonPositive, avgNonPositive);
        System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);

        // Close the scanner
        scanner.close();
    }
}


	


