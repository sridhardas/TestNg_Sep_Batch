package com.Test_Ng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {
@Test
@Parameters({"username","password"})
private void credentials(String username,@Optional("venuvenkat")String password) {
System.out.println("username"+username);
System.out.println("password"+password);
}	
	
	
}
