package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.utils.TestUtils;



public class HomePageTestCases extends TestBase{
	HomePage homepage;
	ContactsPage contactsPage;
	Loginpage loginPage;
	TestUtils testutil;
	
	public HomePageTestCases(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialisation();
		testutil=new TestUtils();
		loginPage=new Loginpage();
		homepage=loginPage.validateLogin(prop.getProperty("username"),prop.getProperty("passowrd"));
				
	}
	
	/*@Test(priority=1)
	public void homepagetitlecheck(){
		String homePageTitle=homepage.pageTitle();
		testutil.switchToFrame();
		Assert.assertEquals(homePageTitle, "CRMPRO");
		driver.close();
	}
	
	@Test(priority=2)
	
	public void userNameCheck(){
		testutil.switchToFrame();
		Assert.assertTrue(homepage.usernamecheck());
		driver.close();
	}
	@Test(priority=3)
	public void contactsClick(){
		testutil.switchToFrame();
		homepage.contactslickcheck();
		driver.close();
		
		
	}
	@Test(priority=4)
	public void checkText(){
		testutil.switchToFrame();
	String text=homepage.textcheckHomePage();
	Assert.assertEquals(text, "CRMPRO News");
	driver.close();
	}*/
	@Test(priority=5)
	public void newConatctpage() throws InterruptedException{
		testutil.switchToFrame();
		homepage.newContactClick();
	}
}
