package com.windowsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	
	public static WebDriver driver;
	
	public static void myntra() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	
	}
	public static void kids() {
		
		WebElement kid = driver.findElement(By.xpath("//a[@data-reactid='335']"));
		Actions act=new Actions(driver);
		act.moveToElement(kid).build().perform();
		WebElement tshirt = driver.findElement(By.xpath("//a[@data-reactid='345']"));
		tshirt.click();
		
		
		List<WebElement> full = driver.findElements(By.xpath("//li[@class='product-base']"));
		System.out.println("Total size no of TShirt:"+full.size());
		
		for (WebElement all : full) {
			String st = all.getText();
			System.out.println(st);
			
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		myntra();
		kids();
	}

	
	
}
	