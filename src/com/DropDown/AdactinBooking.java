package com.DropDown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinBooking {
	
	public static WebDriver driver;
	
	public static void browserPage() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("https://adactinhotelapp.com/");
		driver.get("https://adactinhotelapp.com/");
	}
	public static void newUserRegister() {
		WebElement nUser = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		nUser.click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hbhargavakrishna93");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("helloadactin");
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys("helloadactin");
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("bhargavakrishna");
		driver.findElement(By.xpath("//input[@id='email_add']")).sendKeys("hbhargavakrishna93@gmail.com");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.navigate().back();
		
	}
	
	public static void login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hbhargavakrishna93");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("helloadactin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	}	
	public static void search() throws InterruptedException {
		WebElement location=driver.findElement(By.xpath("//select[@id='location']"));
		WebElement hotel=driver.findElement(By.xpath("//select[@id='hotels']"));
		Thread.sleep(1000);
		Select s1=new Select(hotel);
		s1.selectByValue("Hotel Cornice");
		WebElement roomtype=driver.findElement(By.xpath("//select[@name='room_type']"));
		Thread.sleep(1000);
		Select s3=new Select(roomtype);
		s3.selectByVisibleText("Super Deluxe");
		WebElement numberOfRooms=driver.findElement(By.xpath("//select[@name='room_nos']"));
		Thread.sleep(1000);
		Select s4=new Select(numberOfRooms);
		s4.selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("27/03/2024");
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("28/03/2024");
		WebElement adultRooms=driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s5=new Select(adultRooms);
		s5.selectByIndex(2);
		WebElement childRooms=driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s6=new Select(childRooms);
		s6.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	public static void selectHotel() {
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radiobutton.click();
		driver.findElement(By.xpath("//input[@name='continue']")).click();
	}
	public static void bookHotel() throws InterruptedException, IOException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");//Scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");//scroll up
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,3000)");
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Bhargav");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Krishna");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("No.20,AnnaStreet,Anna Nagar,chennai");
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("9898747456563232");
		WebElement cardtype=driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s7=new Select(cardtype);
		s7.selectByIndex(2);
		WebElement month=driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s8=new Select(month);
		s8.selectByIndex(3);
		WebElement year=driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s9=new Select(year);
		s9.selectByIndex(12);
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("225");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.xpath("//a[text()='Back']")).click();
		TakesScreenshot srnsht=(TakesScreenshot)driver;
		File sc=srnsht.getScreenshotAs(OutputType.FILE);
		File fold=new File("C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\ScreenShot\\adactin.png");
		FileUtils.copyFile(sc, fold);
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		browserPage();
		newUserRegister();
		login();
		search();
		selectHotel();
		bookHotel();
	}

}
