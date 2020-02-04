package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
	 public static WebDriver driver;
	@FindBy(xpath="//input[contains(@name,'first')]")
	private WebElement firstname;

	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;

	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath="(//input[contains(@name,'num')])[2]")
	private WebElement cardnumber;

	@FindBy(xpath="(//select[contains(@name,'cc')])[1]")
	private WebElement carddetails;
	 
	@FindBy(xpath="//select[contains(@name,'month')]")
	private WebElement cmonth;


	@FindBy(xpath="//select[contains(@name,'year')]")
	private WebElement cyear;

	@FindBy(xpath="//input[contains(@name,'cvv')]")
	private WebElement ccv;

	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book;

	 public Paymentpage (WebDriver bdriver)
	 {
		 this.driver=bdriver;
		 PageFactory.initElements(driver, this);
	 }


	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCarddetails() {
		return carddetails;
	}

	public WebElement getCmonth() {
		return cmonth;
	}

	public WebElement getCyear() {
		return cyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}

}
