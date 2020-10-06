package com.capg.JUnit.UserJUnit;

public class InvalidInputException extends Exception {
	
	InvalidInputException(String s){
	super(s);
	System.out.println(s);
  }
}
