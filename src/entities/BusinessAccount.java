package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		setLoanLimit(loanLimit);
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.00;
		}
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		balance -= 2.0;
	}

}
