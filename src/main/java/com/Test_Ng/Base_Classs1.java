package com.Test_Ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Classs1 {
	public static WebDriver driver;
public static WebDriver getBrowser (String type) {
if (type.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
 driver = new ChromeDriver();
}
else if (type.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"driver\\chromedriver.exe");
	driver=new FirefoxDriver();
}
driver.manage().window().maximize();
return driver;
}
	public static void quit() {
driver.quit();
	}
	public static void clickOnElement(WebElement element) {
element.click();
	}
	public static void inputValueElement(WebElement element,String value) {
element.sendKeys(value);
	}
	public static void dropDownByIndex(WebElement element,int numbers) {
		Select sc=new Select(element);
		sc.selectByIndex(numbers);
	}
	public static void dropDownByValue(WebElement element,String type) {
Select sc= new Select(element);
sc.selectByValue(type);


	}
	public static void dropDownByVisibleText(WebElement element,String value) {
Select sc=new Select(element);
sc.selectByVisibleText(value);
	}
	
	public static void getUrl(String url) {
driver.get(url);
	}

public static void waitConcept(int a) {
driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS );
}

public static void navigateTo(String value) {
driver.navigate().to(value);
}
public static void thread(int a) throws Throwable {
Thread.sleep(a);
}
public static void action(WebElement element) {
Actions act=new Actions(driver);
act.moveToElement(element).build().perform();
}
public static void action1(WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).click().build().perform();
}
public static void qtyClickon(WebElement element) {
	for (int i = 0; i <14; i++) {
		element.click();
}
	
}	
public static void dropDown(WebElement element,String a) {
Select sc=new Select(element);
int int1 = Integer.parseInt(a);
sc.selectByIndex(int1);	
}
		
//		
//if (type.equalsIgnoreCase("value")) {
//	sc.selectByValue(type);	
//}else if (type.equalsIgnoreCase("text")) {
//	sc.selectByVisibleText(type);
		
		
		
		
		

	}


