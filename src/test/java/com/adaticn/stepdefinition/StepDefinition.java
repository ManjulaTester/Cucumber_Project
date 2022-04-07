package com.adaticn.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adaticn.BaseClass;

import com.adaticn.helper.FileReaderManager;
import com.adaticn.helper.PageObjectManager;
import com.adaticn.runner.RunnerClass;
import com.pom.Book_Hotel;
import com.pom.Book_Itinerary;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass  {

	public static WebDriver driver= RunnerClass.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);  // PageObjectManager
	
	
	Login_Page LP = new Login_Page(driver);
	Search_Hotel SH = new Search_Hotel(driver);
	Select_Hotel Sh = new Select_Hotel(driver);
	Book_Hotel BH = new Book_Hotel(driver);
	Book_Itinerary BI = new Book_Itinerary(driver);
	

	@Given("Application is launched and ready for login page")
	public void application_is_launched_and_ready_for_login_page() throws Throwable {


		String url = FileReaderManager.getInstance().getInstanceCr().getUrl();  //FileReaderManager
		getUrl(url);



	}

	//Login_Page P1 = new Login_Page (driver);  //POM

	@When("User enter valid username in the user name field")
	public void user_enter_valid_username_in_the_user_name_field() throws Throwable {

		//sendkeys(P1.getUsername(), "Technology12345");  // POM 
		
		sendkeys(pom.getInstanceLogin_Page().getUsername(), "Technology12345");  //PageObjectManager
		

		//inputElement(driver.findElement(By.xpath("//input[@type='text']")), "Technology12345"); //xpath

		Thread.sleep(2000);

	}
	@When("User enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() throws Throwable {

		//sendkeys(P1.getPassword(),"Technology12345");
		
		sendkeys(pom.getInstanceLogin_Page().getPassword(), "Technology12345"); //PageObjectManager
		

		//////inputElement(driver.findElement(By.xpath("//input[@type='password']")), "Technology12345");
		Thread.sleep(2000);
	}
	@When("Click on login Page")
	public void click_on_login_page() throws Throwable {



		WebElement loginpage = driver.findElement(By.id("login"));
		loginpage.click();
		Thread.sleep(2000);
	}
	@Then("Verified the login as successful and Home page appears")
	public void verified_the_login_as_successful_and_home_page_appears() {
		System.out.println("Successfully login the page");

	}

	Search_Hotel P2 = new Search_Hotel(driver);

	@Given("After login page, Search hotel option is available for booking.")
	public void after_login_page_search_hotel_option_is_available_for_booking() {

	}
	@When("User needs to be fill the exact location.")
	public void user_needs_to_be_fill_the_exact_location() throws Throwable {

		//sendkeys(P2.getLocate(), "location");

		WebElement dropdown = driver.findElement(By.id("location"));
		Select s = new Select(dropdown);

		s.selectByIndex(2);
		Thread.sleep(2000);

	}
	@When("User needs to be select the hotel.")
	public void user_needs_to_be_select_the_hotel() throws Throwable {

		WebElement dropdown = driver.findElement(By.id("hotels"));
		Select s = new Select(dropdown);

		s.selectByIndex(1);
		Thread.sleep(2000);

	}
	@When("User needs to be select the Room type.")
	public void user_needs_to_be_select_the_room_type() throws Throwable {

		WebElement dropdown = driver.findElement(By.xpath("(//select[contains(@class,'search_combobox')])[3]"));
		Select s = new Select(dropdown);

		s.selectByIndex(3);
		Thread.sleep(2000);

	}
	@When("User needs to be select the no of rooms.")
	public void user_needs_to_be_select_the_no_of_rooms() throws Throwable {

		WebElement dropdown = driver.findElement(By.xpath("(//select[contains(@class,'search_combobox')])[4]"));
		Select s = new Select(dropdown);

		s.selectByIndex(3);
		Thread.sleep(2000);
	}
	@When("User needs to be enter the check In date.")
	public void user_needs_to_be_enter_the_check_in_date() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//input[@name='datepick_in']")); 
		element.sendKeys("14/02/2022");

		Thread.sleep(2000);


	}
	@When("User needs to be enter the check out date.")
	public void user_needs_to_be_enter_the_check_out_date() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//input[@name='datepick_out']")); 
		element.sendKeys("20/02/2022");

		Thread.sleep(2000);
	}



	@When("user needs to be select the adult per room.")
	public void user_needs_to_be_select_the_adult_per_room() throws Throwable {

		WebElement element = driver.findElement(By.id("adult_room")); 
		Select s = new Select(element);

		s.selectByIndex(1);

		Thread.sleep(2000);

	}
	@When("user needs to be select the children per room.")
	public void user_needs_to_be_select_the_children_per_room() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@name='child_room']")); 
		Select s = new Select(element);

		s.selectByIndex(1);

		Thread.sleep(2000);


	}
	@When("user click the search option.")
	public void user_click_the_search_option() {

		WebElement element = driver.findElement(By.id("Submit"));
		element.click();

	}
	@Then("Navigate to next page.")
	public void navigate_to_next_page() {

		System.out.println("Successfully moves to next page");
	}


	@Given("Application is launched and Ready to select the hotel.")
	public void application_is_launched_and_ready_to_select_the_hotel() {

		System.out.println("Select the hotel");


	}

	Select_Hotel p3 = new Select_Hotel(driver);

	@When("User needs to be select the radio button from the hotel list.")
	public void user_needs_to_be_select_the_radio_button_from_the_hotel_list() throws Throwable {


		click(p3.getRadio(), "radiobutton_0");

		///WebElement element = driver.findElement(By.id("radiobutton_0"));
		////element.click();

		Thread.sleep(2000);



	}
	@When("User needs to be click on continue option.")
	public void user_needs_to_be_click_on_continue_option() throws Throwable {

		click(p3.getSubmit(), "continue");


		//WebElement element2 = driver.findElement(By.xpath("(//input[contains(@class,'reg_button')])[1]"));
		//element2.click();
		Thread.sleep(2000);

	}
	@Then("Hotel is selected and navigate the next page.")
	public void hotel_is_selected_and_navigate_the_next_page() {

		System.out.println("Successfully navigate to next page");

	}
	
	Book_Hotel p4 = new Book_Hotel(driver);

	@Given("Application is launched and ready for Book the hotel.")
	public void application_is_launched_and_ready_for_book_the_hotel() {

		System.out.println("Book the hotel");


	}
	@When("User needs to enter the First name in the field.")
	public void user_needs_to_enter_the_first_name_in_the_field() throws Throwable {
		
		
		sendkeys(p4.getFirstname(), "Technology");

		//WebElement element2 = driver.findElement(By.xpath("//input[@name='first_name']"));
		//element2.sendKeys("Technology");
		Thread.sleep(2000);

	}
	@When("User needs to be enter last name in the field.")
	public void user_needs_to_be_enter_last_name_in_the_field() throws Throwable {
	
		
		//sendkeys(p4.getLastname(), "Technology123");

		WebElement element2 = driver.findElement(By.xpath("//input[@name='last_name']"));
		element2.sendKeys("Technology123");
		Thread.sleep(2000);

	}

	@When("user needs to be enter the Billing Address in field.")
	public void user_needs_to_be_enter_the_billing_address_in_field() throws Throwable {

		WebElement element2 = driver.findElement(By.id("address"));
		element2.sendKeys("124,Thanthai Periyar Nagar,Ayanavaram,Chennai");
		Thread.sleep(2000);


	}
	@When("User  needs to be enter the Credit Card No in the field.")
	public void user_needs_to_be_enter_the_credit_card_no_in_the_field() throws Throwable {

		WebElement element2 = driver.findElement(By.id("cc_num"));
		element2.sendKeys("3213127832459987");
		Thread.sleep(2000);


	}
	@When("User needs to be enter the Credit Card Type in the field.")
	public void user_needs_to_be_enter_the_credit_card_type_in_the_field() throws Throwable {

		WebElement dropdown = driver.findElement(By.id("cc_type"));
		Select s = new Select(dropdown);

		s.selectByIndex(2);
		Thread.sleep(2000);


	}
	@When("User needs to be enter the Expiry Date in the field.")
	public void user_needs_to_be_enter_the_expiry_date_in_the_field() throws Throwable {


		WebElement dropdown = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(dropdown);

		s.selectByIndex(11);

		WebElement dropdown2 = driver.findElement(By.id("cc_exp_year"));
		Select sc = new Select(dropdown2);

		sc.selectByIndex(11);

		Thread.sleep(2000);


	}
	@When("User needs to be enter the CVV Number in the field.")
	public void user_needs_to_be_enter_the_cvv_number_in_the_field() throws Throwable {

		WebElement dropdown = driver.findElement(By.id("cc_cvv"));
		dropdown.sendKeys("314");

		Thread.sleep(2000);


	}
	@When("User needs to be Book now for book the hotel.")
	public void user_needs_to_be_book_now_for_book_the_hotel() throws Throwable {

		WebElement dropdown = driver.findElement(By.id("book_now"));
		dropdown.click();

		Thread.sleep(3000);


	}
	@Then("Hotel is Booked successfully.")
	public void hotel_is_booked_successfully() throws Throwable {

		Thread.sleep(2000);

	}

