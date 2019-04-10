package co.com.google.certificacion.logingmailscreenplay.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features= { "src/test/resources/features/InicioSesionGmail.feature"},
        glue = { "co.com.google.certificacion.logingmailscreenplay.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        
       	
        )  
public class EnvioCorreoGmailRunner {

}
