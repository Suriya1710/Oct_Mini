package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Oct.Pom.Home_Page;
import com.Oct.Pom.Login_Page;

public class Page_Object_Manager {

	public WebDriver driver; // ----> null

	// private Class Name Object Name

	private Home_Page hp;

	private Login_Page login;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
	
	}

	public Home_Page getInstanceHp() {

		hp = new Home_Page(driver);
		
		return hp;

	}

	public Login_Page getInstanceLogin() {

		login = new Login_Page(driver);
		
		return login;

	}

}
