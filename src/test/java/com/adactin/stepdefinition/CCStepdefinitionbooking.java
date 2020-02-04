package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.adactln.helpers.PageObjectManager;

import adactin.runner.Runner;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCStepdefinitionbooking extends Baseclass {
	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom= new PageObjectManager(driver);
	@When("^user click continue$")
	public void user_click_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		//Bookingpage bp =new Bookingpage(driver);
		clickOnElement(pom.getBp().getRadio());
	}

	@Then("^user click radio button$")
	public void user_click_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Bookingpage bp =new Bookingpage(driver);
		clickOnElement(pom.getBp().getConti());
	}


}
