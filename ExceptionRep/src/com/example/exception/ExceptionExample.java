package com.example.exception;

public class ExceptionExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(12, 0);
		c1.divide();
	}

}
