package com.HRM.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HRM.Base.BasePage;
import com.HRM.Pages.AdminPage;
import com.HRM.Pages.HomePage;
import com.HRM.Pages.Loginpage;

public class Homepagetest extends BasePage{
	Loginpage log;
	HomePage home;
	AdminPage admin;
	
	Homepagetest(){
		super();
	}
	@BeforeMethod
	public void setup() {
		BasePage.intilaze();
		log=new Loginpage();
		home=log.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 4)
	public void validatehomepagelogo()  {
	boolean flag=home.logopage();
	Assert.assertTrue(flag);
	System.out.println("homepage logo test");
	}
	
	@Test(priority = 5)
	public void adminlinktest()throws InterruptedException {
	 admin=home.adminlinkpage();
	 Thread.sleep(5000);
	 
	 System.out.println(" homepage adminlink click");
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
