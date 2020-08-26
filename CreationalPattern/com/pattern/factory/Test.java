package com.pattern.factory;

public class Test {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.createAccount("Current");
	}
}
