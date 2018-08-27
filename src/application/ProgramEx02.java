package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEx02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Name        : ");
		Employee employee = new Employee();
		employee.setName(sc.nextLine());
		System.out.print("Gross Salary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.print("Tax:        : ");
		employee.setTax(sc.nextDouble());

		System.out.println("\nEmployee: " + employee);
		System.out.println("\nWhich percentage to encrease salary?");
		employee.increaseSalary(sc.nextDouble());
		System.out.println("Update data: " + employee);

	}

}
