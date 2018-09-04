package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Individual;
import entities.LegalEntity;

public class Program11Contributor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int numPayers = sc.nextInt();

		for (int i = 0; i < numPayers; i++) {
			sc.nextLine();
			System.out.println("Tax payer #" + (i + 1) + " data:");

			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numOfEmployees = sc.nextInt();
				// sc.nextLine();
				list.add(new LegalEntity(name, anualIncome, numOfEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double sumTaxes = 0;

		for (Contribuinte con : list) {
			sumTaxes += con.taxCalculation();
			System.out.println(con.toString());
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $%.2f", sumTaxes);
		sc.close();
	}

}
