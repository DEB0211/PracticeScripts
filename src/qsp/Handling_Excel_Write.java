package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handling_Excel_Write {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		//get the control of the sheet. the row, then cell, then type the data
		wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("fail");
		
		//convert the java representative object into physical file format
		FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
		
		//save the workbook or file (actual writing happens here)
		wb.write(fos);
		
		//close the workbook or file
		wb.close();
	}

}
