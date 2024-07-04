package com.Alart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[contains(text(),'alert box')]")).click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(2000);
	a.accept();
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	Alert a2 = driver.switchTo().alert();
	a2.dismiss();
	//driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	
	Thread.sleep(2000);
	Alert alert2 = driver.switchTo().alert();
	alert2.sendKeys("I am Ironman");
	Thread.sleep(1000);
	alert2.accept();
	
	
	
	
	
	
	}
	

}
