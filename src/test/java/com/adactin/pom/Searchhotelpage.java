package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotelpage {
	public static WebDriver driver;
	 

	
	@FindBy(xpath=("//select[@name='location']"))
	   private WebElement location;
	   
	   @FindBy(xpath=("//select[@name='hotels']"))
	   private WebElement hotels;
	   
	   @FindBy(xpath=("(//select[contains(@name,'room')])[1]"))
	   private WebElement roomtypee;
	   
	   @FindBy(xpath=("//select[contains(@name,'child')]"))
	   private WebElement childroom;
	   
	   @FindBy(xpath=("//input[@type='submit']"))
	   private WebElement searchbtn;
	   
	   public Searchhotelpage(WebDriver sdriver)
	   {
		   this.driver= sdriver;
		   PageFactory.initElements(driver, this);
	   }
	   public WebElement getLocation() {
			return location;
		}

		public WebElement getHotels() {
			return hotels;
		}

		public WebElement getRoomtypee() {
			return roomtypee;
		}

		public WebElement getChildroom() {
			return childroom;
		}

		public WebElement getSearchbtn() {
			return searchbtn;
		}
}
