package com.XpathTasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class TicketBooking {
		public static WebDriver driver;
		
		public static void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		}
		
		public static void getUrl() {	
		driver.get("https://www.phptravels.net/login");
		
		}
		
		public static void login() throws IOException {
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("poppey@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("345678");
			driver.findElement(By.xpath("//button[contains(@id,'sub')]")).click();
			TakesScreenshot scst=(TakesScreenshot) driver;//syntax
			File sc=scst.getScreenshotAs(OutputType.FILE);//to take a screen shot
			File fol=new File("C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\ScreenShot\\php.png");
			FileUtils.copyFile(sc, fol);
		
		}
		
	
	public static void main(String[] args) throws IOException {
		browserOpen();
		getUrl();
		login();
			
	
	}

}
