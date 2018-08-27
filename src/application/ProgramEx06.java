package application;

import java.util.Scanner;

import entities.Student02;

public class ProgramEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student02[] student = new Student02[10];

		System.out.print("How many rooms will be rented?");
		int qtd = sc.nextInt();
Integer num;
Double d1;
Character c1;

		for (int i = 1; i <= qtd; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name : ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room : ");
			int rooNumber = sc.nextInt();
			student[rooNumber] = new Student02(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				System.out.println(" - " + i + ": " + student[i]);
			}
		}

	}

}
