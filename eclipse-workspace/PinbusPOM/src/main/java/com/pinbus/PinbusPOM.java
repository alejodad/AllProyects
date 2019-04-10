package com.pinbus;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PinbusPOM {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By txtOrigin = By.xpath("//input[@placeholder='Ingresa tu Origen']");
	By txtDestiny = By.xpath("//input[@placeholder='Destino']");
	By txtDepartureDate = By.xpath("//input[contains(@placeholder,'Salida')]");
	By txtRetunrDate = By.xpath("//input[contains(@placeholder,'Regreso (opcional)')]");
	By btnSearch = By.xpath("//button[@id='btn_buscar']"); 
	By lsbAutocomplete = By.xpath("//div[contains(@class,'v-autocomplete-list)]"); 
	
	
	String strNumberDivDeparture ="3";
	String strNumberDivReturn ="4";
	
	public PinbusPOM(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void FntWriteOrigin(String strOrgin) throws IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtOrigin));
		driver.findElement(txtOrigin).sendKeys(strOrgin+Keys.TAB);
		WriteInInput(driver,txtOrigin);
		
	}
	
	public void FntWriteDestiny(String srtDestiny) throws IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtDestiny));
		driver.findElement(txtDestiny).sendKeys(srtDestiny+Keys.TAB);
		
		WriteInInput(driver,txtDestiny);
	}
	
	public void FtnSetDateDeparture(String[] srtDepartureDate) throws IOException {
		driver.findElement(txtDepartureDate).click();
		WriteInInput(driver,txtDepartureDate);
		FntGetDate(driver,txtDepartureDate,strNumberDivDeparture,srtDepartureDate);
		
	}
	
	public void FtnSetDateReturn(String[] srtReturnDate) throws IOException {
		driver.findElement(txtRetunrDate).click();
		WriteInInput(driver,txtRetunrDate);
		FntGetDate(driver,txtRetunrDate,strNumberDivReturn,srtReturnDate);
		
	}
	
	public void FtnClickSearch() {
		driver.findElement(btnSearch).click();
	}
	
	
	public void MakeSearch(String strOrgin, String srtDestiny, String[] srtDepartureDate, String[] srtReturnDate) throws IOException
	{
		this.FntWriteOrigin(strOrgin);
		this.FntWriteDestiny(srtDestiny);
		this.FtnSetDateDeparture(srtDepartureDate);
		this.FtnSetDateReturn(srtReturnDate);
	}
	
	public static void FntGetDate(WebDriver driver, By strXpath, String StrDepartureOrReturn, String Dates[])
			throws IOException {
		WebElement next;
		
		WebElement calendarMonths = driver
				.findElement(By.xpath("//div[" + StrDepartureOrReturn + "]//div[1]//div[2]//header[1]//span[2]"));
		calendarMonths.click();
		WebElement calendarYearRange = driver
				.findElement(By.xpath("//div[" + StrDepartureOrReturn + "]//div[1]//div[3]//header[1]//span[2]"));
		calendarYearRange.click();
		String yearRange[] = driver
				.findElement(By.xpath("//div[" + StrDepartureOrReturn + "]//div[1]//div[4]//header[1]//span[2]"))
				.getText().split("-");
		while (!BlnRangeYearIsBetween(Integer.parseInt(Dates[2]), Integer.parseInt(yearRange[0].trim()),
				Integer.parseInt(yearRange[1].trim()))) {

			if (Integer.parseInt(Dates[2]) > Integer.parseInt(yearRange[1].trim())) {
				next = driver.findElement(
						By.xpath("//div[" + StrDepartureOrReturn + "]//div[1]//div[4]//header[1]//span[3]"));
				next.click();
			}

			String yearRange1[] = driver
					.findElement(By.xpath("//div[" + StrDepartureOrReturn + "]//div[1]//div[4]//header[1]//span[2]"))
					.getText().split("-");
			yearRange[0] = yearRange1[0];
			yearRange[1] = yearRange1[1];

		}

		WebElement selectedYear = driver.findElement(By.xpath("//div[" + StrDepartureOrReturn
				+ "]//div[1]//div[4]//span[contains(@class,'cell year')][contains(text(),'" + Dates[2] + "')]"));
		selectedYear.click();
		String month = Dates[1].substring(0, 1).toUpperCase() + Dates[1].substring(1);
		WebElement selectedMonth = driver.findElement(By.xpath("//div[" + StrDepartureOrReturn
				+ "]//div[1]//div[3]//span[contains(@class,'cell month')][contains(text(),'" + month.trim() + "')]"));
		selectedMonth.click();
		WebElement selectedDay = driver.findElement(By.xpath("//div[" + StrDepartureOrReturn
				+ "]//div[1]//div[2]//div[1]//span[contains(@class,'cell day')][contains(text(),'" + Dates[0] + "')]"));
		selectedDay.click();

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
	
	public void WriteInInput(WebDriver driver, By Xpath) throws IOException {
		WebElement element  = driver.findElement(Xpath);
		if(driver instanceof JavascriptExecutor) {
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", element);
			FtnTakeEvidences(driver);
		}
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid transparent'", element);
	}
	
	

}
