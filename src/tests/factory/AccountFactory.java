package tests.factory;

import entities.Account;

public class AccountFactory {
	public static Account creatEmptyAccount() {
		return new Account(1L, 0.0);
	}
	
	public static Account creatAccount(double initialBalance) {
		return new Account(1L, initialBalance);
	}
}
