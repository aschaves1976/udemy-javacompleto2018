package entities;

public class Employee {
	String name;
	double grossSalary;
	double tax;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double netSalary() {
		return getGrossSalary() - getTax();
	}

	public void increaseSalary(double percentage) {
		double newSalary = this.grossSalary * (percentage / 100) + this.grossSalary;
		setGrossSalary(newSalary);
	}

	public String toString() {
		return getName() + String.format(" $ %.2f", netSalary());
	}
}
