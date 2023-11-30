package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {
	
	// Teste de depósito e desconto de taxa
	
	@Test		// Nome padrão <AÇAO> should <EFEITO> [when <CENARIO>]
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		/*
		 * Implementação com padrão AAA:
		 * Arrange: instancie os objetos necessários
		 * Act: execute as ações necessárias
		 * Assert: declare o que deveria acontecer (resultado esperado)
		 */
		
		// Arrange
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L, 0.0);
		
		// Act
		acc.deposit(amount);		
		
		// Assert: declare o que deveria acontecer (resultado esperado)
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}

}
