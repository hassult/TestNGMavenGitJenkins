package org.edu.tech.testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class BasicTestNGTest {
	
	@Test
	public void test(){
		Assert.assertEquals(2+3, 5);
	}
	
	@Test
	public void test2(){
		Assert.assertEquals(2*3, 6);
	}

	@Test
	public void test3(){
		Assert.assertEquals(true, true);
	}

}
