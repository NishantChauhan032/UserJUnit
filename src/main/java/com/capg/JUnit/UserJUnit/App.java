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

	public static void main(String[] args) {
		App newUser = new App();

		LOG.info("Enter the First Name:");
		String firstName = sc.next();
		while (!(newUser.validateName(firstName))) {
			LOG.info("Invalid Entry. Enter the First Name:");
			firstName = sc.next();
		}

		LOG.info("Enter the Last Name:");
		String lastName = sc.next();
		while (!(newUser.validateName(lastName))) {
			LOG.info("Invalid Entry. Enter the Last Name:");
			lastName = sc.next();
		}

	}

}