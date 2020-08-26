package com.pattern.factory;

public class SalaryAccount implements Account {

	@Override
	public void fillForm() {
		System.out.println("Filling Salary Account Form");
	}

	@Override
	public void checkDocuments() {
		System.out.println("Documents Submitted..");
	}

}
