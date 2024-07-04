package Basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IndianBank {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
	
	WebElement search = driver.findElement(By.id("APjFqb"));
	search.sendKeys("https://www.indianbank.net.in/");
	Thread.sleep(1000);
	WebElement enter = driver.findElement(By.name("btnK"));
	enter.click();
	
	WebElement login = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div/div/div/h3/a"));
	login.click();
	
	WebElement username = driver.findElement(By.id("uid"));
	username.sendKeys("bhargav");
	
	WebElement captcha = driver.findElement(By.name("captcha"));
	captcha.sendKeys("90");
	
	WebElement proceed = driver.findElement(By.id("l_login_button"));
	proceed.click();
	
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File Dest = new File("");
	FileUtils.copyFile(source, Dest);
	
	
	
	
	
	
	}
	
	

}
