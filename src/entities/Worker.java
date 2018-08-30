package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
	private String name;
	private WorkLevel level;
	private Double baseSalary;

	private Department department;
	private List<HourContract> contract = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkLevel level, Double baseSalary, Department department) {
		setName(name);
		setLevel(level);
		setBaseSalary(baseSalary);
		setDepartment(department);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContract() {
		return contract;
	}

	private void setContract(HourContract contract2) {
		contract.add(contract2);
	}

	public void addContract(HourContract contract) {
		setContract(contract);
	}

	public void removeContract(HourContract contract2) {
		contract.remove(contract2);
	}

	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();

		for (HourContract c : contract) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
