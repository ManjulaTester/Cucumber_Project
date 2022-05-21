package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object and class created for Chrome
		
		driver.get("https://www.amazon.in/");     //passing the URL 
		
		driver.navigate().to("https://www.facebook.com/");   // passing another URL
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		String currentUrl = driver.getCurrentUrl();   // Current URL 
		System.out.println(currentUrl);
		
		String title = driver.getTitle();   // Tab on the URL title
		System.out.println(title);
		
		driver.close();    // close the browser
		
		

	}

}
