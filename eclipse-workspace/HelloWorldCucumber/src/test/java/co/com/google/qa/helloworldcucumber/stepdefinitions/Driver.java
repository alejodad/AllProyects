package co.com.google.qa.helloworldcucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private WebDriver driver;
	private final String Driver ="webdriver.chrome.driver";
	private final String ruta = "C:\\Selenium\\chromedriver.exe";
	private final String dirWeb ="https://www.google.com.co"; 
	
	public Driver(WebDriver driver) {
		this.driver=driver;		
	}
	
	public WebDriver configurateNavigator() {
		System.setProperty(Driver, ruta);
	    driver = new ChromeDriver();
	    return driver;
	}			
	
	public void openNavigator() {
		driver.get(dirWeb);
	}
	
	public void maximizeNavigator() {
		driver.manage().window().maximize();
		
	}
}
