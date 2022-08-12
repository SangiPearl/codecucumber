package com.configuration.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {

	public static Properties p;
	
	public Config_Reader() throws Exception {
		File f= new File("D:\\2021\\CucumberProject\\src\\test\\java\\com\\configuration\\com\\configuration.properties");
		FileInputStream fis= new FileInputStream(f);
		p= new Properties();
		p.load(fis);
		
	}
	
	public String getbrowser() {
		String browser2=p.getProperty("browser");
		return browser2;
	}
	
	public String geturl() {
		String url1=p.getProperty("url");
		return url1;
	}
	
	
	public String getname() {
		String name=p.getProperty("username");
		return name;
	}
	
	public String getpwd() {
		String name=p.getProperty("password");
		return name;
	}
	
	public String getreportconfigpath(){
		String reportconfigpath = p.getProperty("reportconfigpath");
		if(reportconfigpath!= null) return reportconfigpath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
	public String getoutputfolder() {
		String outputfolder=p.getProperty("outputfolder");
		return outputfolder;
	}
	
	
}
