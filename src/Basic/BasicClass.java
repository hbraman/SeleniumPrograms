package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass {
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		//interface       //class
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		//wd.close();
		/*wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		wd.get("http://www.gmail.com/");*/
		wd.close();
	}
	

	
	}


