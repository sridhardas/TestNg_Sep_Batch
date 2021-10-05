package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pc4 {
WebDriver driver;



@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
private WebElement paymentmode;



public Pc4(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}



public WebElement getPaymentmode() {
	return paymentmode;
}
@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
private WebElement confirmbutton;



public WebElement getConfirmbutton() {
	return confirmbutton;
}
@FindBy(xpath="//*[@id=\"center_column\"]/h1")
private WebElement title3;



public WebElement getTitle3() {
	return title3;
}


}
