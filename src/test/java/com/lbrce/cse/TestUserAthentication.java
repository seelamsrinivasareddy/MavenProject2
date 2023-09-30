package com.lbrce.cse;


import org.testng.Assert;
import org.testng.annotations.Test;



public class TestUserAthentication {
	@Test
	public void test1()
	{
		UserPasswordSpecificationCheck ml1=new UserPasswordSpecificationCheck();
		Assert.assertEquals(false,ml1.userValidation("", ""));
	}
	@Test
	public void test2()
	{
		UserPasswordSpecificationCheck ml1=new UserPasswordSpecificationCheck();
		Assert.assertEquals(false, ml1.userValidation("abc", "abc"));
	}
	@Test
	public void test3()
	{
		UserPasswordSpecificationCheck ml1=new UserPasswordSpecificationCheck();
		Assert.assertEquals(true, ml1.userValidation("srinu", "12345"));
	}
	@Test
	public void test4()
	{
		UserPasswordSpecificationCheck ml1=new UserPasswordSpecificationCheck();
		Assert.assertEquals(false, ml1.userValidation("SRINU", "12345"));
	}

}
