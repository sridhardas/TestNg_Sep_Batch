package configuration_helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
 public static Properties p;
	public Configuration_Reader() throws Throwable {
		//1.create a constructer
		//2.convert .properties into file
		//3.to read the file file input syream is used
		//4.create object for properties
		//5.load properties
		File f=new File("C:\\Users\\sridhar\\eclipse-workspace\\Automation_Practise_2021\\src\\main\\java\\configuration_properties\\configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getBrowser() {
String browser = p.getProperty("browser");
return browser;

	}
	public String getUrl() {
String url = p.getProperty("url");
return url;

	}public String getUsername() {
String username = p.getProperty("db_Username");
return username;

	}public String getPassword() {
String password = p.getProperty("db_Password");
return password;
	}
	public String getSize() {
String size = p.getProperty("db_Size");
return size;
	}

}
