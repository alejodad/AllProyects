package co.com.google.qa.helloworldcucumber.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.Scenario;

import GoogleSearchPOM.GoogleSearchPOM;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilitiesdevelopment.HighLight;
import utilitiesdevelopment.ScreenShot;

public class GoogleSearchStepDefinition {
	public static WebDriver driver;
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
	
	@Given("Alejandro is on Google home Page")
	public void alejandro_is_on_Google_home_Page() {
		System.out.println("Arthur Abre navegador");
		objDriver = new Driver(driver);
	    driver = objDriver.configurateNavigator();
	    	    
		System.out.println("El Abre la página inicio");
		objDriver.openNavigator();
		objGoogleSearchPOM = new GoogleSearchPOM(driver);
		objScreenShot = new ScreenShot(driver,scenario);
		highLight = new HighLight(driver);
	}

	@When("he makes a search")
	public void he_makes_a_search() {	
		System.out.println("En la barra de busqueda escribe la palabra");
		objGoogleSearchPOM.writeIntxtSearch("cucumber java serenity");

		 System.out.println("da44 click en buscar");
		 objGoogleSearchPOM.darClickEnBotonBuscar();
	}

	@Then("he validates thath result is success")
	public void he_validates_thath_result_is_success() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("El captura los resultados de la busqueda");
		objScreenShot.TakeScreenshot();
	    
	    System.out.println("El actor verifica que la busqueda sea exitosa");
	    System.out.println(driver.getTitle());
	    assertEquals(driver.getTitle(),"cucumber java serenity - Buscar con Google");
	    driver.quit();
	}


}
