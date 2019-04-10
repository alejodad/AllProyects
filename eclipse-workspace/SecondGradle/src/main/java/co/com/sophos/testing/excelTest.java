package co.com.sophos.testing;

import static org.junit.Assert.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(value= Parameterized.class)
public class excelTest { 
	
	@Parameters
	public static Iterable<String> datos() throws FileNotFoundException{
		 excel = new File("C:\\Users\\SEMILLERO15\\Desktop\\datos.xlsx");
		 objOper = new Operations(new FileInputStream(excel));
		List<String> datos = new ArrayList<>();
		 datos= objOper.leerExcel();
		 return datos;	
		
	}
	
	
	WebDriver driver = new ChromeDriver();
	private String  dato;
	static File excel;
	static Operations objOper;
	private String expec ="Lo encontró";
	private String result;
	
	public excelTest(String dato) 
	{
		this.dato = dato;
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception
	{
		driver.get("https://www.google.com.uy"); 
		driver.manage().window().maximize(); 
		
	}

	@After
	public void tearDown() throws Exception 
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:/selenium/capturas/excelGradle/testBuscarElemento" +dato + ".png"));
			Operations.explicitWait(driver, dato);
			result="Lo encontró";
			objOper.escribirExcel2(dato, result);
			
			
		}catch(RuntimeException ex) {
			result="No lo encontró";
			objOper.escribirExcel2(dato, result);
		}
		catch (IOException e) {
		}
		
		FileOutputStream outputStream = new FileOutputStream(excel);
		objOper.getLibro().write(outputStream);
		objOper.clear();
		driver.close();
		
		assertEquals(expec, result);
	}

	@Test
	public void test() {
		driver.findElement(By.name("q")).sendKeys(dato); 
		driver.findElement(By.name("btnK")).submit();
		
	}

}
