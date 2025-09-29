package parte2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Definition of the principal variables
		int first;
		int second;
		int third;
		
		// Creation of the Scanner
		Scanner sc = new Scanner(System.in);
		
		// Asking the user for the numbers
		System.out.println("Introduce la primera medida en milímetros: ");
		// Read the integer entered by the user
		first = sc.nextInt();
		
		System.out.println("Introduce la segunda medida en centímetros: ");
		// Read the integer entered by the user
		second = sc.nextInt();
		
		System.out.println("Introduce la tercera medida en metros: ");
		// Read the integer entered by the user
		third = sc.nextInt();
		
		// Switching the numbers to centimeters
		int first2 = first / 10;
		int third2 = third * 100;
		
		// Calculating the final number
		int finalNumber = first2 + second + third2;
		
		// Display the result
		System.out.println("La suma de las tres longitudes es: " + finalNumber );
		
		// Close the Scanner
		sc.close();
	}

}
