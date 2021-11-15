package qsp;

public class A 
{
	private int i;	//declaration
	
	public A()
	{
		i = 10;	//initialization
	}
	public int getValue()	//giving only read access
	{
		return i;
	}
	public void setValue(int j)	//giving write access
	{
		i=j;
	}

}
