package javacompleto2018;

import java.util.Locale;
import java.util.Scanner;

public class ExFix02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int qtd = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String name2 = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();

		System.out.printf("%n" + name + "%n" + qtd + "%n" + price + "%n" + name2 + "%n" + age + "%n" + height);

		sc.close();

	}

}
