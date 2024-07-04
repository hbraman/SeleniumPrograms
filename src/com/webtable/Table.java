package com.webtable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.get("https://en.wikipedia.org/wiki/List_of_districts_in_India");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0, 600)");
	/*	
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement a : alldata) {
			String text = a.getText();
			System.out.println(text);
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));	
		for (WebElement b : row) {
			String text2 = b.getText();
			System.out.println(text2);
		}
			
		
		List<WebElement> colom = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for (WebElement c : colom) {
			String text3 = c.getText();
			System.out.println(text3);
		}*/
		
		WebElement singleData = driver.findElement(By.xpath("//table/tbody/tr[8]/td[6]"));
		System.out.println(singleData.getText());
		
			
		}
		}
	


