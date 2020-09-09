package com.amazon.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MasterPage {
	
	public WebDriver driver; 
	
	public MasterPage() 
	{
		System.setProperty("webdriver.chrome.driver", "/Volumes/My files/Learnings/Automation/Softwares and Drivers/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	
	}

}
