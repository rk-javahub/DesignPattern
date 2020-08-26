package com.pattern.factory;

public class Bank {
	Account account = null;

	public void createAccount(String accountType) {
		account=AccountFactory.createAccount(accountType);
		account.fillForm();
		account.checkDocuments();
	}
}
