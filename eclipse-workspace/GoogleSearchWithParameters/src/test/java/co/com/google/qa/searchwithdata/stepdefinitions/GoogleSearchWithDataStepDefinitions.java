package co.com.google.qa.searchwithdata.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import GoogleSearchPOM.GoogleSearchPOM;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilitiesdevelopment.HighLight;
import utilitiesdevelopment.ScreenShot;

public class GoogleSearchWithDataStepDefinitions {	public static WebDriver driver;
public static WebDriverWait wait;
public static String baseUrl;
private GoogleSearchPOM objGoogleSearchPOM;
private ScreenShot objScreenShot;
private Scenario scenario;
private HighLight highLight;
private Driver objDriver;

@Before
public void before(Scenario scenario) {
this.scenario = scenario;
}

	@Given("he is in Google home page")
	public void heIsInGoogleHomePage() {
		System.out.println("Arthur Abre navegador");
		objDriver = new Driver(driver);
	    driver = objDriver.configurateNavigator();
	    	    
		System.out.println("El Abre la página inicio");
		objDriver.openNavigator();
		objGoogleSearchPOM = new GoogleSearchPOM(driver);
		objScreenShot = new ScreenShot(driver,scenario);
		highLight = new HighLight(driver);
	    
	}

	@When("he search {word} in google")
	public void heSearchInGoogle(String strWord) {
		System.out.println("En la barra de busqueda escribe la palabra");
		objGoogleSearchPOM.writeIntxtSearch(strWord);

		 System.out.println("da44 click en buscar");
		 objGoogleSearchPOM.darClickEnBotonBuscar();
	}

	@Then("he verifies thath {word} results be in search")
	public void heVerifiesThathResultsBeInSearch(String strWord) {
	   
		System.out.println("El captura los resultados de la busqueda");
		objScreenShot.TakeScreenshot();
	    
	    System.out.println("El actor verifica que la busqueda sea exitosa y tebga "+strWord);
	    driver.quit();
	}

}
