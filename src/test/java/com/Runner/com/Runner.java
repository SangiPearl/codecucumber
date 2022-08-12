package com.Runner.com;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.CucumberProject.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\feacode\\com\\Script.feature",
glue="src\\test\\java\\com\\StepDefinition\\com",strict = true)




public class Runner{
	public static WebDriver driver = BaseClass.browserLaunch("chrome");
	

}
