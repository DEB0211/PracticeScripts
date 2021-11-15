package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handling_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		//get the java representative object of physical file
		FileInputStream fis = new FileInputStream("");
		
		//load the file or create a workbook
		Workbook wb = WorkbookFactory.create(false);
		
		//get the control of the sheet, get the control of row, then cell, then get or read the data
		String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(data);

	}

}
