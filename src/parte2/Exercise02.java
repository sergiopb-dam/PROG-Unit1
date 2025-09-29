package parte2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create a scanner to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Introduce un número: ");

		// Read the integer entered by the user
		int number = sc.nextInt();

		// Calculate the remainder of dividing the number by 7
		int remainder = number % 7;

		// Determine how much must be added to reach the next multiple of 7
		int toAdd = (remainder == 0) ? 0 : 7 - remainder;

		// Display the result to the user
		System.out.println("Necesitas añadir " + toAdd + " a tu número para convertirlo en múltiplo de 7.");

		// Close the scanner to release system resources
		sc.close();
	}
}
