package com.Tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Qoo10 {
	
	public static WebDriver driver;
	
	public static void getQoo10Page() {
		
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.qoo10.sg/");
		
	}
	public static void scrollcheck() throws InterruptedException, AWTException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		
	}
	public static void searchbutton() {
		driver.findElement(By.id("search____keyword")).sendKeys("Toys"+KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		driver.navigate().back();
	}
	public static void signin() throws AWTException, InterruptedException {
		WebElement w1 = driver.findElement(By.xpath("//a[@class='lnk']"));
		w1.click();
//		Actions a1=new Actions(driver);
//		a1.contextClick(w1).build().perform();
//		Robot r2=new Robot();
//		r2.keyPress(KeyEvent.VK_DOWN);
//		r2.keyRelease(KeyEvent.VK_DOWN);
//		r2.keyPress(KeyEvent.VK_ENTER);
//		r2.keyRelease(KeyEvent.VK_ENTER);
//		String wh = driver.getWindowHandle();
//		List<String> tab1=new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tab1.get(1));
//		driver.switchTo().window(wh);
////		
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("ramusomu@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.findElement(By.id("tab_login_hpno")).click();
		driver.findElement(By.id("txt_login_hp_no_signin")).sendKeys("9565346890");
		
		driver.findElement(By.id("tab_login_nonmember")).click();
		driver.findElement(By.id("login_email")).sendKeys("rara@yahoo.com");
		driver.findElement(By.id("hp_no")).sendKeys("9898986565");
	}
	public static void register() {
		driver.findElement(By.id("tab_simple_register")).click();
		driver.findElement(By.id("email_id_head")).sendKeys("ramu007");
		WebElement e2 = driver.findElement(By.id("email_id_domain"));
		Select s1=new Select(e2);
		s1.selectByIndex(3);
		driver.findElement(By.id("cust_nm")).sendKeys("ramu");
		driver.findElement(By.id("passwd1")).sendKeys("54562sdf");
		driver.findElement(By.id("confirm_pwd")).sendKeys("54562sdf");
		WebElement e3 = driver.findElement(By.id("reg_birth_year"));
		Select s2=new Select(e3);
		s2.selectByIndex(20);
		WebElement e4 = driver.findElement(By.id("reg_birth_month"));
		Select s3= new Select(e4);
		s3.selectByIndex(5);
		WebElement e5 = driver.findElement(By.id("reg_birth_day"));
		Select s4=new Select(e5);
		s4.selectByIndex(16);
		driver.findElement(By.id("gender_female")).click();
		driver.findElement(By.id("rdo_login_hp_no")).click();
		driver.findElement(By.id("chk_all")).click();
		driver.findElement(By.xpath("//button[@onclick='if(window.btnCreateAccount_onClick) btnCreateAccount_onClick();']")).click();
		driver.navigate().back();
		
	}
	public static void pageinout() {
		driver.findElement(By.xpath("//a[text()='Q·lounge']")).click();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js1.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Time Sale']")).click();
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js2.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Daily Deal']")).click();
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js3.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Global Group Buy']")).click();
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js4.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Qprime Shop']")).click();
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js5.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='K Mall']")).click();
		JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js6.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='LiveCast']")).click();
		JavascriptExecutor js7=(JavascriptExecutor)driver;
		js7.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js7.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
	/*	
		driver.findElement(By.xpath("//a[text()='QuickMart']")).click();
		JavascriptExecutor js8=(JavascriptExecutor)driver;
		js8.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js8.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		*/
		driver.findElement(By.xpath("//a[text()='Style Club']")).click();
		JavascriptExecutor js9=(JavascriptExecutor)driver;
		js9.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js9.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Brand Avenue']")).click();
		JavascriptExecutor js10=(JavascriptExecutor)driver;
		js10.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js10.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Qdelivery']")).click();
		JavascriptExecutor js11=(JavascriptExecutor)driver;
		js11.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		js11.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		driver.navigate().back();
		}
	
	public static void main(String[] args) throws Throwable {
		getQoo10Page();
		scrollcheck();
		searchbutton();
		signin();
		register();
		pageinout();
	}

}
