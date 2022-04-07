package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Itinerary {

	public static WebDriver driver;

	@FindBy(id = "my_itinerary")
	private WebElement myItinerary;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkBox1;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkbox2;

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement Cancel;

	@FindBy(name = "logout")
	private WebElement logout;

	public Book_Itinerary(WebDriver driver2) {

		this.driver= driver2;

		PageFactory.initElements(driver2, this);


	}

	
	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getCheckBox1() {
		return checkBox1;
	}

	public WebElement getCheckbox2() {
		return checkbox2;
	}

	
	public WebElement getCancel() {
		return Cancel;
	}

	
	public WebElement getLogout() {
		return logout;
	}
































}
