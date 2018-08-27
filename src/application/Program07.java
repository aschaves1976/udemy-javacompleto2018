package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product02;

public class Program07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n1 = sc.nextInt();

		System.out.printf("Enter data of %d product(s):%n%n", n1);
		Product02[] product = new Product02[n1];

		for (int i = 0; i < product.length; i++) {
			sc.nextLine();
			System.out.print("  Name: ");
			String name = sc.nextLine();
			System.out.print("  Price: ");
			double price = sc.nextDouble();
			product[i] = new Product02(name, price);
		}
		double avg = 0;
		for (int i = 0; i < product.length; i++) {
			avg += product[i].getPrice();
		}
		avg /= product.length;
		System.out.printf("%nAVERAGE PRICE: %.2f", avg);
		sc.close();

	}

}
