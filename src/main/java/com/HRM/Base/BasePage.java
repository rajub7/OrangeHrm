
package com.HRM.Base;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.HRM.testutills.Testuitility;
import com.HRM.testutills.WebEventListner;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver;
	public static Properties prop;

	public static EventFiringWebDriver edriver;
	public static WebEventListner eventlistener;
	public BasePage() {
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("E:\\selineum.project\\selleniuminterviewquotions\\OrangeHrm\\src\\main\\java\\com\\HRM\\config\\config.propertyfile");
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void intilaze()  {
	String browsername=	prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("Chrome")) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	//	WebDriverManager.chromedriver().setup();;
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver(opt);
	}
	else if (browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}
	
	edriver=new EventFiringWebDriver(driver);
	eventlistener=new WebEventListner();
	edriver.register(eventlistener);
	driver=edriver;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
		
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(prop.getProperty("url"));
		
	}

}
