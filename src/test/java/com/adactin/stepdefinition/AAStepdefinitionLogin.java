package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.adactln.helpers.FileReaderManager;
import com.adactln.helpers.PageObjectManager;

import adactin.runner.Runner;
import cucumber.api.java.en.*;

public class AAStepdefinitionLogin extends Baseclass {

	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	/*
	 * @Given("^the user is loggedin the application$") public void
	 * the_user_is_loggedin_the_application() throws Throwable { // Write code
	 * here that turns the phrase above into concrete actions
	 * System.out.println("user is loggedin the applications"); }
	 * 
	 * @When("^goes to the landing page$") public void
	 * goes_to_the_landing_page() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions
	 * System.out.println("user logged on"); }
	 */

	@Given("^the user is loggedin the application$")
	public void the_user_is_loggedin_the_application() throws Throwable {
	}

	@Then("^goes to the landing page$")
	public void goes_to_the_landing_page() throws Throwable {
	}

	@When("^user enter application url$")
	public void user_enter_application_url() throws Throwable {
		System.out.println("Browser Launch");
		// driver.get("https://www.google.com");
		String url = FileReaderManager.getInstance().getcrinstance().geturl();
		applaunch(url);
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		// Loginpage lp = new Loginpage(driver);
		inputOnElement(pom.getLp().getUserName(), arg1);

	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg2) throws Throwable {
		// Loginpage lp= new Loginpage(driver);
		inputOnElement(pom.getLp().getPassword(), arg2);

	}

	/*
	 * @When("^user enter valid username$") public void
	 * user_enter_valid_username() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions
	 * 
	 * Loginpage log=new Loginpage(driver);
	 * inputOnElement(log.getUserName(),"kaviyarkmk"); }
	 * 
	 * @When("^user enter valid password$") public void
	 * user_enter_valid_password() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions Loginpage log=new
	 * Loginpage(driver); inputOnElement(log.getPassword(),"test@1234"); }
	 */

	@Then("^user verify the username in the homepage$")
	public void user_verify_the_username_in_the_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Loginpage lp = new Loginpage(driver);
		clickOnElement(pom.getLp().getLoginBtn());
	}

}
