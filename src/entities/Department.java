package entities;

public class Department {
	private String name;

	public Department(String name) {
		setName(name);
	}

	public Department() {

	}

	@Override
	public String toString() {
		return "Department: " + getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
