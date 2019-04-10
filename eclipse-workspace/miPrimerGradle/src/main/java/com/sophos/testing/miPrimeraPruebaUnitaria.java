package com.sophos.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class miPrimeraPruebaUnitaria {
	WebDriver driver; 
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver  = new ChromeDriver();

	}

	@After
	public void tearDown() throws Exception
	{
		//driver.close();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test()
	{
		driver.get("https:\\www.google.com.uy");
		/*driver.findElement(By.name("q")).sendKeys("selenium get screenshot java ");
		driver.findElement(By.name("btnK")).submit();*/
		String ejemplo = driver.findElement(By.name("btnI")).getText();
		Assert.assertEquals("Me siento con suerte", ejemplo);
	}
	
	public void test2()
	{
		driver.get("https:\\www.google.com.uy");
		driver.findElement(By.name("q")).sendKeys("noticias");
		driver.findElement(By.name("btnK")).submit();
	}

}
