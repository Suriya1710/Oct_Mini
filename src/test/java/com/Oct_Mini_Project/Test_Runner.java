package com.Oct_Mini_Project;


import org.openqa.selenium.WebDriver;

import com.Oct.BaseClass.Base_Class_Oct;
import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Test_Runner extends Base_Class_Oct {

	public static WebDriver driver = Base_Class_Oct.get_Driver("chrome"); // ----> null

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		getUrl("http://automationpractice.com/index.php");

		clickOnElement(pom.getInstanceHp().getSignin_Btn());

		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();

		inputValueElement(pom.getInstanceLogin().getUsername(), username);

		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();

		inputValueElement(pom.getInstanceLogin().getPassword(), password);

		clickOnElement(pom.getInstanceLogin().getSignin_Btn());

		close();

	}

}
