package parte2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Creation of the Scanner
		Scanner sc = new Scanner(System.in);
		
		// Ask the user for an amount of seconds
		System.out.print("Introduce la cantidad de segundos: ");
		
		// Read the integer entered by the user
		int totalSegundos = sc.nextInt();
		
		// Calculation of the time lapses
		int horas = totalSegundos / 3600;
		int minutos = (totalSegundos % 3600) / 60;
		int segundos = totalSegundos % 60;
		
		// Display the final results
		System.out.println(totalSegundos + " segundos equivalen a: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		
		// Close the Scanner
		sc.close();
	}

}
