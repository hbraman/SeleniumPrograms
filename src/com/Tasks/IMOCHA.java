package com.Tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IMOCHA {
	
	public static WebDriver driver;
	
	public static void mainwindow(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("https://www.imocha.io/");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click(); 
	}
	
	/*public static void imochaPage() throws AWTException {
		WebElement tap1 = driver.findElement(By.xpath("//cite[text()='https://www.imocha.io']"));
		Actions a1=new Actions(driver);
		a1.contextClick(tap1).build().perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyPress(KeyEvent.VK_ENTER);
		String gwh = driver.getWindowHandle();
		List<String> tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		driver.findElement(By.id(gwh));
		
	}*/
	public static void  mainPageCheckup() throws InterruptedException {
		WebElement tap1 = driver.findElement(By.xpath("//cite[text()='https://www.imocha.io']"));
		tap1.click();
		driver.findElement(By.xpath("//div[@fs-cc='close']")).click();
		
		driver.findElement(By.xpath("//div[@class='white-cross _2']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement gdpr = driver.findElement(By.xpath("//a[text()='GDPR']"));
		js.executeScript("arguments[0].scrollIntoView();",gdpr);
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,0)");
		Thread.sleep(2000);	
	}
	/*public static void helpmsg() {
		//driver.findElement(By.xpath("//p[text()='Hi, Welcome to iMocha!']"+KeyEvent.VK_ENTER));
		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//p[text()='Hi, Welcome to iMocha!']"));
		a.click(ele).build().perform();
		//Alert a1=driver.switchTo().alert();
		//a1.accept();
		driver.findElement(By.xpath("//div[@placeholder='Write a message']")).sendKeys("Hi imocha i am bhragav"+KeyEvent.VK_ENTER);
	}*/
	public static void in_outCheck() throws InterruptedException, AWTException {
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		//String gwh = driver.getWindowHandle();
		List<String> tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(tab1.get(1)).close();	
		
		driver.findElement(By.xpath("//div[@role='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='menu-link-2']")).click();
		driver.navigate().back();
		driver.findElement(By.id("w-dropdown-toggle-1")).click();
		Thread.sleep(2000);
		
	/*	
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("//a[@class='outline-button w-button']")).click();
		//driver.get("https://www.imocha.io/integration-partners");
		JavascriptExecutor js2=((JavascriptExecutor)driver);
		js2.executeScript("window.scrollBy(document.body.scrollHeight)","");
		js2.executeScript("window.scrollBy(0,0)");
		Thread.sleep(2000);	
		
	*/		
		
	
	
	
	
	}
		
		
	
	public static void main(String[] args) throws Throwable {
		mainwindow();
	//	imochaPage();
		mainPageCheckup();
	//	helpmsg();
		in_outCheck();
	}

}
