package com.Tasks;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScannerTask {
	
	  public static void main(String[] args)
	  {
		  
		  
	    System.out.println("Enter option to search:");
	    try (Scanner sc = new Scanner(System.in)) {
			String eText=sc.next();
			int found=0;
			System.out.println("Searching....");
  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Prem\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.worldometers.info/geography/alphabetical-list-of-countries/");
			WebElement listbox = driver.findElement(By.xpath("//table[@style='height: auto !important;']"));
			Select select=new Select(listbox);
			List<WebElement> allOptions = select.getOptions();
			
			for(int i=0;i<allOptions.size();i++)
			{
			    String atext = allOptions.get(i).getText();
			    if(atext.equals(eText))
			    {
			      found++;
			    }
			}
			
			if(found==0)
			{
			  System.out.println(eText+" is not found"); //No matching
			}
			else if(found==1) // if found >1 then duplicates
			{
			  System.out.println(eText+" is found"); //matching found
			}
			else
			{
			  System.out.println(eText+ "is duplicate");
			}
			  driver.close();
		}
	  }
	}

