package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public double totalValueInStock() {

		return quantity * price;
	}

	public String toString() {
		return "\n" + "=======================================\n" + "Product           : " + name
				+ "\nStock Quantity    : " + quantity + String.format("\nAmount            : %.2f", price)
				+ String.format("\nStock Total Amount: %.2f", totalValueInStock())
				+ "\n=======================================";
	}
}
