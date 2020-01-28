package com.softeam.othmen.bank.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Operation {
	
	public static enum OperationType {
		DEPOSIT,
		WITHDRAWAL
	}
	
	protected OperationType type;
	
	protected BigDecimal amount;
	
	protected LocalDateTime dateTime;

	public Operation(OperationType type, BigDecimal amount, LocalDateTime dateTime) {
		super();
		this.type = type;
		this.amount = amount;
		this.dateTime = dateTime;
	}

	public OperationType getType() {
		return type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
}
