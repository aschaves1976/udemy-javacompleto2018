package javacompleto2018;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		double number = sc.nextDouble();

		if (number % 2 == 0) {
			System.out.println("Even!");
		} else {
			System.out.println("Odd!");
		}

		System.out.println("What time is it?");
		double time = sc.nextDouble();

		if (time < 12.0) {
			System.out.println("Good Morning!");
		} else if (time >= 12.0 && time < 18) {
			System.out.println("Good Afternoon!!");
		} else {
			System.out.println("Good Evening!");
		}

		sc.close();

	}

}
