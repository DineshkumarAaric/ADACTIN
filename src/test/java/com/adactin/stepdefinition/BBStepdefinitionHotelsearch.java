package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.adactin.pom.Searchhotelpage;
import com.adactln.helpers.PageObjectManager;

import adactin.runner.Runner;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BBStepdefinitionHotelsearch extends Baseclass {
	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom= new PageObjectManager(driver);
@When("^user enter location$")
public void user_enter_location() throws Throwable {
	
    // Write code here that turns the phrase above into concrete actions
	//Searchhotelpage sp =new Searchhotelpage(driver);
	dropDown( pom.getSh().getLocation(), "index","2");
}

@And("^user enter hotels$")
public void user_enter_hotels() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//Searchhotelpage sp =new Searchhotelpage(driver);
	dropDown(pom.getSh().getHotels(), "value","Hotel Hervey");	
}

@And("^user enter room$")
public void user_enter_room() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//Searchhotelpage sp =new Searchhotelpage(driver);
	dropDown(pom.getSh().getRoomtypee(), "index", "4");
}

@And("^user enter children$")
public void user_enter_children() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//Searchhotelpage sp =new Searchhotelpage(driver);
	dropDown(pom.getSh().getChildroom(), "index","1");
}

@Then("^user verify the username in the searchpage$")
public void user_verify_the_username_in_the_searchpage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//Searchhotelpage sp =new Searchhotelpage(driver);
	clickOnElement(pom.getSh().getSearchbtn());
}


}
