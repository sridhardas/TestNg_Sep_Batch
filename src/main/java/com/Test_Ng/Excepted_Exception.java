package com.Test_Ng;

import org.testng.annotations.Test;

public class Excepted_Exception {
@Test(expectedExceptions = ArithmeticException.class)
	private void exception() {
int a=5; int b;
       b=a/0;
       System.out.println(b);
	}
}
