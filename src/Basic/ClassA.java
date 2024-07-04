package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
}
