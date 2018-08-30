package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;

	public HourContract() {

	}

	public HourContract(Date date, Double valuePerHour, Integer hours) {
		setDate(date);
		setValuePerHour(valuePerHour);
		setHours(hours);
	}

	@Override
	public String toString() {
		return "Hour Contract:" + getDate() + ", Value PerHour: " + getValuePerHour() + ", Hours:" + getHours();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double totalValue() {
		return getValuePerHour() * getHours();
	}

}
