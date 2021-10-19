package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p; // ----> null

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Eclipse\\Demo\\Oct_Mini_Project\\src\\main\\java\\com\\config\\properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		 p = new Properties();  //-----> Static 

		p.load(fis);

	}

	public String getUsername() throws Throwable {

		// retrieve the user name

		String username = p.getProperty("username");

		return username;

	}

	public String getPassword() throws Throwable {

		// retrieve the password

		String password = p.getProperty("password");

		return password;

	}

	
}
