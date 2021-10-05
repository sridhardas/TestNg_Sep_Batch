package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
 private Home_Page hp;
 public WebDriver driver;
 
 
 
	 




public PageObjectManager(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}








public Home_Page getInstanceHp() {
hp=new Home_Page(driver);
return hp;
}
 
}




