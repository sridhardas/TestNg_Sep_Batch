package com.Test_Ng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Automation_Practise_2021.Cart;
import com.Automation_Practise_2021.Dress;
import com.Automation_Practise_2021.Pc1;
import com.Automation_Practise_2021.Pc2;
import com.Automation_Practise_2021.Pc3;
import com.Automation_Practise_2021.Pc4;
import com.Automation_Practise_2021.SignInPage2;

public class Page_Object_Manager {
	public WebDriver driver;
public Page_Object_Manager(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}


private SignInPage2 s2;
private Dress d;
private Cart c;
private Pc1 a;
private Pc2 b;
private Pc3 c1;
private Pc4 d1;

public SignInPage2 getInstanceSip() {
s2=new SignInPage2(driver);
return s2;
}
public Dress getInstanceDress() {
d=new Dress(driver);
return d;
}
public Cart getInstanceCart() {
c=new Cart(driver);
return c;
}
public Pc1 getInstancePc1() {
a=new Pc1(driver);
return a;
}
public Pc2 getInstancePc2() {
b=new Pc2(driver);
return b;
}
public Pc3 getInstancePc3() {
c1=new Pc3(driver);
return c1;
}
public Pc4 getInstancePc4() {
d1=new Pc4(driver);
return d1;
}

}
