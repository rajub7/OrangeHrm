package com.HRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.Base.BasePage;

public class Loginpage extends BasePage {
	
	
	@FindBy(xpath ="//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement logo;
	
	
	
	public Loginpage() {
    PageFactory.initElements(driver, this);
		
	}
	
	public String validatetitle() {
		String title=driver.getTitle();
		return title;
		
	}
	public boolean validateloge() {
	boolean	lo=logo.isDisplayed();
	return lo;
	
	}
	public HomePage validatelogin(String uid,String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
		
	}
 
}
