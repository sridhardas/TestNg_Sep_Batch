package com.Test_Ng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	
	
	

	@Test(dataProvider ="test_data")
	private void credentials(String username, String password) {
System.out.println("username"+"->"+username);
//System.out.println("password"+"->"+password1);
System.out.println("password"+"->"+password);
	}
	
@DataProvider
private Object[][] test_data() {
	return new Object[][] {
		{"smith","abc123"},
		{"abishek","cba123"},
		{"rahul","123abc"},
		{"anand","1234"}
};
}


}
