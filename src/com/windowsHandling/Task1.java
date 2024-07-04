package com.windowsHandling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	
	static WebDriver driver;
	
	public static void mainwindow() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		search.sendKeys("https://www.amazon.in/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void window1() throws Throwable {
		WebElement w1 = driver.findElement(By.xpath("//a[text()='Electronics & Accessories']"));
		Actions a1=new Actions(driver);
		a1.contextClick(w1).build().perform();
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);

	}
	public static void window2() {
		WebElement w2 = driver.findElement(By.xpath("//a[text()='Home, Kitchen & Outdoors']"));
		Actions a2=new Actions(driver);
		a2.keyDown(Keys.CONTROL).moveToElement(w2).click().perform();	
	}
	public static void window3() {
		
		WebElement w3 = driver.findElement(By.xpath("//a[text()='Books & Toys']"));
		Actions a3=new Actions(driver);
		a3.keyDown(Keys.CONTROL).moveToElement(w3).click().perform();
	}
	public static void window4() {
		
		WebElement w4 = driver.findElement(By.xpath("//a[text()='Home appliances']"));
		Actions a4=new Actions(driver);
		a4.keyDown(Keys.CONTROL).moveToElement(w4).click().perform();
	}
	public static void switchWindow() {
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		List<String> switchwindow=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(switchwindow);
		
			driver.switchTo().window(switchwindow.get(1));
			driver.findElement(By.id(wh));
			
		
			}
		
		public static void screenshot() throws IOException {
			
			TakesScreenshot sc=(TakesScreenshot)driver;
			File source=sc.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\ScreenShot\\amazon2.png");
			FileUtils.copyFile(source, dest);	
			//driver.quit();
		}
		
	
		
		

	
	
	
	public static void main(String[] args) throws Throwable {
		mainwindow();
		window1();
		window2();
		window3();
		window4();
		switchWindow();
		screenshot();

		
	}
}
