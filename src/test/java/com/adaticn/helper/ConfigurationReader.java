package com.adaticn.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static  Properties p;
	
	public ConfigurationReader() throws Throwable {
		
	 File f  = new 
			 File( "C:\\Users\\Manjula\\eclipse-workspace\\Cucumber_Project\\src\\test\\java\\com\\adaticn\\helper\\Adactin.properties");
		 
	FileInputStream fis = new FileInputStream(f);
	 
	 p = new Properties();
	 
	 p.load(fis);
			 
			 
	}
	
	 public  String getBrowser() {
		 String property = p.getProperty("Browser");
		 return property;

	}
	
	
	 public String getUrl() {
		 String property = p.getProperty("Url");
		 return property;
	}
	
	
	
	
	
	
	
	

}