Book_Itinerary P5 = new Book_Itinerary(driver);

	@Given("Application is launched and ready to click the Booked Itinerary.")
	public void application_is_launched_and_ready_to_click_the_booked_itinerary() throws Throwable {


		WebElement dropdown2 = driver.findElement(By.id("my_itinerary"));
		dropdown2.click();

		Thread.sleep(2000);
	}
	@When("User needs check all the booked details and then select the check box for Booked Itinerary.")
	public void user_needs_check_all_the_booked_details_and_then_select_the_check_box_for_booked_itinerary() throws Throwable {

		
		click(P5.getCheckBox1(), "(//input[@name='ids[]'])[1]");
		
		//WebElement dropdown = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		//dropdown.click();

		//WebElement dropdown2 = driver.findElement(By.xpath("(//input[@name='ids[]'])[2]"));
		//dropdown2.click();

	
		WebElement dropdown1 = driver.findElement(By.xpath("//input[@name='cancelall']"));
		dropdown1.click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	@When("User needs to be click Ok button for confirmation.")
	public void user_needs_to_be_click_ok_button_for_confirmation() throws Throwable {

		System.out.println("Hotel Book");

	}

	@When("User either click cancel button for cancel the book")
	public void user_either_click_cancel_button_for_cancel_the_book() {
	    
		WebElement dropdown2 = driver.findElement(By.xpath("(//input[@class='reg_button'])[3]"));
		dropdown2.click();

		driver.close();	

	}

	@Then("Booked Itinerary verified.")
	public void booked_itinerary_verified() {

		System.out.println("Succesfully verified");
	}

}
