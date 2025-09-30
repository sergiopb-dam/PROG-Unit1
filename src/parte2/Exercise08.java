package parte2;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		// Creation of the variable
		double longitud;
		
		// Creation of the Scanner
		Scanner sc = new Scanner(System.in);
		
		// Ask the user for the length in meters
		System.out.println("Introduce la longitud en metros del lanzamiento: ");
		
		// Read the integer entered by the user
		longitud = sc.nextDouble();
		
		// We take the whole number part and convert the value to centimeters
		int longitudFinal = (int) longitud * 100;
		
		// Display the final result
		System.out.println("La parte entera de la longitud es de " + longitudFinal + "cm.");
		
		// Close the Scanner
		sc.close();

	}
}
