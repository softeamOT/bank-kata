package com.softeam.othmen.bank.services;

import java.math.BigDecimal;

import com.softeam.othmen.bank.vo.Account;

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

	public void deposit(Account account, BigDecimal amount) {
		account.setBalance(account.getBalance().add(amount));
	}

	public void withdrawal(Account account, BigDecimal amount) {
		account.setBalance(account.getBalance().subtract(amount));		
	}

}
