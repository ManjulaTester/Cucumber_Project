package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver driver;
	
	@FindBy(name = "username")
	
	private WebElement Username;
	
	@FindBy(id = "password")
	
	private WebElement Password;
	
	@FindBy(xpath = "//input[@class='login_button']")
	
	private WebElement login;
	
	public Login_Page(WebDriver driver2) {
		
    this.driver= driver2;
    
   PageFactory.initElements(driver2, this);
		
	}

	
	public WebElement getUsername() {
		return Username;
	}

	
	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
