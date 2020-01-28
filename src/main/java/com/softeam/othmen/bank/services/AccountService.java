package com.softeam.othmen.bank.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.softeam.othmen.bank.vo.Account;

public interface AccountService {
	
	public void deposit(Account account, BigDecimal amount, LocalDateTime time);

	public void withdrawal(Account account, BigDecimal bigDecimal, LocalDateTime time);

}
