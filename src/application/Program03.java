package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product produto = new Product();

		System.out.print("Enter Product Data:\n  Name:");
		produto.name = sc.nextLine();
		System.out.print("  Price:");
		produto.price = sc.nextDouble();
		System.out.print("  Quantity in Stock:");
		produto.quantity = sc.nextInt();

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
