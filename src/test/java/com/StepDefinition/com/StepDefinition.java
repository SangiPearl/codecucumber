package com.StepDefinition.com;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.CucumberProject.BaseClass;
import com.CucumberProject.Hotel_Elements;
import com.CucumberProject.POM;
import com.CucumberProject.Test;
import com.configuration.com.FileReaderManager;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = Test.driver;
	public static Hotel_Elements h = new Hotel_Elements(driver);
	public static POM p = new POM(driver);

	@Given("Application launched successfully")
	public void application_launched_successfully() throws Exception {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\SANGEETHA\\Desktop\\now\\chromedriver.exe");
		// driver = new ChromeDriver();
		//driver=browserLaunch("chrome");
		String url=FileReaderManager.getInstanceFR().getInstance_CR().geturl();
		openurl(url);
		//openurl("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("user enter the username in the username field")
	public void user_enter_the_username_in_the_username_field() throws Exception {
		entervalue(h.getUsername(), FileReaderManager.getInstanceFR().getInstance_CR().getname());
		//driver.findElement(By.id("username")).sendKeys("SangiSai");
	}

	@When("user enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() throws Exception {
		//entervalue(h.getPwd(), "Sairam@123");
		entervalue(h.getPwd(), FileReaderManager.getInstanceFR().getInstance_CR().getpwd());
	}

	@Then("click the login button")
	public void click_the_login_button() {
		clickonButton(h.getLogin());
		wait(200);
	}

	@Given("Successful login")
	public void successful_login() {
		System.out.println("login successfull");
	}

	@When("user selects the location and other columns in search hotel page")
	public void user_selects_the_location_and_other_columns_in_search_hotel_page() {
		//dropdown(h.getLocation(), "index", "4");
	WebElement loc=	driver.findElement(By.name("location"));
	dropdown(loc, "index", "4");
		wait(100);
	}
	
	@When("user adds the hotel")
	public void user_adds_the_hotel() {
		dropdown(h.getHotel(), "index", "3");
		wait(100);
		dropdown(h.getRoomtype(), "index", "3");
		wait(100);
		dropdown(h.getRoomnos(), "index", "3");
		wait(100);
		dropdown(h.getAdult(), "index", "3");
		wait(100);
		dropdown(h.getChild(), "index", "3");
		wait(100);
		
	    }

	
	
	@Then("Click Search")
	public void click_Search() {
		clickonButton(h.getSearch());
		wait(100);

	}

	@When("click the radio button of chosen hotel")
	public void click_the_radio_button_of_chosen_hotel() {
		clickonButton(p.getBP().getHotelclick());
	}

	@Then("click continue button")
	public void click_continue_button() {
		clickonButton(p.getBP().getContinue_button());

	}

	@When("Fill in the user details")
	public void fill_in_the_user_details() {
		entervalue(p.getBP().getFirstname(), "Sangeetha");
		wait(100);
		entervalue(p.getBP().getLastname(), "sai");
		wait(100);
		entervalue(p.getBP().getAddress(), "chennai");
		wait(100);
		entervalue(p.getBP().getCardno(), "1234567891234567");
		wait(100);
		dropdown(p.getBP().getCardtype(), "index", "3");
		wait(100);
		dropdown(p.getBP().getMonth(), "index", "3");
		wait(100);
		dropdown(p.getBP().getYear(), "index", "3");
		wait(100);
		entervalue(p.getBP().getCvv(), "589");
		wait(100);
		clickonButton(p.getBP().getBooknow());

		wait(100);

	}

	@Then("click the MyItinerary button")
	public void click_the_MyItinerary_button() {
		driver.findElement(By.xpath("//*[@id=\"my_itinerary\"]")).click();

		wait(100);
	}

	@When("Take screenshot of the page")
	public void take_screenshot_of_the_page() throws IOException {
		screenshot("D:\\2021\\AddactinProject\\image\\order.png");
		wait(500);

	}

	@Then("click the logout button")
	public void click_the_logout_button() {
				
		System.out.println("logout button click");
		//closethepage();
	}

}
