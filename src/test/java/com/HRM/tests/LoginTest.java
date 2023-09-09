package com.HRM.tests;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HRM.Base.BasePage;
import com.HRM.Pages.HomePage;
import com.HRM.Pages.Loginpage;

public class LoginTest extends BasePage {
	
	Loginpage log;
	HomePage home;
	
	public LoginTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intilaze();
		log=new Loginpage();
	}
   @Test(priority = 1)
	public void validatetitletest() {	
	String title= log.validatetitle();
	Assert.assertEquals(title, "OrangeHRM");
	System.out.println("login page title test");
	   
	}
   @Test(priority = 2)
	public void validatelogotest() {
	boolean logo=log.validateloge();
	Assert.assertTrue(logo);
	System.out.println("login page  logo test");
	   
   }
   @Test(priority = 3)
   public void logintest() {
	 home=  log.validatelogin(prop.getProperty("username"),prop.getProperty("password"));
	 System.out.println("login page login test");
	   
   }
   @AfterMethod
   public void teardown() {
	   driver.quit();
   }
	
	
}
