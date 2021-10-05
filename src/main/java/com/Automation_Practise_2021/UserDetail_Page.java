package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetail_Page {
public UserDetail_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

WebDriver driver;
	@FindBy(id="id_gender1")
private	WebElement radiobtn;
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	@FindBy(id="customer_firstname")
	private WebElement fname;
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id="customer_lastname")
	private WebElement lname;
	
	@FindBy(id="passwd")
	private WebElement password;
	@FindBy(id="days")
	 private WebElement date;
	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	@FindBy(id="months")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='years']")
	 private WebElement year;
	
	@FindBy(id="company")
	private WebElement company;
	
	@FindBy(id="address1")
private	WebElement adress;
	
	public WebElement getCompany() {
		return company;
	}

	public WebElement getAdress() {
		return adress;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostno() {
		return postno;
	}

	public WebElement getPnum() {
		return pnum;
	}

	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	@FindBy(id="postcode")
private	WebElement postno ;
	
	@FindBy(id="phone_mobile")
	private WebElement pnum;
	
@FindBy(id="phone")	
private WebElement pnum2;

public WebElement getPnum2() {
	return pnum2;
}
@FindBy(xpath=("(//button[@type='submit'])[2]"))
private WebElement regbut;

public WebElement getRegbut() {
	return regbut;
}
@FindBy(id="alias")
private WebElement adress1;

public WebElement getAdress1() {
	return adress1;
}
}



