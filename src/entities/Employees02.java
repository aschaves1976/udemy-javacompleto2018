package entities;

public class Employees02 {
	private String name;
	private Double salary;
	private Integer id;

	public Employees02(String name, Double salary, int id) {
		setName(name);
		setSalary(salary);
		setId(id);
	}

	public void upgradeSalary(double percentage) {
		double aux = percentage / 100;
		aux *= getSalary();
		aux += getSalary();
		setSalary(aux);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String toString() {
		return String.format("%n %d, %s, %.2f", getId(), getName(), getSalary());
	}
}
