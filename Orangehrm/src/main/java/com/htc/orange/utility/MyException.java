package com.htc.orange.utility;

public class MyException extends Exception {
	
	public MyException(String s)
	{
		super(s);
	}

	
	public String toString() 
	{
		return "MyException [toString()=" + super.toString() + "]";
	}
	
	
}
