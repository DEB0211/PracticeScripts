package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\debas\\Desktop\\testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet("").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
