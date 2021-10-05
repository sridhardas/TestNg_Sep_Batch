package com.Test_Ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	private void setProperty() {
System.out.println("set property");
	}
	@BeforeTest
	private void sout() {
		System.out.println("browser launch");
	}
	@BeforeClass
	private void url() {
System.out.println("go to url");
	}
@BeforeMethod
private void login() {
	System.out.println("find the webelement");
	System.out.println("click the webelement");
}
//@Ignore
	@Test(enabled=false)
	private void laptop() {
		//System.out.println("find the webelement");
		//System.out.println("click the webelement");
		  System.out.println("buy a laptop");
	}

	@Test
	private void mobile() {
		System.out.println("buy the mobile phone");
	}

	@Test
	private void earphone() {
		System.out.println("buy a new earphone");
	}
	@AfterMethod
private void logout() {
System.out.println("logout");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
