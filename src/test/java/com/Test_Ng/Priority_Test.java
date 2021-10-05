package com.Test_Ng;

import org.testng.annotations.Test;

public class Priority_Test {
	@Test(priority = 3)
	private void mobile() {
		System.out.println("buy a mobile phones");
	}

	@Test(priority = 4,invocationCount = 5)
	private void laptop() {
		System.out.println("buy a laptop");
	}

	@Test(priority = 5
			)
	private void speaker() {
		System.out.println("buy a speaker");
	}

	@Test(priority = 2)
	private void book() {
		System.out.println("buy books");
	}

	@Test(priority = 1)
	public void dress() {
		System.out.println("buy dresses");
	}
	
}
