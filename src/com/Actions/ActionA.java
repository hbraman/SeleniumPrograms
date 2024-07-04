package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionA {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions a=new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));

		a.contextClick(electronics).build().perform();//right click
		a.click(electronics).build().perform();
		
		driver.get("https://www.facebook.com/");
		Actions b=new Actions(driver);
		WebElement usearname = driver.findElement(By.id("email"));
		usearname.sendKeys("htfkytwfrwgrfrf");
		b.doubleClick(usearname).build().perform();
		
	}

}
