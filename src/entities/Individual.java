package entities;

public class Individual extends Contribuinte {
	private Double healthSpending;

	public Individual() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Individual(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		setHealthSpending(healthSpending);
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public final Double taxCalculation() {
		double result = 0;
		if (getAnnualIncome() < 20000.0 && healthSpending == null) {
			result = getAnnualIncome() * 15 / 100;
		} else if (getAnnualIncome() < 20000.0 && healthSpending != null) {
			result = (getAnnualIncome() * 15 / 100) - (healthSpending * 50 / 100);
		} else if (getAnnualIncome() > 20000.0 && healthSpending == null) {
			result = getAnnualIncome() * 25 / 100;
		} else if (getAnnualIncome() > 20000.0 && healthSpending != null) {
			result = (getAnnualIncome() * 25 / 100) - (healthSpending * 50 / 100);
		}
		return result;
	}

	@Override
	public final String toString() {
		return super.toString() + String.format(" $%.2f", taxCalculation());
	}

}
