package com.Test_Ng;

import configuration_helper.Configuration_Reader;

public class File_Reader_Manager {

	public Configuration_Reader getInstanceCr() throws Throwable {
Configuration_Reader reader=new Configuration_Reader();
return reader;
	}
	public static File_Reader_Manager getInstance() {
File_Reader_Manager manager=new File_Reader_Manager();
return manager;
	}
	
private File_Reader_Manager() {
}	
}
