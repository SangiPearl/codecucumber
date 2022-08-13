package com.CucumberProject;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.configuration.com.FileReaderManager;

//import com.cucumber.listener.Reporter;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Script.feature", glue ="com.StepDefinition.com",
		 strict = true,
monochrome=true,plugin={"json:target/cucumber-reports/Cucumber.json","html:test-output/SparkReport","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)		

public class Test {
	public static WebDriver driver;

	//public static WebDriver driver=BaseClass.browserLaunch("chrome");

	
	
	@BeforeClass
	public static void setup() throws Exception {
		String browser1 = FileReaderManager.getInstanceFR().getInstance_CR().getbrowser();
		 driver = BaseClass.browserLaunch(browser1);
	}
	
	@AfterClass
	public static void closure(){
	
		
		driver.close();
	}
	
	

	
	

}
