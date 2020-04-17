package com.htc.orange.utility;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.htc.orange.config.ConfigProperties;

public class Snapshot {
	
	private WebDriver driver;
	private TimeStampUtility stamp;
	private String fileName;
	public Snapshot(WebDriver driver1)
	{
		this.driver=driver1;
		stamp=new TimeStampUtility();
	}
	ConfigProperties prop=new ConfigProperties();
	 public void capture(String capturename) throws IOException
	    {
		 
	        TakesScreenshot ts = (TakesScreenshot)driver;
	      File srcFile=ts.getScreenshotAs(OutputType.FILE);
	      File dir=new File("Screenshots");
	      if(dir.exists())
	      {
	    	  
	      }
	      else
	      {
	    	  dir.mkdir();
	      }
	      
	      fileName=capturename+stamp.getCurrentTimestamp();
	    
	      File destFile=new File("Screenshots/"+fileName+".png");
	      //FileUtils.copyFile(srcFile,destFile);
	      FileHandler.copy(srcFile, destFile);
	     
	      
	       
	               
	                     
	       
	    
	}
	 
}

