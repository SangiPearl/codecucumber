Feature: Check the booking in Adactin Hotel Application


Scenario: check the login is working fine

Given  Application launched successfully

When  user enter the username in the username field

And user enter the password in the password field

Then click the login button


Scenario: Search the hotel

Given Successful login

When user selects the location and other columns in search hotel page

And user adds the hotel

Then Click Search


Scenario: Select the Hotel

When click the radio button of chosen hotel

Then click continue button


Scenario: Give the user details

When Fill in the user details


Scenario: Booking confirmation

Then click the MyItinerary button


Scenario: Booked Itinerary

When Take screenshot of the page

Then click the logout button






