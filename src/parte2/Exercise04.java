package parte2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creation of our variables
		int a;
		int b;
		int c;
		int x;
		// Definition of the Scanner
		Scanner sc = new Scanner(System.in);

		// Asking the user for the number values
		System.out.println("Introduce el valor de a: ");
		// Read the integer entered by the user
		a = sc.nextInt();
		
		System.out.println("Introduce el valor de b: ");
		// Read the integer entered by the user
		b = sc.nextInt();
		
		System.out.println("Introduce el valor de c: ");
		// Read the integer entered by the user
		c = sc.nextInt();
		
		System.out.println("Introduce el valor de x: ");
		// Read the integer entered by the user
		x = sc.nextInt();

		// Display the result to the user
		System.out.println("y = " + a + "*(" + x + ")^2 + " + b + "*(" + x + ") + " + c);

		// Close the Scanner
		sc.close();
	}

}
