package com.windowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		
		for (String s : allwindow) {
			 if (!s.equals(allwindow)) {
				 driver.switchTo().window(s);
				 driver.manage().window().maximize();
				
				 
				 
			}
		
			
		}
		
	}

}
