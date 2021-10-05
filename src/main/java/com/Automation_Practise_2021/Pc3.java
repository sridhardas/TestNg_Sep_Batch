package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pc3 {
WebDriver driver;



@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button")
private WebElement shipping;



public Pc3(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}



public WebElement getShipping() {
	return shipping;
}
@FindBy(xpath="//*[@id=\"cgv\"]")
private WebElement checkbox;



public WebElement getCheckbox() {
	return checkbox;
	
	
}
@FindBy(xpath="//*[@id=\"form\"]/p/button")
private WebElement payment;



public WebElement getPayment() {
	return payment;
}
}
