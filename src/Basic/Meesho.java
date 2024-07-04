package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Meesho {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\src\\com\\Browserlanch\\Meesho.java");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		/*d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		d.get("https://www.meesho.com/");
		*/
		
	}

}
