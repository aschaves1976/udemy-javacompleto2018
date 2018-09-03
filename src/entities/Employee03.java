package entities;

public class Employee03 {
	private String name;
	private Integer hours;
	private Double valuePerHour;

	public Employee03() {

	}

	public Employee03(String name, Integer hours, Double valuePerHour) {
		setName(name);
		setHours(hours);
		setValuePerHour(valuePerHour);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double payment() {
		return getHours() * getValuePerHour();
	}

	@Override
	public String toString() {
		return getName() + String.format(" - $ %.2f", payment());
	}

}
