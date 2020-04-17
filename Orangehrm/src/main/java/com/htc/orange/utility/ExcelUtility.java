package com.htc.orange.utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.htc.orange.config.ConfigProperties;

public class ExcelUtility {
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static FileInputStream ExcelFile;
	



public static void setExcelFile(String FileName,String SheetName) throws Exception {

	   try {

			// Open the Excel file

			ExcelFile = new FileInputStream(FileName);
			

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			} catch (Exception e){

				throw (e);

			}

	}

public static Object[][] getTableArray()    throws Exception

{   

   Object[][] tabArray = null;

   try{
	   // Access the required test data sheet

	 
	   int lastRowNum=ExcelWSheet.getLastRowNum();
	   int lastCellNum=ExcelWSheet.getRow(0).getLastCellNum();
	   tabArray=new Object[lastRowNum][1];
	   for (int i = 0; i < lastRowNum; i++) {
		      Map<Object, Object> datamap = new HashMap<>();
		      for (int j = 0; j < lastCellNum; j++) {
		        datamap.put(ExcelWSheet.getRow(0).getCell(j).toString(), ExcelWSheet.getRow(i+1).getCell(j).toString());
		      }
		      tabArray[i][0] = datamap;

		    }
		    
		}
   catch(Exception e)
   {
	   
   }
return tabArray;


}


	
	
	


	}
	
	
	

