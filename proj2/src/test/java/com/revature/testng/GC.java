package com.revature.testng;

import org.openqa.selenium.WebDriver;

import com.revature.svp.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GC {

	static WebDriver d = null;
	
	@Given("^Google Chrome is launched$")
	public void google_Chrome_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Driver.launchApp();
	}

	@When("^go to AssignForce$")
	public void go_to_AssignForce() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Driver.goToAssignForce();
	}

	@Then("^login as SVP$")
	public void login_as_SVP() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Driver.loginSVP();
	}

}
