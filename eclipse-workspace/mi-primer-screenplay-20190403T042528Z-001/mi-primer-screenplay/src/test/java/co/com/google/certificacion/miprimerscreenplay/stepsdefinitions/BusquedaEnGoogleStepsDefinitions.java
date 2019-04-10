package co.com.google.certificacion.miprimerscreenplay.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.WebDriver;

import co.com.google.certificacion.miprimerscreenplay.questions.ThePhrase;
import co.com.google.certificacion.miprimerscreenplay.tasks.LookUpPhrase;
import co.com.google.certificacion.miprimerscreenplay.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class BusquedaEnGoogleStepsDefinitions {
	
	GoogleHomePage googleHomePage;
	
	@Managed(driver = "chrome")
	    private WebDriver hisBrowser;
	    private Actor arturo = Actor.named("Doña Sara Dujast");
	    
	@Before
	 public void actorCanBrowseTheWeb() {
	        arturo.can(BrowseTheWeb.with(hisBrowser));
	   }
	
	@Given("^arthur esta en el sitio de google$")
	public void arthurEstaEnElSitioDeGoogle()  {
		arturo.wasAbleTo(Open.browserOn().the(googleHomePage));
	  
	}

	@When("^el busca la frase \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void elBuscaLaFraseCompuesta(String palabraUno, String palabraDos)  {
	    arturo.attemptsTo(LookUpPhrase.composedOfTheWords(palabraUno, palabraDos));
	}

	@Then("^el verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String resultadoEsperado)  {
	    
		arturo.should(seeThat(ThePhrase.searched(), is(resultadoEsperado))); 
	}



}
