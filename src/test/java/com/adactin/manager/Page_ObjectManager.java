package com.adactin.manager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Book_Hotel;
import com.adactin.pom.Log_Out;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Search_Hotelpage;
import com.adactin.pom.Select_Hotel;

public class Page_ObjectManager {
	
	public static WebDriver driver;
	
	private Login_Page lp;
	private Search_Hotelpage sp;
	private Select_Hotel sh;
	private Book_Hotel bh;
	private Log_Out lo;
	
	
	public Page_ObjectManager(WebDriver ldriver) {
	this.driver = ldriver;
	
		
	}
	public Login_Page getLp() {
		lp = new Login_Page(driver);
		return lp;
	}
	public Search_Hotelpage getSp() {
		sp = new Search_Hotelpage(driver);
		return sp;
	}
	public Select_Hotel getSh() {
		sh = new Select_Hotel(driver);
		return sh;
	}
	public Book_Hotel getBh() {
		bh = new Book_Hotel(driver);
		return bh;
	}
	public Log_Out getLo() {
		lo = new Log_Out(driver);
		return lo;
	}

}
