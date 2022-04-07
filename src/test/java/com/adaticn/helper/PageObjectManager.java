package com.adaticn.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.Book_Itinerary;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class PageObjectManager {
	
	
	public static WebDriver driver;
	
	private Login_Page LP;
	private Search_Hotel SH;
	private Select_Hotel Sh;
	private Book_Hotel BH;
	private Book_Itinerary BI;
	
	public PageObjectManager(WebDriver driver2) {
		
		this.driver = driver2;
		
	}
	
	public Login_Page getInstanceLogin_Page() {
		
		Login_Page LP = new Login_Page(driver);
		return LP;
		
		
	}
	
	public Search_Hotel getInstanceSearch_Hotel() {
		
		Search_Hotel SH = new Search_Hotel(driver);
		return SH;
		
		
		
	}
	
	
	public Select_Hotel getInstanceSelect_Hotel() {	
		
		Select_Hotel Sh = new Select_Hotel(driver);
		return Sh;
		
		
	}
	
	public Book_Hotel getInstanceBook_Hotel() {
		
		Book_Hotel BH = new Book_Hotel(driver);
		return BH;
		
		
	}
	
	public Book_Itinerary getInstanceBook_Itinerary() {
		
		Book_Itinerary BI = new Book_Itinerary(driver);
		return BI;
		
		
	}
	
	
	

}
