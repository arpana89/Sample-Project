package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase {
	@FindBy(name="username")
	WebElement name;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@value='Login']")
	WebElement submit;
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement imgLogo;
	@FindBy(linkText="Sign Up")
	WebElement signupLink;
	
	
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){	
		System.out.println("driver::"+ driver);
		return driver.getTitle();
	}
	public boolean validateImage(){
		return imgLogo.isDisplayed();
	}
	public boolean validateSignupText(){
		return signupLink.isDisplayed();
	}
		public HomePage validateLogin(String user,String pwd){
			name.sendKeys(user);
			password.sendKeys(pwd);
			submit.click();
			return new HomePage();
		}
	}
	
	

