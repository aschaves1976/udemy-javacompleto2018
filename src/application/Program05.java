package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product02;

public class Program05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product Data:\n  Name:");
		String name = sc.nextLine();
		System.out.print("  Price:");
		double price = sc.nextDouble();
		System.out.print("  Quantity in Stock:");
		int quantity = sc.nextInt();

		Product02 produto = new Product02(name, price, quantity);

		
		System.out.println(produto);
		System.out.print("\nEnter the number of products to be added in stock: ");
		produto.addProducts(sc.nextInt());
		System.out.println("Update data:");
		System.out.println(produto);
		System.out.print("Enter the number of products to be removed from stock: ");
		produto.removeProducts(sc.nextInt());
		System.out.println("Update data:");
		System.out.println(produto);
		sc.close();
	}

}
