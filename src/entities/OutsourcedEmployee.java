package entities;

public class OutsourcedEmployee extends Employee03 {

	private Double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public OutsourcedEmployee() {
		super();
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		// TODO Auto-generated method stub
		return super.payment() + ((110 / 100) * getAdditionalCharge());
	}

}
