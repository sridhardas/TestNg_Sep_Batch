package com.Test_Ng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class2 {
static WebDriver driver;
public static String value;
public static WebDriver browserLaunch(String type) {
if (type.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
}
driver.manage().window().maximize();
return driver;
}
	public static void url(String value) {
driver.get(value);
	}
	
	public static void clickOnElement(WebElement element) {
element.click();
	}
	public static void inputValueOnElement(WebElement element,String value) {
element.sendKeys(value);
	}
	public static void waitConcept(int a) {
driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
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
	public static void scrshot(String pathname) throws IOException {
		TakesScreenshot shot=(TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File des=new File(pathname);
		FileUtils.copyFile(src, des);
	}
	public static void jsExecuter(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		
	}
	
	public static void quit() {
driver.quit();

	}
	public static void close() {
driver.close();
	}
//	public static String particular_Data(String path,int row_index,int column_index) throws Throwable {
//		File f=new File(path);
//	//	FileInputStream fis=new FileInputStream(f);
//		FileInputStream fis=new FileInputStream(f);
//		Workbook  w= new XSSFWorkbook(fis);
//	//	Workbook w=new XSSFWorkbook(fis);
//		Sheet sheetAt = w.getSheetAt(0);
//		Row row = sheetAt.getRow(row_index);
//		Cell cell = row.getCell(column_index);
//		CellType cellType = cell.getCellType();
//		if (cellType.equals(CellType.STRING)) {
//			value= cell.getStringCellValue();
//			//System.out.println(stringCellValue);
//		}
//		else if (cellType.equals(CellType.NUMERIC)) {
//			double numericCellValue = cell.getNumericCellValue();
//			value = Double.toString(numericCellValue);
//			//int value=(int) numericCellValue;
//			//System.out.println(value);
//		}
//		return value;
//	}
	
	
	}

