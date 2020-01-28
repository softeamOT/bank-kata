package com.softeam.othmen.bank.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.softeam.othmen.bank.vo.Account;
import com.softeam.othmen.bank.vo.Client;
import com.softeam.othmen.bank.vo.Operation;
import com.softeam.othmen.bank.vo.Operation.OperationType;

import static org.assertj.core.api.Assertions.assertThat;

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
		accountService.deposit(account, new BigDecimal(50), LocalDateTime.now());
		Assert.assertEquals(new BigDecimal(150), account.getBalance());
	}
	
	@Test
	public void MakeWithdrawalTest() {
		Client client = new Client();
		Account account = new Account(client, new BigDecimal(200), new ArrayList<Operation>());
		accountService.withdrawal(account, new BigDecimal(50), LocalDateTime.now());
		Assert.assertEquals(new BigDecimal(150), account.getBalance());
	}
	
	@Test
	public void checkOperationsHistoryTest() {
		Client client = new Client();
		Account account = new Account(client);
		LocalDateTime depositTime = LocalDateTime.now();
		accountService.deposit(account, new BigDecimal(100), depositTime);
		LocalDateTime withdrawalTime = LocalDateTime.now();
		accountService.withdrawal(account, new BigDecimal(50), withdrawalTime);

		Operation operation1 = new Operation(OperationType.DEPOSIT, new BigDecimal(100), depositTime);
		Operation operation2 = new Operation(OperationType.WITHDRAWAL, new BigDecimal(50), withdrawalTime);
		assertThat(account.getOperations()).hasSize(2);
		assertThat(account.getOperations()).contains(operation1, operation2);
		
	}

}
