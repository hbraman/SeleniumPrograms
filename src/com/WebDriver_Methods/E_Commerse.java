package com.WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Commerse {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("https://www.google.com/");
		w.manage().window().maximize();
		w.get("http://www.gmail.com/");
		Thread.sleep(3000);
		w.get("https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/&ec=GAZAmgQ");
			
		Navigation n=w.navigate();
		
		n.back();
		n.to("https://www.google.com/");
		Thread.sleep(3000);
		n.back();
		w.get("https://www.amazon.com/");
		w.close();
		
		
		
		
	}

}