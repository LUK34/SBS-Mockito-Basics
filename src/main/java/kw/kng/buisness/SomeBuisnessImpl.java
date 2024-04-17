package kw.kng.buisness;

public class SomeBuisnessImpl
{

	private DataService ds;

	//Constructor Injection
	public SomeBuisnessImpl(DataService ds) 
	{
		super();
		this.ds = ds;
	}

	public int findTheGreatestFromAllTheData()
	{
		int[] data= ds.retrieveAllData();
		int greatestValue=Integer.MIN_VALUE;
		for(int value:data)
		{
			if(value > greatestValue)
			{
				greatestValue=value;
			}
		}
		return greatestValue;
	}
	
}


interface DataService
{
	int[] retrieveAllData();
}



/*
 The unit test is placed in the following path
 
 Path: src/test/java/kw.kng.buisness 
 
 
 */