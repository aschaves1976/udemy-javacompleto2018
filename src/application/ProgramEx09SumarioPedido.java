package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

public class ProgramEx09SumarioPedido {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Birth Date(DD/MM/YYYY): ");
		Date birthday = sdf.parse(sc.nextLine());

		Client client = new Client(name, email, birthday);

		System.out.println("Enter order data:");

		System.out.print("Status: ");
		OrderStatus os = OrderStatus.valueOf(sc.nextLine());

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		Order order;
		order = new Order(client, new Date(), os);
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			order.addItem(new OrderItem(quantity, productPrice, productName));
		}

		System.out.println(order);
		sc.close();
	}

}
