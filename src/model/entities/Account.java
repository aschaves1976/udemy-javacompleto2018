package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		setNumber(number);
		setHolder(holder);
		setBalance(balance);
		setWithdrawLimit(withdrawLimit);
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	private void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	private void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	public void withdraw(Double amount) {
		if (withdrawLimit < amount) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (balance <= 0 || balance < amount) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "Account: " + getNumber() + ", Holder: " + getHolder()
				+ String.format(", Balance: $%.2f, WithdrawLimit: $%.2f", getBalance(), getWithdrawLimit());
	}

}
