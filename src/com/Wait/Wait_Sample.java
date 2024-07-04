package com.Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Sample {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hbhargavakrishna93");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("helloadactin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		WebElement name = driver.findElement(By.xpath("//input[@value=\"Hello hbhargavakrishna93!\"]"));
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(name));
		System.out.println("My Portal");
		
	
	
	
	}
	
	

}
