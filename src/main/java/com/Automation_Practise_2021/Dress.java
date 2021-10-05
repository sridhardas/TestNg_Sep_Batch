package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress {
public Dress(WebDriver driver2) {
	this.driver=driver2;
PageFactory.initElements(driver, this);
}

WebDriver driver;
@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]")
private WebElement dress;
public WebElement getDress() {
	return dress;
}
@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]")
private WebElement evedress;
public WebElement getEvedress() {
	return evedress;
}
@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
private WebElement cart;
public WebElement getCart() {
	return cart;
}


}
