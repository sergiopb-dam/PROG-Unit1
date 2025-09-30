package parte2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Definition of the first variables
		int numInfantil;
		int numAdulto;
		
		// Start of the Scanner
		Scanner sc = new Scanner(System.in);
		
		// Ask the user for the amount of tickets
		System.out.println("La entrada infantil cuesta 15,50€ y la de adulto 20€.");
		System.out.println("Introduce el número de entradas infantiles que quiere: ");
		// Read the integer entered by the user
		numInfantil = sc.nextInt();
		System.out.println("Introduce el número de entradas de adulto que quiere: ");
		// Read the integer entered by the user
		numAdulto = sc.nextInt();
		
		// We calculate the final price
		double finalInfantil = numInfantil * 15.50;
		int finalAdulto = numAdulto * 20;
		double precioFinal = finalInfantil + finalAdulto;
		precioFinal = (finalInfantil + finalAdulto) >= 100 ? precioFinal - precioFinal * 0.05 : precioFinal ;
		
		// Display the results
		System.out.println("El importe es de " + precioFinal + "€.");
		
		// Close the Scanner
		sc.close();
	}

}
