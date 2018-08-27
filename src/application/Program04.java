package application;

import java.util.Locale;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = circunference(radius);
		double v = volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Math.PI);

		sc.close();

	}

	public static double circunference(double radius) {
		return 2 * Math.PI * radius;
	}

	public static double volume(double radius) {
		return 4 * Math.PI * Math.pow(radius, 3) / 3.0;
	}

}
