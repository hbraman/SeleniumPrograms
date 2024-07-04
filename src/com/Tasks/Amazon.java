package com.Tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	
	public static WebDriver driver;
	
	public static void GetAmazonUrl() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("WebDriver: Chrome");
		System.out.println("WebPage: https://www.amazon.in/");
	}
//	public static void searchHardDisk() {
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HardDisk");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		driver.navigate().back();
		
	//}
	public static void selectBeautyProduct() throws AWTException, InterruptedException {
		WebElement e1 = driver.findElement(By.id("nav-search-dropdown-card"));
		e1.click();
		driver.findElement(By.xpath("//option[@value='search-alias=beauty']")).click();
	//	Select s=new Select(e1);
		//s.selectByVisibleText("Beauty");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moisturizer");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='left-pane-results-container']//div[@aria-label='moisturizer for body']")).click();
		//driver.findElement(By.xpath("//div[@class='left-pane-results-container']/descendant::div[12][@aria-label='moisturizer for body']")).click();
		System.out.println("SelectBeautyProduct:moisturizer for body");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");
		js.executeScript("window.scrollBy(0,-4000)");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.navigate().back();
	}
	public static void searchMoblie() {
		try {
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::div[5]/following-sibling::div[3]/descendant::div[5]/a[5]")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		}
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2000)");
		WebElement e2 = driver.findElement(By.xpath("//span[text()='Price']"));
		js.executeScript("arguments[0].scrollIntoView();",e2);
		driver.findElement(By.xpath("//span[text()='Over ₹20,000']")).click();
		
	}
	public static void selectMobile() throws InterruptedException {
		WebElement mob = driver.findElement(By.xpath("//span[text()='Results']/ancestor::div[4]/following-sibling::div[3]"));
		mob.click();
		String details = mob.getText();
		System.out.println("Mobile Details:"+details);
//		Thread.sleep(4000);
//		List<WebElement> icons= driver.findElements(By.xpath("//div[@id='altImages']/descendant::li[@data-csa-c-action='image-block-alt-image-hover']"));
//		//WebElement icons = driver.findElement(By.id("altImages"));
//		Actions a= new Actions(driver);
//		for (WebElement icon : icons) {
//			WebElement element = icon.findElement(By.xpath("//li[@class='a-spacing-small item imageThumbnail a-declarative']"));
//			
//			a.moveToElement(element).build().perform();
//			
		}
		
		
	
	//public static void exchangeOptions() {
		//driver.findElement(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-active']")).click();
		//driver.findElement(By.xpath("//span[text()='Choose phone to exchange']")).click();
//	driver.findElement(By.xpath()).click();
	//driver.findElement(By.xpath("//*[@id='chooseButton']/span/input")).click();
	//}
	public static void main(String[] args) throws AWTException, InterruptedException {
		GetAmazonUrl();
		//searchHardDisk();
		selectBeautyProduct();
		searchMoblie();
		selectMobile();
		//exchangeOptions();
	}
	
	

}
