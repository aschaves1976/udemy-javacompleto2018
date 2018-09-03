package entities;

public class Product03 {
	private String name;
	private Double price;

	public Product03(String name, double price) {
		setName(name);
		setPrice(price);
	}

	public Product03() {

	}

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

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + String.format(", $%.2f", getPrice()));
		return sb.toString();
	}
}
