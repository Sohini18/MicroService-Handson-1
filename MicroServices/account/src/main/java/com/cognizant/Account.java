package com.cognizant;

public class Account {

	public Account(String number, String type, long balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	private String number;
	private String type;
	private long balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	
	
}
