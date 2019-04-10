package GoogleSearchPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;

import utilitiesdevelopment.BasePage;

public class GoogleSearchPOM {

	private WebDriver driver;
	private BasePage basePage;
	private By txtSearch = By.xpath("//input[@title='Buscar']");
	private By btnSeachr = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']");

	public GoogleSearchPOM(WebDriver driver) {
		this.basePage = new BasePage(driver);
		this.driver = driver;

		// TODO Auto-generated constructor stub
	}

	public void writeIntxtSearch(String cadenaABuscar ) {
		basePage.writeIntxtSearch(txtSearch, cadenaABuscar);
	}	
	
	public void darClickEnBotonBuscar() {
		basePage.click(btnSeachr);
	}
}
