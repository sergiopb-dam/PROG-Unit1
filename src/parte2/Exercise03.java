package parte2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create a scanner to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Introduce el primer número: ");

		// Read the integer entered by the user
		int num1 = sc.nextInt();
		
		// Prompt the user to enter an integer
		System.out.print("Introduce el primer número: ");
		int num2 = sc.nextInt();

		// Calculate the remainder of dividing the number 1 by the number 2
		int remainder = num1 % num2;

		// Determine how much must be added to reach the next multiple of 7
		int toAdd = (remainder == 0) ? 0 : num2 - remainder;

		// Display the result to the user
		System.out.println("You need to add " + toAdd + " to your number to make it a multiple of 7.");

		// Close the scanner to release system resources
		sc.close();
	}
}
