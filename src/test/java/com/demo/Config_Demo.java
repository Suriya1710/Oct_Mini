package com.demo;

public class Config_Demo {

	public Config_Demo() {

		System.out.println(".property into file");

		System.out.println("Create FIS");

		System.out.println("create object for properties");

		System.out.println("load the fis into properties");

	}

	public String getUsername() {

		System.out.println("getProperty(Username)");

		System.out.println("return the value");

		String value = "username";

		return value;
	}

	public String getPassword() {

		System.out.println("getProperty(Password)");

		System.out.println("return the value");

		String password = "password";

		return password;
	}

}
