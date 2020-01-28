package com.softeam.othmen.bank.services;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.softeam.othmen.bank.vo.Account;
import com.softeam.othmen.bank.vo.Client;
import com.softeam.othmen.bank.vo.Operation;

public class AccountServiceTest {
	
	private AccountService accountService;
	
	public AccountServiceTest() {
	}
	
	@Before
	public void setup() {
		accountService = AccountServiceImpl.getInstance();
	}

	
	@Test
	public void MakeDepositTest() {
		Client client = new Client();
		Account account = new Account(client, new BigDecimal(100), new ArrayList<Operation>());
		accountService.deposit(account, new BigDecimal(50));
		Assert.assertEquals(new BigDecimal(150), account.getBalance());
	}
	
	@Test
	public void MakeWithdrawalTest() {
		Client client = new Client();
		Account account = new Account(client, new BigDecimal(200), new ArrayList<Operation>());
		accountService.withdrawal(account, new BigDecimal(50));
		Assert.assertEquals(new BigDecimal(150), account.getBalance());
	}

}
