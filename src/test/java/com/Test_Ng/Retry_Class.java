package com.Test_Ng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {
int count=1;
int limit=5;
	@Override
	public boolean retry(ITestResult result) {
		if (count<=limit) {
			count++;
			return true;//execute
		}
		
		
		return false;//exit
		
		
	}

	
	
	
	
	
}
