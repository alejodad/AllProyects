import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class readExcel {

	private static XSSFWorkbook worbook;

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		String path = "C:\\Users\\SEMILLERO15\\Desktop\\datos.xlsx";
		
		File excelFile = new File(path);
		FileInputStream inputStream = new FileInputStream(excelFile);
		Workbook workbook = new XSSFWorkbook(inputStream);
		
		//Hoja en el archivo excel
		Sheet sheet = workbook.getSheetAt(0);
		
		operations operations = new operations(sheet);
		
		ArrayList<String> datos = (ArrayList<String>) operations.listExcelData();
		
		for(int i = 0; i < operations.getRows(); i++) {
			driver.findElement(By.name("q")).sendKeys(datos.get(i));
			driver.findElement(By.name("btnK")).submit();
			
			try {
				if(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Resultados de búsqueda')]"))) != null) {
					System.out.println("Resultados encontrados para " + datos.get(i));
					operations.writeExcel(operations.getSheet().getRow(i), "OK");
					driver.get("https://google.com");			
				}
			} catch (Exception e) {
				operations.writeExcel(operations.getSheet().getRow(i), "NO");
				System.out.println("Sin resultados para " + datos.get(i));
				driver.get("https://google.com");
			}
		}
		driver.close();
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(excelFile);
		workbook.write(outputStream);
		outputStream.close();
		workbook.close();

	}

}
