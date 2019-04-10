package co.com.google.qa.searchwithdata.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/resources/feature",
		glue= {"co.com.google.qa.searchwithdata.stepdefinitions"},
		snippets = SnippetType.CAMELCASE,
		plugin= {"pretty","html:target/cucumber","json:target/cucumber/cucumber.json"})
public class GoogleSearchWithDataRunner {

}
