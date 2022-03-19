package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {
	private static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		
	}

	private static void LaunchBrowser() 
	{
			try
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Ujwal G A\\eclipse-workspace\\Web-Automation\\Library\\drivers\\geckodriver.exe" );
				oBrowser=new FirefoxDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
private static void navigate()
{
	try
	{
		oBrowser.get("http://localhost:83/administration/userlist.do");

	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}



		
	


