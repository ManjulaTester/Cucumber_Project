package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Book_Hotel {
	
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebDriver creditcard;
	
	@FindBy(id = "cc_type")
	private WebElement creditCardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	public Book_Hotel(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
		
	}

	
	public WebElement getFirstname() {
		return firstname;
	}

	
	public WebDriver getLastname() {
		return lastname;
	}

	
	public WebDriver getAddress() {
		return address;
	}

	
	public WebDriver getCreditcard() {
		return creditcard;
	}

	
	public WebElement getCreditCardType() {
		return creditCardType;
	}

	
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	
	public WebElement getExpiryYear() {
		return expiryYear;
	}

	
	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	
	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
