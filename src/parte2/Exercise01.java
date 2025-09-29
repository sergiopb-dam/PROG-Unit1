package parte2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creation of the Scanner
		Scanner sc = new Scanner(System.in);
		
		// Ask the user for a decimal number
		System.out.print("Introduce tu número con decimales: ");
		
		// Introducing the number value
		double numero = sc.nextDouble();
		
		// We take the whole number part of the number
		int parteEntera = (int) numero;
		
		// We take the decimal part of the number
		double parteDecimal = numero - parteEntera;
		
		// Creation of the final number
		int numeroRedondeado = (parteDecimal >= 0.5) ? parteEntera + 1 : parteEntera;
		
		// Show the final number
		System.out.println("Número redondeado: " + numeroRedondeado);
		
		// Close the scanner
		sc.close();
	}
}
