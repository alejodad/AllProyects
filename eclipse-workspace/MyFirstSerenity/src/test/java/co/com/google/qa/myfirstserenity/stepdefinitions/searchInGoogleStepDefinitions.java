package co.com.google.qa.myfirstserenity.stepdefinitions;

import co.com.google.qa.myfirstserenity.steps.FinalUserStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

public class searchInGoogleStepDefinitions {
	
	@Steps
	FinalUserStep ale;
	
	@Given("^he is in Google home page$")
	public void heIsInGoogleHomePage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ale.isInHomePage();
	    
	}

	@When("^he search \"([^\"]*)\" in googlemcompuest \"([^\"]*)\"$")
	public void heSearchInGooglemcompuest(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ale.SearchFor(arg1+" "+ arg2);
	}

	@Then("^he verifies thath \"([^\"]*)\" results be in search$")
	public void heVerifiesThathResultsBeInSearch(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("");
	}

}
