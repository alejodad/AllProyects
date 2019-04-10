package co.com.google.qa.myfirstserenity.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "co.com.google.qa.myfirstserenity.stepdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  


public class SearchInGoogle {

}
