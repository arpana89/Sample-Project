package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.utils.TestUtils;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		 prop=new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("F:\\Eclipse_Workspace\\FreeCRMTest\\src\\main"
					+ "\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialisation(){
		String browser=prop.getProperty("browser");
		System.out.println("browser :::"+browser);
		if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		String url=prop.getProperty("URL");
		System.out.println("URL"+url);
		driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

}
