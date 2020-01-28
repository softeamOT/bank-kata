package com.softeam.othmen.bank.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.softeam.othmen.bank.vo.Operation.OperationType;

public class OperationTest {
	
	@Test
	public void equalsTest() {
		LocalDateTime now = LocalDateTime.now();
		Operation operation1 = new Operation(OperationType.DEPOSIT, new BigDecimal(100), now);
		Operation operation2 = new Operation(OperationType.DEPOSIT, new BigDecimal(100), now);
		Assertions.assertThat(operation1).isEqualTo(operation2);
	}

}
