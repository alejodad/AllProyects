package co.com.sophos.testing;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Date;
import java.io.IOException;
import  java.text.SimpleDateFormat;
public class ClsPinbusTest {

	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);	


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		driver.get("https://pinbus.com/"); 
		driver.manage().window().maximize(); 
	
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException, IOException {
		
		ClsOperations.WriteInputLocation(driver,wait, ClsOperations.strIda, ClsOperations.strXpathOrigin);
		ClsOperations.WriteInputLocation(driver,wait,ClsOperations.strRegreso, ClsOperations.strXpathDestiny);
		ClsOperations.FntGetDate(driver,ClsOperations.srtXpathDepartureDate, ClsOperations.strNumberDivDeparture,ClsOperations.strDepartureDate);
		ClsOperations.FntGetDate(driver,ClsOperations.srtXpathRetunrDate,  ClsOperations.strNumberDivReturn,ClsOperations.srtReturnDate);
		ClsOperations.FntSubmit( driver) ;
	}
	
	

}
