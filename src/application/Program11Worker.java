package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

public class Program11Worker {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter Department Name: ");
		String departmentName = sc.nextLine();

		System.out.println("Enter worker data: ");

		System.out.print(" Name: ");
		String workertName = sc.nextLine();
		System.out.print(" Level: ");
		String level = sc.nextLine();
		System.out.print(" Base salary: ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(workertName, WorkLevel.valueOf(level), baseSalary, new Department(departmentName));

		System.out.print("How many contracts to this worker? ");
		int qtd = sc.nextInt();
		// sc.nextLine();
		for (int i = 0; i < qtd; i++) {
			sc.nextLine();
			System.out.println(" Enter contract #" + (i + 1) + " data: ");
			System.out.print(" - Date (DD/MM/YYYY): ");
			Date dateContract = sdf.parse(sc.nextLine());

			System.out.print(" - Value per hour: ");
			double valuePerHour = sc.nextDouble();

			System.out.print(" - Duration (hours): ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(dateContract, valuePerHour, hours);
			worker.addContract(contract);
		}
		sc.nextLine();
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = sc.nextLine();

		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();

	}

}
