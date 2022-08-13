$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Script.feature");
formatter.feature({
  "name": "Check the booking in Adactin Hotel Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check the login is working fine",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Application launched successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.application_launched_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username in the username field",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.user_enter_the_username_in_the_username_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the password in the password field",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.user_enter_the_password_in_the_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search the hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Successful login",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.successful_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the location and other columns in search hotel page",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.user_selects_the_location_and_other_columns_in_search_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.user_adds_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Search",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.click_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Select the Hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click the radio button of chosen hotel",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.click_the_radio_button_of_chosen_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Give the user details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Fill in the user details",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.fill_in_the_user_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking confirmation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click the MyItinerary button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.click_the_MyItinerary_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booked Itinerary",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Take screenshot of the page",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.take_screenshot_of_the_page()"
});
formatter.result({
  "error_message": "java.nio.file.AccessDeniedException: C:\\Users\\SANGEE~1\\AppData\\Local\\Temp\\screenshot17126317648221998382.png -\u003e D:\\2021\\AddactinProject\\image\\order.png\r\n\tat java.base/sun.nio.fs.WindowsException.translateToIOException(WindowsException.java:89)\r\n\tat java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:103)\r\n\tat java.base/sun.nio.fs.WindowsFileCopy.copy(WindowsFileCopy.java:209)\r\n\tat java.base/sun.nio.fs.WindowsFileSystemProvider.copy(WindowsFileSystemProvider.java:284)\r\n\tat java.base/java.nio.file.Files.copy(Files.java:1305)\r\n\tat org.apache.commons.io.FileUtils.copyFile(FileUtils.java:850)\r\n\tat org.apache.commons.io.FileUtils.copyFile(FileUtils.java:756)\r\n\tat com.CucumberProject.BaseClass.screenshot(BaseClass.java:147)\r\n\tat com.StepDefinition.com.StepDefinition.take_screenshot_of_the_page(StepDefinition.java:137)\r\n\tat ✽.Take screenshot of the page(file:///D:/2021/CucumberProject/Script.feature:45)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click the logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.com.StepDefinition.click_the_logout_button()"
});
formatter.result({
  "status": "skipped"
});
});