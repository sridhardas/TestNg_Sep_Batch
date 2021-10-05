package com.Test_Ng;

import org.testng.annotations.Test;

public class Grouping_Test {
	@Test(groups = "socialmedia")
private void facebook() {
System.out.println("login facebook");
}
	@Test(groups = "e_commerce")
private void amazon() {
System.out.println("login to amazon");

}
	@Test(groups ="socialmedia" )
private void twitter() {
System.out.println("tweet in twitter");
}

@Test(groups = "music")
	private void spotify() {
System.out.println("listen in spotify");
	}

	@Test(groups = "music")
	private void wync() {
System.out.println("listen to wync");
	}
	
}
