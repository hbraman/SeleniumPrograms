package com.DynamicXpath;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Dyanamic {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+KeyEvent.VK_TAB+KeyEvent.VK_ENTER);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement e2 = driver.findElement(By.xpath("//span[text()='Results']/ancestor::div[4]/following-sibling::div[1]//h2/a"));
		e2.click();
		
	}
}
