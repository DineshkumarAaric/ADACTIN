package com.adactln.helpers;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Bookingpage;
import com.adactin.pom.Loginpage;
import com.adactin.pom.Paymentpage;
import com.adactin.pom.Searchhotelpage;

public class PageObjectManager {
public static WebDriver driver;


private Loginpage lp;
  
private Searchhotelpage sh;
private Bookingpage bp;
private Paymentpage pp;
 public PageObjectManager(WebDriver driver){
	 this.driver=driver;
	 }
 public   Loginpage getLp(){
	  lp=new Loginpage(driver);
	 return lp;
 }
 public  Searchhotelpage getSh(){
	 sh= new Searchhotelpage(driver);
	 return sh;
	 }
 public  Bookingpage getBp(){
	 bp= new Bookingpage(driver);
	 return bp;
 }
 
 public  Paymentpage getPp(){
	 pp= new Paymentpage(driver);
	 return pp;
 }
 
 
 
 
}
