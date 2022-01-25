package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Out {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;

	public Log_Out(WebDriver logoutdriver) {
		this.driver = logoutdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	

}
