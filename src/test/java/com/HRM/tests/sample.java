package com.HRM.tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	@Test
	public static void main() throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver(opt);
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
     driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
     
     Thread.sleep(4000);
     driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
    WebElement
  ele=new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")));
    
     ele.sendKeys("Aaliyah.Haq");
     driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]")).click();
     
     driver.findElement(By.xpath("(//span[contains(text(),'Admin')])[1]")).click();
     
   WebElement el=  driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
   
		   el.sendKeys("Aaliyah Haq");
		   el.sendKeys(Keys.ARROW_DOWN);
		   el.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
     driver.findElement(By.xpath("(//span[normalize-space()='Enabled'])[1]")).click();
     
   
     
    
     
     
     }
}
