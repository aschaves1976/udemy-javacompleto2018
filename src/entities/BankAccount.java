package entities;

public class BankAccount {
	private int acctNumber;
	private String owner;
	private double totalAmount;
	private static final double RATE = 5.00;

	public BankAccount(int acctNumber, String owner, double firstDeposit) {
		setAcctNumber(acctNumber);
		setOwner(owner);
		deposit(firstDeposit);

	}

	public BankAccount(int acctNumber, String owner) {
		setAcctNumber(acctNumber);
		setOwner(owner);
	}

	private int getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	private void setTotalAmount(double totalAmount) {
		this.totalAmount += totalAmount;
	}

	public void deposit(double amount) {
		setTotalAmount(amount);
	}

	public void withDraw(double amount) {
		this.totalAmount -= (amount + RATE);
	}

	public String toString() {
		return "Account data:\n" + String.format(" Account %d, Holder: %s, Balance: $%.2f", getAcctNumber(), getOwner(),
				getTotalAmount());
	}

}
