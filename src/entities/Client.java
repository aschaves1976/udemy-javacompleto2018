package entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	String name;
	String email;
	Date birthDate;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Client(String name, String email, Date birthDate) {
		setName(name);
		setEmail(email);
		setBirthDate(birthDate);
	}

	public Client() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " (" + sdf.format(getBirthDate()) + ") - " + getEmail());
		return sb.toString();
	}

}
