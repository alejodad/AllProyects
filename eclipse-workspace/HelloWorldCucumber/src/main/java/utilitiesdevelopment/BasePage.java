package utilitiesdevelopment;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver= driver;
		wait = new WebDriverWait(driver, 15);
	}
	
	   //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
 
    //Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
 
    //Write Text
    public void writeIntxtSearch (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
 
    //Read Text
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
 
    //Assert
    public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        //Assert.assertEquals(readText(elementBy), expectedText);
    }
    
    //
    public WebElement returnText(By elementBy) {
    	return driver.findElement(elementBy);
    }
    
    public void getEvidence(String nombre) throws Exception{
    	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(src, new File("C:/selenium/"+nombre+".png"));    	
    }

}
