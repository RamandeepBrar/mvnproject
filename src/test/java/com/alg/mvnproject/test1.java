package com.alg.mvnproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1 {
	
	static WebDriver driver;
	@Test
   public void setUp(){
	System.setProperty("Webdriver.ChromeDriver.driver","chromedriver.exe");
	driver= new ChromeDriver();
   } 
      
  @Test(dependsOnMethods={"setUp"})
     public void test(){
    	driver.get("https://www.google.ca/");
    	System.out.println("#######################");
    	System.out.println("Test passed");
    	driver.quit();
    }
}

