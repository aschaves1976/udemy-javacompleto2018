package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product04;
import entities.UsedProduct;

public class ProgramEx10Product {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product04> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int numOfProducts = sc.nextInt();

		for (int i = 0; i < numOfProducts; i++) {
			sc.nextLine();
			System.out.println("Product #" + (i + 1) + " data:");

			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (productType == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));

			} else if (productType == 'u') {
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.nextLine());
				list.add(new UsedProduct(name, price, manufactureDate));
			} else {
				list.add(new Product04(name, price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		System.out.println("===========");
		for (Product04 prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}

}
