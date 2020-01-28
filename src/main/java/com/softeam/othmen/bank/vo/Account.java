package com.softeam.othmen.bank.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {
	
	protected Client client;
	
	protected BigDecimal balance;
	
	protected List<Operation> operations;

	public Account(Client client) {
		this.client = client;
		this.balance = new BigDecimal(0);
		this.operations = new ArrayList<Operation>();
	}
	
	public Account(Client client, BigDecimal balance, List<Operation> operations) {
		this.client = client;
		this.balance = balance;
		this.operations = operations;
	}

	public Client getClient() {
		return client;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public List<Operation> getOperations() {
		return operations;
	}
	
}
