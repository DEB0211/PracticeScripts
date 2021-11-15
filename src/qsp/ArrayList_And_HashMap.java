package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList_And_HashMap 
{

	public static void main(String[] args) 
	{
		ArrayList<String> lst = new ArrayList<>();
		lst.add("https://demo.actitime.com/");
		lst.add("admin");
		lst.add("admin@actitime.com"); //if email is added tommorow
		lst.add("manager");
		System.out.println(lst.get(2)); //it will print email instead of password
		
		HashMap<String, String> map = new HashMap<>();
		map.put("url", "https://demo.actitime.com/");
		map.put("username", "admin");
		//map.put("email", "admin@actitime.com"); //even if email is added
		map.put("password", "manager");
		System.out.println(map.get("password")); //it will print same output
	}

}
