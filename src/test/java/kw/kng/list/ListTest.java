package kw.kng.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest 
{
	@Test
	void singleReturn()
	{
		List listMock= mock(List.class); //This has to be from `java.util` package not from `java.awt` package		
		when(listMock.size()).thenReturn(3);//when `listMock.size()` is called it must return the value as 3.

		assertEquals(3,listMock.size());
	}

	
	@Test
	void MultipleReturn()
	{
		List listMock= mock(List.class); //This has to be from `java.util` package not from `java.awt` package		
		when(listMock.size()).thenReturn(1).thenReturn(2);

		assertEquals(1,listMock.size());
		assertEquals(2,listMock.size());
	}
	
	@Test
	void specificParameters()
	{
		List listMock= mock(List.class); //This has to be from `java.util` package not from `java.awt` package		
		when(listMock.get(0)).thenReturn("Hello World");

		assertEquals("Hello World",listMock.get(0));
	}
	
	
	@Test
	void genericParameters()
	{
		List listMock= mock(List.class); //This has to be from `java.util` package not from `java.awt` package		
		when(listMock.get(Mockito.anyInt())).thenReturn("Hello World");

		assertEquals("Hello World",listMock.get(0));
		assertEquals("Hello World",listMock.get(1));
	}
	
}
