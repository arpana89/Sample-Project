package com.crm.qa.utils;

import java.sql.Driver;

import com.crm.qa.base.TestBase;

public class TestUtils extends TestBase {

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	public void switchToFrame(){
		driver.switchTo().frame("mainpanel");
	}
	
}
