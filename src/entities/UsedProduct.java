package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product04 {

	private Date manufactureDate;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		setManufactureDate(manufactureDate);

	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public final String priceTag() {
		// TODO Auto-generated method stub
		return super.priceTag() + "(Manufacture date: " + sdf.format(getManufactureDate()) + ")";
	}

}
