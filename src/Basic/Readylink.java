package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readylink {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	
	WebElement search = driver.findElement(By.id("APjFqb"));
	search.sendKeys("https://user.readylink.in");
	Thread.sleep(2000);
	WebElement enter = driver.findElement(By.name("btnK"));
	enter.click();
	
	WebElement page = driver.findElement(By.xpath("rcuQ6b:npT2md;PYDNKe:bLV6Bd;mLt3mc"));
	page.click();
	
	WebElement enter2 = driver.findElement(By.id("username"));
	enter2.sendKeys("ram@gamail.com");
	
	WebElement enter3 = driver.findElement(By.name("password"));
	enter3.sendKeys("876543");
	WebElement agree = driver.findElement(By.className("action"));
	agree.click();
	WebElement login = driver.findElement(By.className("rigtht"));
	login.click();
	
	
	}

}
