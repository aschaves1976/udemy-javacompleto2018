package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ProgramEx05Bank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int acctNum = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		BankAccount account;

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			account = new BankAccount(acctNum, holder, sc.nextDouble());

		} else {
			account = new BankAccount(acctNum, holder);

		}

		System.out.println("");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());

		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		account.withDraw(sc.nextDouble());

		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}
