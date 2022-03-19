package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	private static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		
	launchBrowser();
	navigate();
	
	
	}
	
	private static void launchBrowser() {
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Ujwal G A\\eclipse-workspace\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
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

	
		
	


