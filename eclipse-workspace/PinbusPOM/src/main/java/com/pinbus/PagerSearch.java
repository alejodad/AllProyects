package com.pinbus;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagerSearch {
	WebDriver driver;
	WebDriverWait wait;
	
	By grpResults = By.xpath("//div[contains(@class,'filter-box results')]");
	PinbusPOM objPinbusPOM = new PinbusPOM(driver, wait);
	
	public PagerSearch(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public WebElement FtnGetElement() throws IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(grpResults));
		
		objPinbusPOM.WriteInInput(driver,grpResults);
		return driver.findElement(grpResults);
	}
}
