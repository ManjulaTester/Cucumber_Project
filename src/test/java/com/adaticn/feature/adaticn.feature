Feature: Adactin hotel booking application

Scenario: Login functionality

Given Application is launched and ready for login page
When  User enter valid username in the user name field
And   User enter the password in the password field
And   Click on login Page

Then  Verified the login as successful and Home page appears

Scenario: Search Hotel functionality

Given After login page, Search hotel option is available for booking.
When User needs to be fill the exact location.
And User needs to be select the hotel.
And  User needs to be select the Room type.
And  User needs to be select the no of rooms.
And  User needs to be enter the check In date.
And  User needs to be enter the check out date.
And  user needs to be select the adult per room.
And  user needs to be select the children per room.
And user click the search option.

Then Navigate to next page.

Scenario: Select the Hotel functionality


Given Application is launched and Ready to select the hotel.
When  User needs to be select the radio button from the hotel list.
And  User needs to be click on continue option.

Then  Hotel is selected and navigate the next page.



Scenario: Book the Hotel functionality

Given Application is launched and ready for Book the hotel.
When  User needs to enter the First name in the field.
And User needs to be enter last name in the field.
And user needs to be enter the Billing Address in field.
And User  needs to be enter the Credit Card No in the field.
And User needs to be enter the Credit Card Type in the field.
And  User needs to be enter the Expiry Date in the field.
And User needs to be enter the CVV Number in the field.
And User needs to be Book now for book the hotel.

Then Hotel is Booked successfully.

Scenario: Booked Itinerary functionality

Given  Application is launched and ready to click the Booked Itinerary.
When  User needs check all the booked details and then select the check box for Booked Itinerary.
And User needs to be click Ok button for confirmation.
And  User either click cancel button for cancel the book

Then  Booked Itinerary verified.




























