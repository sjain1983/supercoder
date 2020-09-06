package LearnnSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/My files/Learnings/Automation/Softwares and Drivers/Drivers/chromedriver");
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in");
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone xr mobile phone");
		d1.findElement(By.xpath("//input[@value='Go']")).click();
		d1.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		
	
	}

}

