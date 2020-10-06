package com.capg.JUnit.UserJUnit;

import java.util.*;
import java.util.regex.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	private static Logger LOG = LogManager.getLogger(App.class);
	static Scanner sc = new Scanner(System.in);

	public boolean validateName(String name) {
		boolean validate = Pattern.matches("[A-Z]{1}[a-z]{2,}", name);
		return validate;
	}
	public boolean validateEmail(String email) {
		boolean validate = Pattern.matches("^[A-Za-z0-9]+([.+-][A-Za-z0-9-]+)?@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$", email);
		return validate;
	}
	public boolean validateMobile(String mobile) {
		boolean validate = Pattern.matches("^[0-9]{2}[ ][0-9]{10}$", mobile);
		return validate;
	}
	public boolean validatePassword(String password) {
		boolean validate = Pattern.matches("(?=^.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*([^(A-Za-z0-9)]{1})[0-9a-zA-Z]*", password);
		return validate;
	}

	public static void main(String[] args) {
		App newUser = new App();

		LOG.info("Enter the First Name:");
		String firstName = sc.next();
		try {
		if(!(newUser.validateName(firstName))) {
			throw new InvalidInputException("Invalid First Name");
		}}
		catch(InvalidInputException e){
			
		}

		LOG.info("Enter the Last Name:");
		String lastName = sc.next();
		try {
		if(!(newUser.validateName(lastName))) {
			throw new InvalidInputException("Invalid Last Name");
		}}
		catch(InvalidInputException e) {
			
		}

		LOG.info("Enter the Email:");
		String email = sc.next();
		try {
		if(!(newUser.validateEmail(email))) {
			throw new InvalidInputException("Invalid Email Id");
		}}
		catch(InvalidInputException e) {
			
		}
        
		sc.nextLine();
		LOG.info("Enter the Mobile Number:");
		String mobile = sc.nextLine();
		try {
		if (!(newUser.validateMobile(mobile))) {
			throw new InvalidInputException("Invalid Email Id");
		}}
		catch(InvalidInputException e) {
			
		}

		LOG.info("Enter the Password:");
		String password = sc.next();
		try {
		if (!(newUser.validateMobile(password))) {
			throw new InvalidInputException("Invalid Password");
		}}
		catch(InvalidInputException e) {
			
		}
		LOG.info("Exceptions Handled Successfully");
	}

}