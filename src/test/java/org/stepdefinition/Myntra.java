package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Myntra extends BaseClass{
	
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		lanuchBrowser();
		windowMaximize();
	}

	@When("To launch the url of the Myntra")
	public void to_launch_the_url_of_the_Myntra() {
		launchUrl("https://www.myntra.com/"); 
	    
	}

	@When("To check the page is working")
	public void to_check_the_page_is_working() {
	  
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	   
	}



}
