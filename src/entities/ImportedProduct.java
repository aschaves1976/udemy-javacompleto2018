package entities;

public class ImportedProduct extends Product04 {
	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		setCustomsFee(customsFee);
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() + getCustomsFee();
	}

	@Override
	public final String priceTag() {
		return getName() + String.format(" $%.2f (Customs fee: $%.2f)", totalPrice(), getCustomsFee());
	}

}
