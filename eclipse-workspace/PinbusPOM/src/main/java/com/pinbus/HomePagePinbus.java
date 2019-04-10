	package com.pinbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePinbus {
	public WebDriver driver;
	public WebDriverWait wait;
	
	By XpathHome = By.xpath("//a[contains(@class,'navbar-brand')]");
	
	public HomePagePinbus(WebDriver driver,WebDriverWait wait) 
	{
		this.driver = driver;
		this.wait = wait;
	}
	
	public void BackToHome() {
		driver.findElement(XpathHome).click();
	}

}
