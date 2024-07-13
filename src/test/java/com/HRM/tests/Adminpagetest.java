package com.HRM.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HRM.Base.BasePage;
import com.HRM.Pages.AdminPage;
import com.HRM.Pages.HomePage;
import com.HRM.Pages.Loginpage;

public class Adminpagetest extends BasePage{
	Loginpage log;
	HomePage home;
	AdminPage admin;

	Adminpagetest(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		BasePage.intilaze();
		log=new Loginpage();
	home=log.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
	admin=home.adminlinkpage();
		
	}
	
	@Test(priority = 6 )
	public void adminlogotest() {
		boolean b= admin.adminlogo();
		Assert.assertTrue(b);
		System.out.println("Admin page logo test ");
	}
	
	@Test(priority = 7)
	public void linktest() throws Exception {
		admin=new AdminPage();
		admin.links(prop.getProperty("name"));
		System.out.println("admin page data entring");
		
	}
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
}
