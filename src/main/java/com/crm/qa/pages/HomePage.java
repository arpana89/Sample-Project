package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//td[contains(text(),'User: test crm')]")
	WebElement usercheck;
	@FindBy(linkText="CONTACTS")
	WebElement contacts;
	@FindBy(linkText="Forms")
	WebElement forms;
	@FindBy(id="handle_CRMBLOG")
	WebElement textcheck;
	@FindBy(linkText="New Contact")
	WebElement newContact;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	public String pageTitle(){
		return driver.getTitle();
	}
	
	public boolean usernamecheck(){
		System.out.println("usercheck::;"+usercheck);
		return usercheck.isDisplayed();
		}
	public ContactsPage contactslickcheck(){
		contacts.click();
		return new ContactsPage();
	}
	public String textcheckHomePage(){
		return textcheck.getText();
	}
	public  ContactsPage newContactClick() throws InterruptedException{
		Actions action=new Actions(driver);
action.moveToElement(contacts).click().build().perform();
Thread.sleep(2000);
newContact.click();
		return new ContactsPage();
	};
}
