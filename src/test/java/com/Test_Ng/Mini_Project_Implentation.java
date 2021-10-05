package com.Test_Ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation_Practise_2021.Page_Object_Manager;

import configuration_properties.File_Reader_Manager;

public class Mini_Project_Implentation extends Base_Classs1{
	
	public static  WebDriver driver=getBrowser("chrome");//null
	//getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
@Test(priority = 1)	
private void launchBrowser() {
//getBrowser("chrome");

}
// static Page_Object_Manager pom = new Page_Object_Manager(driver);
@Test(priority = 2)
private void launchUrl() {
getUrl("http://automationpractice.com/index.php");
}
//@Test(priority = 3,dataProvider = "test_data")
//private void loginPage() throws Throwable {
//	
//	clickOnElement(pom.getInstanceSip().getLoginbtn());
//	String username = File_Reader_Manager.getInstance().getInstanceCr().getUsername();
//	inputValueElement(pom.getInstanceSip().getEmailid(), username);
//	
//	
//	
//}
@Test(priority = 3,dataProvider = "test_data")
private void credentials(String username,String password) {

	clickOnElement(pom.getInstanceSip().getLoginbtn());
	inputValueElement(pom.getInstanceSip().getEmailid(), username);
inputValueElement(pom.getInstanceSip().getPassword(), password);
clickOnElement(pom.getInstanceSip().getSignin());


}
@DataProvider

private Object[][] test_data() {
return new Object[][] {
	{"sridhar@123","venu123"},
	{"sridhardas743@gmail.com","venuvenkat1997"}
	//{"sridhar@123","venu123"}
	
};
}
@Test(priority=4)
private void waits() {
waitConcept(30);
}
@Test(priority = 5)
private void purchase() throws Throwable {
action(pom.getInstanceDress().getDress());

	action1(pom.getInstanceDress().getEvedress());
	clickOnElement(pom.getInstanceDress().getCart());
	waitConcept(30);
	qtyClickon(pom.getInstanceCart().getQtyclick());
	String size = File_Reader_Manager.getInstance().getInstanceCr().getSize();
	dropDown(pom.getInstanceCart().getSize(), size);

	clickOnElement(pom.getInstanceCart().getColor());
	clickOnElement(pom.getInstanceCart().getCart1());
	clickOnElement(pom.getInstancePc1().getCheckout());
	clickOnElement(pom.getInstancePc2().getAdress());
	clickOnElement(pom.getInstancePc3().getShipping());

	clickOnElement(pom.getInstancePc3().getCheckbox());

	clickOnElement(pom.getInstancePc3().getPayment());
	clickOnElement(pom.getInstancePc4().getPaymentmode());

	clickOnElement(pom.getInstancePc4().getConfirmbutton());

}
}


	
	
	
	

