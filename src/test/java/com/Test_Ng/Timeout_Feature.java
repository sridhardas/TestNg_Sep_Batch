package com.Test_Ng;

import org.testng.annotations.Test;

public class Timeout_Feature {
@Test(timeOut = 3000)	
	private void logIn() throws Throwable {
System.out.println("enter username");
System.out.println("enter password");
Thread.sleep(1000);
System.out.println("click login button");
Thread.sleep(2000);
System.out.println("navigate to home page");
	}
	
	public static void main(String[] args) {

	}

}
