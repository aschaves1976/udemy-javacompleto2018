package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class ProgramEx11AccountWithException {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();

			System.out.print("Holder: ");
			String holder = sc.nextLine();

			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();

			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account acct = new Account(number, holder, balance, withdrawLimit);

			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();

			acct.withdraw(amount);
			System.out.println();
			System.out.println(acct);

		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected ERROR: " + e.toString());
		} finally {
			sc.close();
		}
	}

}
