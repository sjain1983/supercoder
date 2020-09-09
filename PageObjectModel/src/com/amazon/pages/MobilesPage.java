package com.amazon.pages;

import org.openqa.selenium.By;

import com.amazon.page.MasterPage;

public class MobilesPage extends MasterPage{
	
	public void mobilesPageNavigation() {
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]")).click();
	}

	public void iphonexrSearch() {
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[1]")).sendKeys("iphone xr mobile phone");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/input")).click();
	}
	
	
		
		
	}
