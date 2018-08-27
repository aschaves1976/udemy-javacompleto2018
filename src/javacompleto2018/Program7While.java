package javacompleto2018;

import java.util.Scanner;

public class Program7While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double n1 = sc.nextDouble();
		while (n1 >= 0) {
			System.out.printf("  %.3f%n", Math.sqrt(n1));
			System.out.println("Enter another number:");
			n1 = sc.nextDouble();
		}
		System.out.println("Negative Number!");
		sc.close();

	}

}
