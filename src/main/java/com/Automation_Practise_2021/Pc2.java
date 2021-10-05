package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pc2 {
WebDriver driver;
public Pc2(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}


@FindBy(xpath="//*[@id=\"cart_title\"]")	
private WebElement title1;

public WebElement getTitle1() {
	return title1;
	
}
@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
private WebElement adress;
public WebElement getAdress() {
	return adress;
}

@FindBy(xpath="//*[@id=\"center_column\"]/form/div/div[1]/div[1]/div")
private WebElement title2;
public WebElement getTitle2() {
	return title2;
}











}
