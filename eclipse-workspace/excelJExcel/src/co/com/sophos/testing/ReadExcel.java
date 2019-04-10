package co.com.sophos.testing;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ReadExcel {
	
	private static final String EXCEL_FILE_LOCATION = "C:\\JExcel\\datos.xls";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 Workbook workbook = null;
		 
		 try {
			 workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
			 Sheet sheet = workbook.getSheet(0);
			 
			 
	            Cell cell1 = sheet.getCell(0, 0);
	            System.out.print(cell1.getContents() + ":");    // Test Count + :
	            Cell cell2 = sheet.getCell(0, 1);
	            System.out.println(cell2.getContents()); 
	            int numer =sheet.getRows();
	            
	            
	            for (int i = 0; i <= numer; i++) {
	            	driver.get("https://www.google.com.uy"); 
					driver.manage().window().maximize(); 
					driver.findElement(By.name("q")).sendKeys(sheet.getCell(i, 0).getContents()); 
					driver.findElement(By.name("btnK")).submit();
					
					File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					try {
						explicitWait(driver, sheet.getCell(i, 0).getContents());
						FileUtils.copyFile(src, new File("C:/Users/SEMILLERO15/eclipse-workspace/jexcel/"
								+ "PruebaEncontro/"+sheet.getCell(i, 0).getContents()+".png"));
						System.out.println("Encontro: SI");
						//stm1.executeUpdate("UPDATE validar SET Nombre='"+Nombre+"',Estado='SI' WHERE Nombre='"+Nombre+"';");
					}catch(RuntimeException e) {
						FileUtils.copyFile(src, new File("C:/Users/SEMILLERO15/eclipse-workspace/jexcel/"
								+ "PruebaNoEncontro/"+sheet.getCell(i, 0).getContents()+".png"));
						System.out.println("Encontro:NO");
						//stm1.executeUpdate("UPDATE validar SET Nombre='"+Nombre+"',Estado='NO' WHERE Nombre='"+Nombre+"';");	
					}	
				}
	            
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		 

	}

	public static void explicitWait(WebDriver driver,String text) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(text)));
 }

}
