package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");   /// URL passing


		//simple alert 

		WebElement Simplealert = driver.findElement(By.xpath("//button[@class='btn btn-danger']")); 
		Simplealert.click();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();  //alert
		alert.accept();

		//confirm Alert /// task

		WebElement ConfirmAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]")); 
		ConfirmAlert.click();

		Thread.sleep(3000);

		WebElement Calert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		Calert.click();

		Thread.sleep(3000);

		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

		//Prompt Alert

		WebElement PromptAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		PromptAlert.click();

		Thread.sleep(3000);

		WebElement Palert = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		Palert.click();

		Thread.sleep(3000);

		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Automation Tester");


		driver.switchTo().alert().accept();
		
		//Alert alert4 = driver.switchTo().alert();
		//alert4.accept();
		

		Thread.sleep(3000);

		driver.close();







	}

}
