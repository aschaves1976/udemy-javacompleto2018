package application;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		/*
		 * Sem utilizar orientação a Objetos, encontrar a maior área entre os triangulos
		 * X e Y
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;

		System.out.println("Enter the measures of triangle X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double areaX, areaY, p;

		p = (xA + xB + xC) / 2;
		areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		p = (yA + yB + yC) / 2;
		areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Large area X.");
		} else {
			System.out.println("Large area Y.");

		}

		sc.close();
	}

}
