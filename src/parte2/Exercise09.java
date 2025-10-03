package parte2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Definition of the variables
		double num;
		// Start of the Scanner
		Scanner sc = new Scanner(System.in);
		// Ask the user for the problem's number
		System.out.println("Introduce el número del problema: ");
		// Read the integer entered by the user
		num = sc.nextDouble();
		// Creation of new variables and calculation of the volume
		double numPro = num / 100;
		int numFinal = (int) numPro;
		// Display the results to the user
		System.out.println("El problema pertenece al volúmen número " + numFinal);
		// Close the Scanner
		sc.close();
	}

}
