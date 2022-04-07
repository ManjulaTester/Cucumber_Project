package com.adaticn.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adaticn.BaseClass;
 
import com.adaticn.helper.ConfigurationReader;
import com.adaticn.helper.FileReaderManager;
import com.adaticn.stepdefinition.StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adaticn\\feature" ,  
glue = "com\\adaticn\\stepdefinition",
dryRun = false,  monochrome = false , plugin = {"pretty" , "json:target/cucumber/report.json"}
)



public class RunnerClass {
	
	public static WebDriver driver;

	 @BeforeClass
	public static void setUp() throws Throwable {
	
	   /////driver = BaseClass.getBrowser("chrome");
	 
		 String browser = FileReaderManager.getInstance().getInstanceCr().getBrowser();
		 
		driver= BaseClass.getBrowser(browser);
		 
		
	}
	
	
	
}
		
