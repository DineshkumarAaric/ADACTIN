package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public static WebDriver driver;
	
	
	@FindBy(xpath="(//input[@class='login_input'])[1]")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginBtn;
	
	public Loginpage(WebDriver logdriver) {
		this.driver= logdriver;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getPassword() {
		return password;
	}
	
	

}
