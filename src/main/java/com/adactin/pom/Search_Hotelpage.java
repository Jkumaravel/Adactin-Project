package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotelpage {

	public static WebDriver driver;
	
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@name='room_nos']" )
	private WebElement roomnos;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement datein;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement dateout;
	
	@FindBy(xpath = "//input[@name='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childroom;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search;

	public Search_Hotelpage(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}
	
}
