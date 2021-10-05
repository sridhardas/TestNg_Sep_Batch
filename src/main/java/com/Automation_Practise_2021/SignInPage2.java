package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage2 {
public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
private	WebElement loginbtn;

	public SignInPage2(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	@FindBy(id="email")
	private WebElement emailid;
	
	@FindBy(id="passwd")
private	WebElement password;

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
	private WebElement signin ;

	public WebElement getSignin() {
		return signin;
	}
}
