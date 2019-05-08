package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Loginpage;

public class LoginPageTestCase extends TestBase {
	Loginpage loginpage;
	 public LoginPageTestCase() {
		super();
	}
	@BeforeMethod
	public void setup(){
		initialisation();
		 loginpage=new Loginpage();
		
	}
	@Test(priority=2)
	public void loginPageTitle(){
		String title=loginpage.validatePageTitle();
		System.out.println("title:::"+title);	
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.","TITLE NOT MATCHED");
		driver.close();
	}
	@Test(priority=1)
	public void crmImage(){
		boolean image=loginpage.validateImage();
		Assert.assertTrue(image);
		driver.close();
	}
	@Test(priority=3)
	public void loginTest(){
		System.out.println("submit");
		loginpage.validateLogin(prop.getProperty("username"),prop.getProperty("passowrd"));
	}
	
	@AfterMethod
	public void tearDown(){
		
	}
}
