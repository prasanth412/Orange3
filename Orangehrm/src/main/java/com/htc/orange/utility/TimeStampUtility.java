package com.htc.orange.utility;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimeStampUtility {

	
	private Timestamp timestamp; 
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	private String timestampString;
	
	public String getCurrentTimestamp()
	{
		timestamp=new Timestamp(System.currentTimeMillis());
		timestampString=sdf.format(timestamp);
		return timestampString;
	}
}
