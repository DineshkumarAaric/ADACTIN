package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingpage {
	 public static WebDriver driver;
	 
	 

	 @FindBy(xpath="(//input[contains(@name,'radio')])[1]")
	  private WebElement radio;
	  
	  @FindBy(xpath="//input[contains(@name,'continue')]")
	  private WebElement conti;
	  
	  public Bookingpage (WebDriver bdriver)
	  {
	 	 this.driver=bdriver;
	 	 PageFactory.initElements(driver, this);
	  }

	 public WebElement getRadio() {
	 	return radio;
	 }

	 public WebElement getConti() {
	 	return conti;
	 }
}
