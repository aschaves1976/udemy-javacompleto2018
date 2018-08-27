package entities;

public class Product02 {
	private String name;
	private double price;
	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product02(String name, double price, int quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}
	public Product02(String name, double price) {
		setName(name);
		setPrice(price);
	}

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
