package com.HRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.Base.BasePage;

public class HomePage extends BasePage {
	@FindBy(xpath = "//img[@alt='client brand banner']")
	WebElement logo;
	@FindBy(xpath = "//li[1]//a[1]//span[1]")
	WebElement adminlink;
	@FindBy(xpath="//span[normalize-space()='PIM']")
	WebElement pimlink;
	@FindBy(xpath = "//span[normalize-space()='Leave']")
	WebElement leavelink;
	
	public HomePage(){
	PageFactory.initElements(driver, this);
	}

	public boolean logopage() {
	boolean b=logo.isDisplayed();
	return b;
	}
	
	public AdminPage adminlinkpage() {
		adminlink.click();
		return new AdminPage();
		
	}
	public PimPage pimlinkpage() {
		pimlink.click();
	return new PimPage();
	}
	
	public LeavePage leavelinkpage() {
		leavelink.click();
	return new LeavePage();
	}
}
