package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Handling_Property_File 
{

	public static void main(String[] args) throws IOException 
	{
		//get the java representative object of physical file
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		//create an object of properties class
		Properties p = new Properties();
		//load the file so that get property method will come to know where the file is
		p.load(fis);
		//read or get the data from the property file by passing the key
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);

	}

}
