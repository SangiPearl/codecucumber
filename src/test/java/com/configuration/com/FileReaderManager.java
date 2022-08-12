package com.configuration.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class FileReaderManager {
	
	
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFR() {
		FileReaderManager fr= new FileReaderManager();
		return fr;
		
	}
	
	public Config_Reader getInstance_CR() throws Exception
	{
		Config_Reader cr= new Config_Reader();
		return cr;
		
	}
	
	
	
	

}
