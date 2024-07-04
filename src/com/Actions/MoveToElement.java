package com.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	
	public static WebDriver driver;
	public static void order() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https:/www.myntra.com/");
	
	WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
	Actions k=new Actions(driver);
	Thread.sleep(2000);
	k.moveToElement(kids).build().perform();
	WebElement shorts = driver.findElement(By.xpath("//a[text()='Skirts & shorts']"));
	Thread.sleep(2000);
	k.click(shorts).build().perform();
	WebElement home = driver.findElement(By.xpath("//a[text()='Home & Living']"));
	k.moveToElement(home).build().perform();
	Thread.sleep(2000);
	WebElement cup = driver.findElement(By.xpath("//a[text()='Cups and Mugs']"));
	k.click(cup).build().perform();
	}
	public static void main(String[] args) throws Throwable {
		order();
		
	}

}
