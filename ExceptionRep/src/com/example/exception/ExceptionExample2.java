package com.example.exception;

public class ExceptionExample2 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(12, 0);
		c1.divide();
	}

}
