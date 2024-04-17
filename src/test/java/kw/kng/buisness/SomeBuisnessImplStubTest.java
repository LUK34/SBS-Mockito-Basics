package kw.kng.buisness;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBuisnessImplStubTest {

	@Test
	void findTheGreatestNumberFrom_AllTheData_basicScenario()
	{
		DataServiceStub1 dataServiceStub= new DataServiceStub1();//crating an instance here
		SomeBuisnessImpl buisnessImpl= new SomeBuisnessImpl(dataServiceStub);
		
		int result =buisnessImpl.findTheGreatestFromAllTheData();//
		System.out.println("Greatest value from STUB 1 is :"+ result);
		assertEquals(25, result);
	}
	
	
	@Test
	void findTheGreatestNumberFrom_SingleData_basicScenario()
	{
		DataServiceStub2 dataServiceStub= new DataServiceStub2();//crating an instance here
		SomeBuisnessImpl buisnessImpl= new SomeBuisnessImpl(dataServiceStub);
		
		int result =buisnessImpl.findTheGreatestFromAllTheData();//
		System.out.println("Greatest value from STUB 2 is :"+ result);
		assertEquals(32, result);
	}

}

//The below is STUB
class DataServiceStub1 implements DataService
{

	@Override
	public int[] retrieveAllData() 
	{
		return new int[] {25,15,5};
	}
	
}



class DataServiceStub2 implements DataService
{

	@Override
	public int[] retrieveAllData() 
	{
		return new int[] {32};
	}
	
}

/*
 
 1. we will get null pointer exception becuase. We are not having data in ds.retrieveAllData() . So the exception taht we get is NullPointerException.
 
 2. So to avoid step null pointer exception....... what we will do is... we will create a Stub and pass it to SomeBuisnessImpl using the constructor.
 
 
 
 1. Stubs
------------------
1.1 Purpose:
 Stubs provide canned responses to calls made during the test. 
They are typically used when you need to simulate a component on which the system under test depends, 
providing predefined responses to specific calls.

1.2 Behavior: 
Stubs do not usually initiate calls to other parts of the system. They simply return a response when they are called, 
allowing the system under test to proceed with its operation.

1.3 Use Case:
Stubs are useful when you need to test the behavior of a system when it receives specific inputs from external systems or components. 
For example, stubbing a service that fetches weather data to return a fixed response so that you can test how your system behaves under specific weather conditions.

2. Mocks
----------------
2.1 Purpose:
Mocks are used to verify interactions between the system under test and its dependencies. 
They go a step further than stubs by not only providing responses but also verifying that they were called in the correct way.

2.2 Behavior:
 Mocks can be set up with expectations, specifying which methods should be called, with what arguments, and how many times. If the system under test does not meet these expectations, the test will fail.

2.3 Use Case:
 Mocks are useful for testing the behavior of a system in a more interactive way, where the focus is on how it uses its dependencies. For example, verifying that a method is called with specific parameters, ensuring that the system under test interacts with its dependencies correctly.

3. Summary
------------------
3.1 Stubs are about providing fake but valid responses to the system under test.
3.2 Mocks are about verifying the interactions between the system under test and its external dependencies.


 
 */