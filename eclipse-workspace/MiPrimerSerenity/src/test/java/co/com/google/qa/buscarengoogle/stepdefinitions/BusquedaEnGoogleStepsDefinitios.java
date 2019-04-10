package co.com.google.qa.buscarengoogle.stepdefinitions;

import co.vom.google.qa.buscarengoogle.steps.FinalUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaEnGoogleStepsDefinitios {
	
	@Steps
	FinalUserSteps ale;
	
	@Given("^Dado que el sujeto esta en la pagina de inicio de Google$")
	public void dadoQueElSujetoEstaEnLaPaginaDeInicioDeGoogle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  ale.is_the_home_page();  
	}

	@When("^El busca una \"([^\"]*)\"concatenada \"([^\"]*)\"$")
	public void elBuscaUnaConcatenada(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  ale.looks_for(arg1+" "+arg2);  
	}

	@Then("^verifica que la \"([^\"]*)\" se encuentre alli$")
	public void verificaQueLaSeEncuentreAlli(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
