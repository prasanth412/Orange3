package com.htc.orange.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.htc.orange.utility.MyException;

public class ConfigProperties {

	
	Properties prop=new Properties();
	FileInputStream ip=null;
	public ConfigProperties()
	{
		loadPropertyFile();
	}
	private void loadPropertyFile() 
	{
		
		try {
			ip = new FileInputStream("./resources/configuration/config.properties");
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String fetchPropertyFromFile(String propertykey) throws MyException
	{
		String fetchValue=null;
		
		fetchValue=prop.getProperty(propertykey);
		
		if(fetchValue==null)
		{
			throw new MyException("Unable to fetch the property from configuration file");
		}
		return fetchValue;
		
		
	}
	
	
}
