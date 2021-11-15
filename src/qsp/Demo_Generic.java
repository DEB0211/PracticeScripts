package qsp;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class Demo_Generic 
{

	public static void main(String[] args) throws IOException 
	{
		FileLib f = new FileLib();
		
		//to read the data from property file
		System.out.println(f.getPropertyData("url"));
		
		//to write the data to excel file
		f.setExceData("CreateCustomer", 1, 4, "skipped");
		
		//to read the data from excel file
		System.out.println(f.getExcelData("CreateCustomer", 1, 4));
	}

}
