package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class mulTest {

	@Test
	public void test() 
	{
		mul m= new mul();
		int result=m.mul(5,5);
		Assert.assertEquals(25,result);
	}

}
