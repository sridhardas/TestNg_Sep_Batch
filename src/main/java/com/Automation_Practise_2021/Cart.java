package com.Automation_Practise_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
WebDriver driver;
	
	
@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]")	
private WebElement qtyclick;

public Cart(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}

public WebElement getQtyclick() {
	return qtyclick;
}
@FindBy(id="group_1")
private WebElement size;

public WebElement getSize() {
	return size;
}
@FindBy(id="color_24")
private WebElement color;

public WebElement getColor() {
	return color;
}
@FindBy(xpath="//*[@id=\"add_to_cart\"]/button")
private WebElement cart1;

public WebElement getCart1() {
	return cart1;
}
}
