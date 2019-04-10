package co.com.linio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaPrincipal {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By txtProduct = By.xpath("//div[@class='input-group hidden-sm-down input-group-search']//input[@placeholder='Busca productos']");
	By btnSearch = By.xpath("//div[@class='input-group-btn']//span[@class='icon icon-inverse'][contains(text(),'')]"); 
	
	public PaginaPrincipal(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void FtnSearch(String srtProduct) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtProduct));
		driver.findElement(txtProduct).sendKeys(srtProduct+Keys.TAB);
		//WriteInInput(driver,txtProduct);
		
	}
	
	public void FtnClickSearch() {
		driver.findElement(btnSearch).submit();
	}

}
