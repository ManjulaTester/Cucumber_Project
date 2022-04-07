package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver driver;
	
	@FindBy(id= "location")
	private WebElement locate;
	
	@FindBy(id= "hotels")
	private WebElement Hotels;
	
	@FindBy(xpath = "(//select[contains(@class,'search_combobox')])[3]")
	private WebElement RoomType;
	
	@FindBy(xpath = "(//select[contains(@class,'search_combobox')])[4]")
	private WebElement NumberofRooms;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement CheckInDate;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebDriver CheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	
	public Search_Hotel(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver2, this);
		
	}

	

	/**
	 * @return the locate
	 */
	public WebElement getLocate() {
		return locate;
	}

	/**
	 * @return the hotels
	 */
	public WebElement getHotels() {
		return Hotels;
	}

	/**
	 * @return the roomType
	 */
	public WebElement getRoomType() {
		return RoomType;
	}

	/**
	 * @return the numberofRooms
	 */
	public WebElement getNumberofRooms() {
		return NumberofRooms;
	}

	/**
	 * @return the checkInDate
	 */
	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	/**
	 * @return the checkOutDate
	 */
	public WebDriver getCheckOutDate() {
		return CheckOutDate;
	}

	/**
	 * @return the adultRoom
	 */
	public WebElement getAdultRoom() {
		return adultRoom;
	}

	/**
	 * @return the childRoom
	 */
	public WebElement getChildRoom() {
		return childRoom;
	}

	/**
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
