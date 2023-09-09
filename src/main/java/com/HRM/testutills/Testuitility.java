package com.HRM.testutills;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.HRM.Base.BasePage;

public class Testuitility extends BasePage {

	public static long pageload=15;
	public static long impliciat=10; 
	
	public static void selectbootstrap(List<WebElement>opt,String value){
		for (WebElement Element : opt) {
			System.out.println(Element.getText());
			if(Element.getText().equalsIgnoreCase(value)){
				Element.click();
				break;
			}
		}
		
	}
	
	

}
