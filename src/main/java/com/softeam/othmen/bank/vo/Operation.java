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
	
	@Override
	public int hashCode() {
		int result = type != null ? type.hashCode() : 0;
		result = 31 * result + (amount != null ? amount.hashCode() : 0);
		result = 17 * result + (dateTime != null ? dateTime.hashCode() : 0);
		return result;
	}	

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Operation operation = (Operation) o;

		if (type != null ? !type.equals(operation.type) : operation.type != null) {
			return false;
		}
		if (amount != null ? !amount.equals(operation.amount) : operation.amount != null) {
			return false;
		}
		if (dateTime != null ? !dateTime.equals(operation.dateTime) : operation.dateTime != null) {
			return false;
		}
		return true;
	}

}
