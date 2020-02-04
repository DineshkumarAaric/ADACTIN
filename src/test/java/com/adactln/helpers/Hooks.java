package com.adactln.helpers;

import com.adactin.baseclass.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass {
	
	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("scenario Name: " +scenario.getName());
	}
	@After
	public void afterScenario(Scenario scenario) {
	if(scenario.isFailed()){
		String id = scenario.getId();
		System.out.println("scenarion id is" +id);
		
	}
	System.out.println("  status      " +scenario.getStatus());
	}
	
	@Before("@payment")
	public void beforeLastScenario(Scenario scenario){
		System.out.println("========this will execute before @payment=========");
		System.out.println("scenario Name: " +scenario.getName());
	}
}
