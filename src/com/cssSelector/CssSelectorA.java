package com.cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorA {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("bhargav");
		driver.findElement(By.cssSelector("#pass")).sendKeys("54654");
		driver.findElement(By.cssSelector("[data-testid^='royal']")).click();
		
		
	}

}
