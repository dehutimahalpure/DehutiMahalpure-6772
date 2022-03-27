package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class divTest {

	@Test
	public void test()
	{
		div m= new div();
		int result=m.div(5,5);
		Assert.assertEquals(25,result);
	}

}
