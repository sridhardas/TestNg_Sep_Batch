package com.Test_Ng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
@Test
private void data_Validation() {
String excepted_username="smith";
String actual_username="smith123";

//Assert.assertEquals(actual_username, excepted_username);


SoftAssert s=new SoftAssert();
s.assertEquals(actual_username, excepted_username);
System.out.println("data verication"+"->"+"soft assert");

System.out.println("data validation");

}
}
