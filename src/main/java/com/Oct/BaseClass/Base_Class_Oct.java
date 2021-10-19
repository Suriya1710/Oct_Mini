package com.Oct.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_Oct {

	public static WebDriver driver; // ----> null

	public static WebDriver get_Driver(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");

			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();

		return driver;

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void close() {

		driver.close();

	}

	public static void dropdown(WebElement element, String type, String value) {

		Select s = new Select(element);
		
		
		if (type.equalsIgnoreCase("byIndex")) {
			
			int parseInt = Integer.parseInt(value);

			s.selectByIndex(parseInt);
			
		}

		else if (type.equalsIgnoreCase("byvalue")) {

			s.selectByValue(value);
			
		}

		else if (type.equalsIgnoreCase("byVisibleText")) {

			s.selectByVisibleText(value);
		}

	}

}
