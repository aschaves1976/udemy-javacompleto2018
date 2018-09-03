package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee03;
import entities.OutsourcedEmployee;

public class Program15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int cnt = sc.nextInt();

		List<Employee03> employee = new ArrayList<>();

		for (int i = 0; i < cnt; i++) {
			sc.nextLine();
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Hours: ");
			int hours = sc.nextInt();

			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (outsourced != 'n') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employee.add(new Employee03(name, hours, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");

		for (Employee03 emp : employee) {
			System.out.println(emp);
		}

	}

}
