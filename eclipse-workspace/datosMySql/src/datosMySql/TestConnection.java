package datosMySql;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TestConnection {
	public static void main(String[] args) throws IOException,SQLException {
		ConexionBuild conexion = new ConexionBuild();
		Connection cn = null;
		Statement stm =null;
		ResultSet rs= null;
		Statement stm1=null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			cn=conexion.conectar();
			stm = (Statement) cn.createStatement();
			stm1 = (Statement) cn.createStatement();
			rs=stm.executeQuery("SELECT * FROM datos");
			
			while(rs.next()) {
				String Nombre=rs.getString(2);
				System.out.println("Nombre: "+Nombre);
				driver.get("https://www.google.com.uy"); 
				driver.manage().window().maximize(); 
				driver.findElement(By.name("q")).sendKeys(Nombre); 
				driver.findElement(By.name("btnK")).submit();
				
				File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
					explicitWait(driver, Nombre);
					FileUtils.copyFile(src, new File("C:/Users/SEMILLERO15/eclipse-workspace/MYSQL/"
							+ "PruebaEncontro/"+Nombre+".png"));
					System.out.println("Encontro: SI");
					stm1.executeUpdate("UPDATE datos SET Nombre='"+Nombre+"',encontrado='SI' WHERE Nombre='"+Nombre+"';");
				}catch(RuntimeException e) { 
					FileUtils.copyFile(src, new File("C:/Users/SEMILLERO15/eclipse-workspace/MYSQL/"
							+ "PruebaNoEncontro/"+Nombre+".png"));
					System.out.println("Encontro:NO");
					stm1.executeUpdate("UPDATE datos SET Nombre='"+Nombre+"',encontrado='NO' WHERE Nombre='"+Nombre+"';");	
				}			
			}
		} catch (SQLException e) {
			System.out.println("Salio");
			e.printStackTrace();
		}
		finally {
			
			}		
	}
	
	public static void explicitWait(WebDriver driver,String text) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(text)));	
	}
}
