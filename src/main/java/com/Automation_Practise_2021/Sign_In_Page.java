package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_Page {
public Sign_In_Page(WebDriver driver2) {
	this.driver=driver2;
PageFactory.initElements(driver, this)	;
	}

 public WebDriver driver;
	
	@FindBy(id="email_create")
private	WebElement cretingaccount;

	public WebElement getCretingaccount() {
		return cretingaccount;
	}
	@FindBy(id="SubmitCreate")
	WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
