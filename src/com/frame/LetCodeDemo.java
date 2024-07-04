package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		WebElement f2 = driver.findElement(By.xpath("//iframe[@name='firstFr']"));
		driver.switchTo().frame(f2);//for webelement reference
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Bhargava");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("Krishna");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("bhargava007@gmail.com");
		driver.switchTo().defaultContent();
		//driver.navigate().back();
	
	}
	
	

}
