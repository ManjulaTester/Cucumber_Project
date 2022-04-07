package com.adaticn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static Object TakesScreenshot; 

	public static WebDriver getBrowser(String browser) {   // setup method

		try {

			if (browser.equalsIgnoreCase("chrome")) {    

				System.setProperty("webdriver.chrome.driver","C:\\Users\\Manjula\\eclipse-workspace\\Cucumber_Project\\src\\Driver\\chromedriver.exe");

				driver = new ChromeDriver();

				driver.manage().window().maximize();


			}
			else if (browser.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\eclipse-workspace\\Cucumber_Project\\src\\Driver\\chromedriver.exe");

				driver = new InternetExplorerDriver();

			}

			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Manjula\\eclipse-workspace\\Cucumber_Project\\src\\Driver\\chromedriver.exe"); 

				driver = new EdgeDriver();

			}

			else {
				System.out.println("Invalid Browser");


			}
		}	
		catch (Exception e) {
			e.printStackTrace();

		}
		return driver;
		
	}

	public static WebDriver getUrl(String url) {
		try {

			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;	

	}
	
	public static WebDriver getUsername(String username) {
		
	
		return driver;
		
		
	}
	
	
	public static WebDriver getPassword(String password) {
		
		
		return driver;	
		
	}	
	
	
	public static void getCurrentUrl()
	{	driver.getCurrentUrl();

	}

	public static void forward() {

		driver.navigate().forward();
	}

	public static void backward() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void close() {
		driver.close();
	}

	public static void enabled(WebElement element) {
		element.isDisplayed();
	}

	public static void displayed(WebElement element) {
		element.isDisplayed();
	}

	public static void selected(WebElement element) {
		element.isSelected();
	}

	public static void screenshot(String[] args) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;   /// Screenshots
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("path");
		FileUtils.copyFile(screenshotAs, destination);
	}

	public static void selection(WebElement element, String option, String value) {
		Select sc = new Select(element);
		try {
			if (option.equalsIgnoreCase("ByIndex")) {

				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);

			}
			else  if (option.equalsIgnoreCase("ByValue")) {
				sc.selectByValue(value);

			}

			else if (option.equalsIgnoreCase("byVisiblityText")) {
				sc.selectByVisibleText(value);
			}
			else {
				System.out.println("Invalid Option");
			}

		}

		catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}


	public static void clickonElement(WebElement element) {
		element.click();
	}

	public static void clearonElement(WebElement element) {
		element.clear();
	}

	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}

	public static void confirmAlert(String ok, String cancel) {

		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		}
		else if (cancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();	
		}
	}
	public static void prompetAlert(String ok, String value,String cancel) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();
		}
		else if (cancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().dismiss();	
		}
	}
	public static void actionMethod(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void dragDrop(WebElement element, WebElement element1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element1).build().perform();

	}
	public static void robotClass() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}


	public static void pageUp(WebElement element) {

		JavascriptExecutor Js = (JavascriptExecutor) driver; 
		Js.executeScript("arguments[0].scrollIntoView();" ,  element);
	}

	public static void pageDown(WebElement element) {

		JavascriptExecutor Js = (JavascriptExecutor) driver; 
		Js.executeScript("arguments[0].scrollIntoView();" ,  element);
	}


	public static void frameMethod(WebElement element, String option, String value) {
		try {

			if (option.equalsIgnoreCase("ByIndex")) {

				int parseInt = Integer.parseInt(value);
				driver.switchTo().frame(parseInt);
			}
			else  if (option.equalsIgnoreCase("ByValue")) {
				driver.switchTo().frame(element);

			}

			else if (option.equalsIgnoreCase("ByString")) {
				driver.switchTo().frame(value);
			}
			else {
				System.out.println("Invalid Option");
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void elementClear(WebElement element) {
		element.clear();
	}

	public static void windowsHandling() {
		Set<String> element = driver.getWindowHandles();

		for (String string : element) {

			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);	
		}

	}


	public static void inputElement(WebElement element, String value){


		try {

			element.sendKeys(value);
			element.findElement(By.name(value));
			element.findElement(By.id(value));
			element.findElement(By.xpath(value));
			element.findElement(By.linkText(value));


		} catch (Exception e) {
			e.printStackTrace();
		}


	}


public static void sendkeys(WebElement element , String value){
	
	element.sendKeys(value);
	
}

public static void click (WebElement element , String value) {
	
	element.click();
	
}












}
