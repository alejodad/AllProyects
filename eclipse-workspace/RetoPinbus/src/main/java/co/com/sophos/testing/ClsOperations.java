package co.com.sophos.testing;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClsOperations {

	static String strIda="Bogota";
	static String strRegreso="Medellin";
	static String[] strDepartureDate= {"18","septiembre","2019"};
	static String[] srtReturnDate = {"25","noviembre","2019"};
	static String strXpathOrigin = "//input[@placeholder='Ingresa tu Origen']";
	static String strXpathDestiny = "//input[@placeholder='Destino']";
	static String srtXpathDepartureDate = "//input[contains(@placeholder,'Salida')]";
	static String srtXpathRetunrDate ="//input[contains(@placeholder,'Regreso (opcional)')]";
	static String strNumberDivDeparture ="3";
	static String strNumberDivReturn ="4";
	static WebElement next;
	
	private static void WebElementWaitForElement (WebDriver driver ,WebDriverWait wait,String path) throws IOException {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		 WebElement element = driver.findElement(By.xpath(path));
		 
		 FtnTakeEvidences(driver);
		}
	
	
	public static  void WriteInputLocation(WebDriver driver,WebDriverWait wait,String ruta,String Xpath ) throws IOException {
		WebElementWaitForElement(driver,wait,Xpath);
		WebElement webLocation = driver.findElement(By.xpath(Xpath)); 
		webLocation.sendKeys(ruta);
		webLocation.sendKeys(Keys.TAB);
		 FtnTakeEvidences(driver);
		
	}
	
	public static void FntGetDate(WebDriver driver,String strXpath,String StrDepartureOrReturn, String Dates[]) throws IOException {
		
		WebElement element = driver.findElement(By.xpath(strXpath));  
		element.click();
		//*[text()[contains(.,'ABC')]]
		WebElement calendarMonths =driver.findElement(By.xpath("//div["+StrDepartureOrReturn+"]//div[1]//div[2]//header[1]//span[2]"));
		calendarMonths.click();
		WebElement calendarYearRange =driver.findElement(By.xpath("//div["+StrDepartureOrReturn+"]//div[1]//div[3]//header[1]//span[2]"));
		calendarYearRange.click();
		String yearRange[] =driver.findElement(By.xpath("//div["+StrDepartureOrReturn+"]//div[1]//div[4]//header[1]//span[2]")).getText().split("-");
		while (!BlnRangeYearIsBetween(Integer.parseInt(Dates[2]),Integer.parseInt(yearRange[0].trim()),Integer.parseInt(yearRange[1].trim()))) {
			
			
			if(Integer.parseInt(Dates[2])>Integer.parseInt(yearRange[1].trim())) {
				next=driver.findElement(By.xpath("//div["+StrDepartureOrReturn+"]//div[1]//div[4]//header[1]//span[3]"));
				next.click();
			}
			
		 String yearRange1[] =driver.findElement(By.xpath("//div["+StrDepartureOrReturn+"]//div[1]//div[4]//header[1]//span[2]")).getText().split("-");
		 yearRange[0]=yearRange1[0];
		 yearRange[1]=yearRange1[1];
			
		}
		
		WebElement selectedYear =driver.findElement(By.xpath("//div["+StrDepartureOrReturn+"]//div[1]//div[4]//span[contains(@class,'cell year')][contains(text(),'"+Dates[2]+"')]")); 
		selectedYear.click();
		String month=Dates[1].substring(0,1).toUpperCase()+Dates[1].substring(1);
		WebElement selectedMonth = driver.findElement(By.xpath("//div["+StrDepartureOrReturn+"]//div[1]//div[3]//span[contains(@class,'cell month')][contains(text(),'"+month.trim()+"')]")); 
		selectedMonth.click();
		WebElement selectedDay =driver.findElement(By.xpath("//div["+StrDepartureOrReturn+"]//div[1]//div[2]//div[1]//span[contains(@class,'cell day')][contains(text(),'"+Dates[0]+"')]")); 
		selectedDay.click();
		
		 FtnTakeEvidences(driver);
		
	}
	
	private static boolean BlnRangeYearIsBetween(int a, int b, int c) {
		if(a >= b && a <= c || a==b || a==c) {
			return true;
		}else
		return false;
		}
	
	public static String StrFntGetFormatDate() {
		Date today = new Date();
		String datePattern = "MMMM yyyy";
		SimpleDateFormat simpleDateFormatMonthYear = new SimpleDateFormat(datePattern);
		String monthYear=simpleDateFormatMonthYear.format(today).substring(0,1).toUpperCase()+simpleDateFormatMonthYear.format(today).substring(1,3);
		
		return monthYear;
	}
	
	public static void FtnTakeEvidences(WebDriver driver) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_HHmmss");
		Date dateOfSystem = new Date();
		String dateExcec= dateFormat.format(dateOfSystem);
		String pathScreen = System.getProperty("user.dir")+"\\src\\test\\java\\Evidence";
		System.out.println(pathScreen);
		File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String pathEvidence = pathScreen+"EvidenceExecution"+dateExcec+".png";
		FileUtils.copyFile(scrFile,new File(pathEvidence));
	}
	
	public static void FntSubmit(WebDriver driver) throws IOException {
		
		WebElement element = driver.findElement(By.xpath("//button[@id='btn_buscar']"));  
		element.click();
		FtnTakeEvidences( driver) ;
	}
	

}
