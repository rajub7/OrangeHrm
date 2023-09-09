package com.HRM.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HRM.Base.BasePage;
import com.HRM.testutills.Testuitility;

public class AdminPage extends BasePage {
	
	@FindBy(xpath ="//h6[normalize-space()='User Management']")
	WebElement adminpagelogo;
	
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement adminuser;
    
    @FindBy(xpath = "//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
    WebElement ele;
    
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement ele1;
    
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement ele2;
    
    @FindBy(xpath = "//div[4]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
    WebElement ele3;
    
    @FindBy(xpath = "//div[@role='listbox']//div[2]")
    WebElement ele4;
    
   public AdminPage(){
    	PageFactory.initElements(driver, this);
    }
    
    public boolean adminlogo() {
    	
    boolean flag=adminpagelogo.isDisplayed();
    return flag;
    	
    }
    
    public void links(String uid) throws Exception {
    	  
     adminuser=new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")));
    	  
    	adminuser.sendKeys(uid);
    	Thread.sleep(4000);
    	ele.click();
    	Thread.sleep(3000);
    	ele1.click();
    	ele2.sendKeys(uid);
    	Thread.sleep(3000);
    	ele3.click();
    	ele.click();
    	
    	
    }

	
    
    

}
