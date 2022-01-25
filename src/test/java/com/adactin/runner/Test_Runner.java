package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.Base_Class;
import com.adactin.properties.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature//Adactin.feature",
glue = "com\\adactin\\stepdefinition")


public class Test_Runner {

	public static WebDriver driver;
	
	@BeforeClass
    public static void set_up() throws Throwable  {
		String browser = FileReaderManager.getInstance().getInstanceCR().getbrowser();
		driver = Base_Class.getbrowser(browser);

		
		
		
	}	

	
	
}
