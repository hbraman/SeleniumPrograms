package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		
//		
//		driver.findElement(By.xpath("//a[text()='Interactions ']")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Drag and Drop ']")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Static ']")).click();
//		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0, 400)");
//		
	//	WebElement from = driver.findElement(By.id("dragarea"));
		
		WebElement element = driver.findElement(By.id("angular"));
		WebElement element2 = driver.findElement(By.id("node"));
		
		WebElement to = driver.findElement(By.id("droparea"));
		
		Actions c=new Actions(driver);
		c.dragAndDrop(element, to).build().perform();
		c.dragAndDrop(element2, to).build().perform();
		
	}

}
