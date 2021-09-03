package com.example.exception;

public class DivideException extends RuntimeException{
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}

}
