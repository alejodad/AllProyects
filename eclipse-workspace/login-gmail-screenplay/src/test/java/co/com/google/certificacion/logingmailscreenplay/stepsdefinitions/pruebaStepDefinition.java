package co.com.google.certificacion.logingmailscreenplay.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class pruebaStepDefinition {
	
	@Given("^I want to write a step with$")
	public void i_want_to_write_a_step_with()  {
	    System.out.println("1");
	   
	}

	@When("^I check for the n step$")
	public void i_check_for_the_n_step()  {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("2");
	}

	@Then("^I verify the in step$")
	public void i_verify_the_in_step()  {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("3");
	}

}
