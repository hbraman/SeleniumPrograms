package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSignIn {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();// import= ctrl+Shift+O
		
		driver.get("https://www.facebook.com/");
		
//		driver.navigate().to("https://www.google.com/");
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//
//		driver.navigate().forward();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("email"));
//	
		userName.sendKeys("asfsfgs");
		
	//WebElement pwd = driver.findElement(By.id("pass"));
//		
//		//pwd.sendKeys("aeaw");
//		
		driver.findElement(By.id("pass")).sendKeys("dhdhd");
//		
	driver.findElement(By.name("login")).click();
	}

}
