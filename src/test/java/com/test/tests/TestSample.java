package com.test.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSample {
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Assert.assertFalse(false);
	}

}
