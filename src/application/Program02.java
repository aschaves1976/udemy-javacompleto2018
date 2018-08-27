package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program02 {

	public static void main(String[] args) {
		/*
		 * Sem utilizar orientação a Objetos, encontrar a maior área entre os triangulos
		 * X e Y
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle Y area: %.4f%n", y.area());

		if (x.area() > y.area()) {
			System.out.println("Large area X.");
		} else {
			System.out.println("Large area Y.");

		}

		sc.close();
	}

}
