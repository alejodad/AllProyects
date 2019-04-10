package com.pinbus.qa.buscarviaje.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import com.pinbus.qa.buscarviaje.task.BuscarViaje;
import com.pinbus.qa.buscarviaje.userinterfaces.PinbusHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;



public class BuscarViajeEnpinbusStepsDefinitios {
	
	PinbusHomePage pinbusHomePage;
	
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor alejandro = Actor.named("Don Alejo");
    
	@Before
	 public void actorCanBrowseTheWeb() {
		alejandro.can(BrowseTheWeb.with(hisBrowser));
	   }
	
	@Given("^Dado que estoy en la pagina de Pinbus$")
	public void dado_que_estoy_en_la_pagina_de_Pinbus() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		alejandro.wasAbleTo(Open.browserOn().the(pinbusHomePage));
	    
	}

	@When("^cuando busco un viaje de \"([^\"]*)\" con destino \"([^\"]*)\"")
	public void cuando_busco_un_viaje_de_a(String rutaIda, String rutaRegreso) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		alejandro.attemptsTo(BuscarViaje.enLasRutas(rutaIda,rutaRegreso));
		//alejandro.attemptsTo(BuscarViaje.enLasRutas(rutaRegreso));
	}

	@Then("^verifico que la pagina de busqueda muestre lo que deseo$")
	public void verifico_que_la_pagina_de_busqueda_muestre_lo_que_deseo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
	    
	}

}
