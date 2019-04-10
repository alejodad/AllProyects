package co.com.google.qa.helloworldcucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/resources/featureS",
		glue= {"co.com.google.qa.helloworldcucumber.stepdefinitions"},
		snippets = SnippetType.CAMELCASE,
		plugin= {"pretty","html:target/cucumber","json:target/cucumber/cucumber.json"})

public class SearchInGoogleRunner {
	

}
