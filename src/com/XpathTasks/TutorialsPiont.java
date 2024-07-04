package com.XpathTasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsPiont {

	public static WebDriver driver;

	public static void browserLanch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}

	public static void pageUrl() {

		driver.get("https://www.tutorialspoint.com/");
	}

	public static void register() throws InterruptedException {
		WebElement sign = driver.findElement(By.xpath("//a[text()='SIGN UP']"));
		sign.click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Bhargava");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Last name')]")).sendKeys("Krishna");
		driver.findElement(By.xpath("//input[contains(@placeholder,'E-mail')]"))
				.sendKeys("bhargavakrishna93@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile')]")).sendKeys("9787744662");
		driver.findElement(By.xpath("//button[@id='nextBtn']")).click();
		Thread.sleep(3000);

	}

	public static void mypage() throws InterruptedException, IOException {
		driver.navigate().back();
		driver.navigate().back();
		WebElement sign1 = driver.findElement(By.xpath("//a[text()='SIGN UP']"));
		sign1.click();
		driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("9787744662");
		driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("cooltpoint2024");
		driver.findElement(By.xpath("//button[@id='sign_in_btn']")).click();
		Thread.sleep(2000);
		TakesScreenshot sht = (TakesScreenshot) driver;
		File sc = sht.getScreenshotAs(OutputType.FILE);
		File fold = new File("C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\ScreenShot\\tutorialpoint.png");
		FileUtils.copyFile(sc, fold);

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		browserLanch();
		pageUrl();
		register();
		mypage();

	}
}
