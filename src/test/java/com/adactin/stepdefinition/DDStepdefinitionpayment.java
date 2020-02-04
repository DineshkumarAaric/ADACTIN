package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.adactin.pom.Paymentpage;
import com.adactln.helpers.PageObjectManager;

import adactin.runner.Runner;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DDStepdefinitionpayment extends Baseclass {
	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom= new PageObjectManager(driver);
	@When("^user enter firstname$")
	public void user_enter_firstname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Paymentpage pp1 = new Paymentpage(driver);
		inputOnElement(pom.getPp().getFirstname(), "dinesh");
	}

	@And("^user enter lastname$")
	public void user_enter_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Paymentpage pp2 = new Paymentpage(driver);
		inputOnElement(pom.getPp().getLastname(), "ravi");
	}

	@And("^user enter address$")
	public void user_enter_address() throws Throwable {
		//Paymentpage pp3 = new Paymentpage(driver);
		inputOnElement(pom.getPp().getAddress(), "india");
	}

	@And("^user enter cardnumber$")
	public void user_enter_cardnumber() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Paymentpage pp4 = new Paymentpage(driver);
		inputOnElement(pom.getPp().getCardnumber(), "0987 1234 6543 5678");
	}

	@And("^user enter carddetails$")
	public void user_enter_carddetails() throws Throwable {
		//Paymentpage pp5 = new Paymentpage(driver);
		dropDown(pom.getPp().getCarddetails(), "index", "2");
	}

	@And("^user enter expirymonth$")
	public void user_enter_expirymonth() throws Throwable {
		//Paymentpage pp6 = new Paymentpage(driver);
		dropDown(pom.getPp().getCmonth(), "index", "9");
	}

	@And("^user enter expiryyear$")
	public void user_enter_expiryyear() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Paymentpage pp7= new Paymentpage(driver);
		dropDown(pom.getPp().getCyear(), "value", "2022");
	}

	@And("^user enter ccv$")
	public void user_enter_ccv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Paymentpage pp9 = new Paymentpage(driver);
		clickOnElement(pom.getPp().getCcv());
	}
	@Then("^user click booking button$")
	public void user_click_booking_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Paymentpage pp9 = new Paymentpage(driver);
		clickOnElement(pom.getPp().getBook());
	}


	/*@Given("^user enter  firstname$")
	public void user_enter_firstname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Paymentpage pp1 = new Paymentpage(driver);
		inputOnElement(pp1.getFirstname(), "dinesh");
	}

	@Given("^user enter  lastname$")
	public void user_enter_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Paymentpage pp2 = new Paymentpage(driver);
		inputOnElement(pp2.getLastname(), "ravi");
	}

	@Given("^user enter  address$")
	public void user_enter_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Paymentpage pp3 = new Paymentpage(driver);
		inputOnElement(pp3.getAddress(), "india");
	}

	@Given("^user enter  cardnumber$")
	public void user_enter_cardnumber() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Paymentpage pp4 = new Paymentpage(driver);
		inputOnElement(pp4.getCardnumber(), "0987 1234 6543 5678");
	}

	@Given("^user enter  carddetails$")
	public void user_enter_carddetails() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Paymentpage pp5 = new Paymentpage(driver);
		dropDown(pp5.getCarddetails(), "index", "2");
	}

	@Given("^user enter  expirymonth$")
	public void user_enter_expirymonth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Paymentpage pp6 = new Paymentpage(driver);
		dropDown(pp6.getCmonth(), "index", "9");
	}

	@Given("^user enter  expiryyear$")
	public void user_enter_expiryyear() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Paymentpage pp7= new Paymentpage(driver);
		dropDown(pp7.getCyear(), "value", "2022");
	}

	@Given("^user enter  ccv$")
	public void user_enter_ccv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Paymentpage pp8 = new Paymentpage(driver);
		inputOnElement(pp8.getCcv(), "023");
	}

	@Given("^user click booking button$")
	public void user_click_booking_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Paymentpage pp9 = new Paymentpage(driver);
		clickOnElement(pp9.getBook());
	}

	*/
}
