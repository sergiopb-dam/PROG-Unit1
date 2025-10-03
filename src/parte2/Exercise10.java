package parte2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Definition of the variables
		double year;
		// Start of the Scanner
		Scanner sc = new Scanner(System.in);
		// Ask the user for the year
		System.out.println("Introduce: ");
		// Read the year entered by the user
		year = sc.nextDouble();
		// Definition of new variables with the respective calculations
		double century = year / 100;
		// Calculation of the century
		int finalCentury = (int) century + 1;
		// Display the results to the user
		System.out.println("Es: " + finalCentury);
		// Close the Scanner
		sc.close();
	}

}
