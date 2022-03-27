package Junit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class sumTest {

	@Test
	public void test()
	{
		
		sum s=new sum();
		int result=s.sum(5, 5);
		Assert.assertEquals(10,result);
	}

}
