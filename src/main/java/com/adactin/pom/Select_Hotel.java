package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement button;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement conitue;

	public Select_Hotel(WebDriver searchdriver) {
		this.driver = searchdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getConitue() {
		return conitue;
	}

}
