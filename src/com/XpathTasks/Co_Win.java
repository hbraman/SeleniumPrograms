package com.XpathTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Co_Win {
	
	static WebDriver driver;
	
	public static void browserPage() throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("https://www.cowin.gov.in/home");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div[5]/div/div[12]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/span/a")).click();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
	}
	public static void select_state() throws AWTException, Throwable {
			
			WebElement state = driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c69-352']"));
			state.click();
			driver.findElement(By.xpath("//mat-option[@id='mat-option-55']")).click();
			
			driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c69-354']")).click();
			driver.findElement(By.xpath("//mat-option[@id='mat-option-103']")).click();
			driver.findElement(By.xpath("//button[text()='Search']")).click();
			
			
			TakesScreenshot srnsht=(TakesScreenshot)driver;
			File sc=srnsht.getScreenshotAs(OutputType.FILE);
			File fold=new File("C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\ScreenShot\\cowin.png");
			FileUtils.copyFile(sc, fold);
			

	}
			
	public static void main(String[] args) throws  Throwable {
		browserPage();
		select_state();
		
	}	
	

}
