package com.softeam.othmen.bank.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.softeam.othmen.bank.vo.Account;
import com.softeam.othmen.bank.vo.Operation;
import com.softeam.othmen.bank.vo.Operation.OperationType;

public class AccountServiceImpl implements AccountService {
	
	private static AccountServiceImpl INSTANCE;
	
	private AccountServiceImpl() {
	}
	
	public static AccountServiceImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new AccountServiceImpl();
		}
		
		return INSTANCE;
	}

	public void deposit(Account account, BigDecimal amount, LocalDateTime time) {
		account.setBalance(account.getBalance().add(amount));
		Operation operation = new Operation(OperationType.DEPOSIT, amount, time);
		account.getOperations().add(operation);
	}

	public void withdrawal(Account account, BigDecimal amount, LocalDateTime time) {
		account.setBalance(account.getBalance().subtract(amount));
		Operation operation = new Operation(OperationType.WITHDRAWAL, amount, time);
		account.getOperations().add(operation);	
	}

}
