package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	 public static WebDriver driver;
	
	public static WebDriver getbrowser(String browser) {
		//                                                        1/[browser launch]
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
				 driver = new ChromeDriver();
				
			}

			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("\\Driver\\msedgedriver.exe"));
			    driver = new EdgeDriver();
			}
			else {
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}
                                                            //0   get url
	     public static void geturl(String url) {
		    try {
			driver.get(url);
		    } catch (Exception e) {
			e.printStackTrace();
		}
		    
		    
          
	}                                                        
	                                                            //1 webelement method
	     public static void findWE(By element) {
			try {
				WebElement findElement = driver.findElement(element);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	     
	     
                                                                //2 click method  
	  public static <by> void click(by element) {
		     try {
				((WebElement) element).click();
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
		
	
	                                                             //3 sendkey method
	public static void input(WebElement element,String value) {
		  try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		                                                        // 4 select method [value,index,webelement]	
		
	                                                           
	  public static void select(By AA, String BB) {
		  try {
			WebElement findElement = driver.findElement(AA);
			  Select s = new Select(findElement);
			  s.selectByValue(BB);
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
	}
	                                                           //5 Action method
	  public static void action(By CC) {
		try {
			WebElement findElement = driver.findElement(CC);
			Actions ac = new Actions(driver);
			ac.moveToElement(findElement).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	                                                         // 6 Screenshot method
      public static void takes() throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File file = new File("C:\\Users\\Kumar\\eclipse-workspace\\SeleniumProject\\Screen\\image.png");
			FileUtils.copyFile(screenshotAs, file);
		} catch (WebDriverException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		 

	}
                                                                               //7 scrollup,dowm
        public static void scroll(By xpath, Object down, Object  up) {
		try {
			WebElement findElement = driver.findElement(xpath);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].ScrollIntoView();", down);
			js.executeScript("arguments[0],ScrollIntoView();",  up);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
		
	}
                                                                                    //8 wait exception concept
        public static void waits() {
        	try {
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	                                                                                // 9 alert
        public static  void alertss(By path) {
         try {
			WebElement findElement = driver.findElement(path);
			 driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}

		}
                                                                // 10  iframe 
        public static void frame(By findwe) {
			try {
				WebElement findElement = driver.findElement(findwe);
				driver.switchTo().frame(findElement);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
                                                              // 11 windowclose
        public static void close() {
			try {
				driver.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}                                     
                                                          // 12 windowquit
              public static void quits() {
				try {
					driver.quit();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}                                                  
                                                                   //13 navigateto&back
              public static  void navigate(String navigateto) {
				try {
					driver.navigate().to(navigateto);
					driver.navigate().back();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


		
        

