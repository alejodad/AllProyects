package utilitiesdevelopment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLight {
	private WebDriver driver;
	
	public HighLight(WebDriver driver) {
		this.driver=driver;
	}
	
	public void HighLightProduct(WebElement divProduct) {
		if(driver instanceof JavascriptExecutor) {
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'",divProduct);
		}
	}
}
