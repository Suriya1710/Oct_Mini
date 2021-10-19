package com.Oct.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver ; //----> null
	
	@FindBy(id = "email")
	private WebElement username;

	@FindBy(name = "passwd")
	private WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement signin_Btn;

	public Login_Page(WebDriver ab) {

		this.driver = ab;
		PageFactory.initElements(driver, this);
		
	
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}

}
