package com.capg.JUnit.UserJUnit;

import java.util.*;
import java.util.regex.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
interface IUserInputValidation{
	boolean validate(String userInput);
}

public class App {

	private static Logger LOG = LogManager.getLogger(App.class);
	static Scanner sc = new Scanner(System.in);
	
	IUserInputValidation validateName = name -> name.matches("[A-Z]{1}[a-z]{2,}");
	IUserInputValidation validateEmail = email -> email.matches("^[A-Za-z0-9]+([.+-][A-Za-z0-9-]+)?@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$");
	IUserInputValidation validateMobile = mobile -> mobile.matches("^[0-9]{2}[ ][0-9]{10}$");
    IUserInputValidation validatePassword = password -> password.matches("(?=^.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*([^(A-Za-z0-9)]{1})[0-9a-zA-Z]*");
	

	public static void main(String[] args) {
		App newUser = new App();

		LOG.info("Enter the First Name:");
		String firstName = sc.next();
		try {
		if(!(newUser.validateName.validate(firstName))) {
			throw new InvalidInputException("Invalid First Name");
		}}
		catch(InvalidInputException e){
			
		}

		LOG.info("Enter the Last Name:");
		String lastName = sc.next();
		try {
		if(!(newUser.validateName.validate(lastName))) {
			throw new InvalidInputException("Invalid Last Name");
		}}
		catch(InvalidInputException e) {
			
		}

		LOG.info("Enter the Email:");
		String email = sc.next();
		try {
		if(!(newUser.validateEmail.validate(email))) {
			throw new InvalidInputException("Invalid Email Id");
		}}
		catch(InvalidInputException e) {
			
		}
        
		sc.nextLine();
		LOG.info("Enter the Mobile Number:");
		String mobile = sc.nextLine();
		try {
		if (!(newUser.validateMobile.validate(mobile))) {
			throw new InvalidInputException("Invalid Email Id");
		}}
		catch(InvalidInputException e) {
			
		}

		LOG.info("Enter the Password:");
		String password = sc.next();
		try {
		if (!(newUser.validatePassword.validate(password))) {
			throw new InvalidInputException("Invalid Password");
		}}
		catch(InvalidInputException e) {
			
		}
		LOG.info("Exceptions Handled Successfully");
	}

}