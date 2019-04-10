package MiPrimerScript;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HolaMundo 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);	

		driver.get("https:\\www.google.com.uy");
		if (wait.until(ExpectedConditions.urlContains("gmail"))) {
			driver.get("https:\\www.YouTube.com");
		}else {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.get("https:\\www.google.com.uy");
		driver.findElement(By.name("q")).sendKeys("selenium get screenshot java ");
		driver.findElement(By.name("btnK")).submit();
		
		//toma un pantallaso  de la pagina en la q se encuentra  y lo envia a una variable
		
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    try{
			    	// se envia el pantallazo a la hubicacion asignada
			        FileUtils.copyFile(src, new File("C:\\Selenium\\Capturas\\image.png"));
			    }//envia un mensaje de error si no se da la condicion
			    catch(IOException e){
			        System.out.println(e.getMessage());
			    }       
				
			   
				//FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(“C\\Selenium\\Screenshot.png”));
				
				// sirve para finalizar o cerrar el proceso 
				driver.close();
		}
		 
		driver.close();
		 
	}
	
	

}
