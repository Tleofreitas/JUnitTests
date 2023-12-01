package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {
	/*
	 * Implementação com padrão AAA:
	 * Arrange: instancie os objetos necessários
	 * Act: execute as ações necessárias
	 * Assert: declare o que deveria acontecer (resultado esperado)
	 */
	
	// Teste de depósito e desconto de taxa
	@Test		// Nome padrão <AÇAO> should <EFEITO> [when <CENARIO>]
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		
		// Arrange
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new AccountFactory().creatEmptyAccount();
		
		// Act
		acc.deposit(amount);		
		
		// Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	// deposito não faz nada quando quantia for negativa
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		// Arrange
		double expectedValue = 100.0;
		Account acc = new AccountFactory().creatAccount(expectedValue);
		double amount = -200.0;
		
		// Act
		acc.deposit(amount);
		
		// Assert
		Assertions.assertEquals(expectedValue,acc.getBalance());
	}

}
