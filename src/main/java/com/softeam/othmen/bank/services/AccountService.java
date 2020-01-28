package com.softeam.othmen.bank.services;

import java.math.BigDecimal;

import com.softeam.othmen.bank.vo.Account;

public interface AccountService {
	
	public void deposit(Account account, BigDecimal amount);

	public void withdrawal(Account account, BigDecimal bigDecimal);

}
