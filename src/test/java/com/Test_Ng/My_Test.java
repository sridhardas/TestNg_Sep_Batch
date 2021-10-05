package com.Test_Ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {

	@Test
	private void username() {
String excepted_username="smith123";
String actual_username="smithabc";
		
		Assert.assertEquals(actual_username, excepted_username);
		System.out.println("done");
	}
	@Test
	private void password() {
	String excepted_username="srimachi123";
	String actual_username="srimachi123";
	
}}
