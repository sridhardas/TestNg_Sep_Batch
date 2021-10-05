package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public Home_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	 public WebDriver driver;                  //null
	
@FindBy(xpath="//a[@class='login']")
private WebElement loginbtn;

public WebElement getLoginbtn() {
	return loginbtn;
}

	
	
	
	
}
