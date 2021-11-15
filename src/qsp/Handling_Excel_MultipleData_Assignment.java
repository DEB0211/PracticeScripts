package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handling_Excel_MultipleData_Assignment {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		
		int rowcount = wb.getSheet("InvalidLogin").getLastRowNum();
		int  cellcount = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
		for(int i = 1; i <= rowcount; i++)
		{
			for(int j = 0; j < cellcount; j++)
			{
				String un = wb.getSheet("InvalidLogin").getRow(i).getCell(j).getStringCellValue();
				System.out.println(un);
			}
		}
		
		/*
		 * alternative way to solve above problem.
		//get the control of the sheet
		Sheet sheet = wb.getSheet("InvalidLogin");
		
		//get the control of the row
		Row row = sheet.getRow(1);
		
		//get the control of the cell
		Cell cell = row.getCell(2);
		
		//get the data from the cell
		String data = cell.getStringCellValue();
		
		//print it on the console
		System.out.println(data);
		*/

	}

}
