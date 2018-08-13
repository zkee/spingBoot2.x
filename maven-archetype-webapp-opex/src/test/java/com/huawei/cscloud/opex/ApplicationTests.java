package com.huawei.cscloud.opex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
		TestCase.assertEquals(1, 1);
	}
	
	@Test
	public void test2()
	{
		TestCase.assertEquals(0, 0);
	}
	
	@Before
	public void testBefore()
	{
		System.out.println("before test!");
	}
	
	@After
	public void testAfter()
	{
		System.out.println("after test!");
	}

}
