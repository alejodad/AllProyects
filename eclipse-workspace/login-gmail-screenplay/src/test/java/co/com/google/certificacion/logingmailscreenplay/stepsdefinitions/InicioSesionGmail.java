package co.com.google.certificacion.logingmailscreenplay.stepsdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.google.certificacion.logingmailscreenplay.models.Credenciales;
import co.com.google.certificacion.logingmailscreenplay.task.IniciarSesion;
import co.com.google.certificacion.logingmailscreenplay.userinterfaces.GmailHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class InicioSesionGmail {
	
	GmailHomePage gmailHomePage;

	public  static final int USUARIO_EN_ESCENA = 0;
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor arturo = Actor.named("Arturo");
    
    @Before
    public void actorCanBrowseTheWeb() {
        arturo.can(BrowseTheWeb.with(hisBrowser));
   }
    
    @Given("^puede entrar a la pagina de inicio de sesion de gmail$")
    public void puedeEntrarALaPaginaDeInicioDeSesionDeGmail()  {
       arturo.wasAbleTo(Open.browserOn(gmailHomePage));
       
    }

    @When("^inicie sesion en google con las credenciales$")
    public void inicieSesionEnGoogleConLasCredenciales(List<Credenciales> credenciales)  {
       arturo.attemptsTo(IniciarSesion.conLasCredenciales(credenciales.get(USUARIO_EN_ESCENA)));
       
    }

    @Then("^Deberia ver mi sesion iniciada$")
    public void deberiaVerMiSesionIniciada()  {
        // Write code here that turns the phrase above into concrete actions
       
    }


    

}
