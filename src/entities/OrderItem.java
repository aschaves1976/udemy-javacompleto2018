package entities;

public class OrderItem {
	Integer quantity;
	Double price;
	Product03 product;

	public OrderItem(Integer quantity, Double price, String productName) {
		setQuantity(quantity);
		setPrice(price);
		product = new Product03(productName, price);
	}

	public OrderItem() {

	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public double subTotal() {
		return getPrice() * getQuantity();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.toString() + String.format(", Quantity: %d, Subtotal:%.2f%n", getQuantity(), subTotal()));

		return sb.toString();
	}
}
