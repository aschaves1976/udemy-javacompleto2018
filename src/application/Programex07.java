package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees02;

public class Programex07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int qtd = sc.nextInt();

		sc.nextLine();
		System.out.println();

		List<Employees02> reg = new ArrayList<>();
		// Employees02 employee;

		for (int i = 0; i < qtd; i++) {
			System.out.print("Emplyoee #" + (i + 1));
			System.out.println();
			System.out.print(" Id:     ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print(" Name:   ");
			String name = sc.nextLine();
			System.out.print(" Salary: ");
			double salary = sc.nextDouble();

			// employee = new Employees02(name, salary, id);
			reg.add(new Employees02(name, salary, id));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();

		Employees02 emp = reg.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.upgradeSalary(percentage);
		}

		System.out.println("List of employees:");

		for (Employees02 obj : reg) {
			System.out.println(obj);
		}
		sc.close();
	}

}
