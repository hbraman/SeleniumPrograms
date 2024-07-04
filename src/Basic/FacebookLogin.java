package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("9585346580");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("coolneveen");
	
	WebElement login = driver.findElement(By.className("selected"));
	login.click();
	
	
	
	
	
	
	
	}
	

}
