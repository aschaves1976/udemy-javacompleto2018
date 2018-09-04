package entities;

public class LegalEntity extends Contribuinte {
	private Integer numOfEmployees;

	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double annualIncome, Integer numOfEmployees) {
		super(name, annualIncome);
		setNumOfEmployees(numOfEmployees);
	}

	public Integer getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(Integer numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}

	@Override
	public Double taxCalculation() {
		double result = 0;
		if (getNumOfEmployees() <= 10) {
			result = getAnnualIncome() * 16 / 100;
		} else {
			result = getAnnualIncome() * 14 / 100;
		}
		return result;
	}

	@Override
	public final String toString() {
		return super.toString() + String.format(" $%.2f", taxCalculation());
	}

}
