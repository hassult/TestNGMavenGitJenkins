package org.edu.tech.testngtests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class BasicTestNGTest {
	
	@Test
	public void test(){
		Assert.assertEquals(2+3, 5);
	}
	
	@Test
	public void test2(){
		Assert.assertEquals(2*3, 6);
	}

}
