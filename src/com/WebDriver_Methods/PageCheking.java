package com.WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCheking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		wd.get("http://www.gmail.com/");
		
		Navigation a=wd.navigate();
		a.to("https://www.amazon.in/");
		a.to("https://www.amazon.in/b?ie=UTF8&node=7459780031");
		Thread.sleep(3000);
		a.back();
		Thread.sleep(2000);
		a.back();
		Thread.sleep(4000);
		a.forward();
		String title=wd.getCurrentUrl();
		System.out.println(title);
		System.out.println(wd.getCurrentUrl());
		System.out.println(wd.getPageSource());
		
		wd.navigate().to("https://www.facebook.com/");
		wd.close();
		
	}

}
