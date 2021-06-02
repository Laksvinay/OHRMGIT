package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1Class {
	
	@BeforeMethod
	public void beforemeth()
	{
		System.out.println("before method is executed");
	}
	@AfterMethod
	public void aftermetgh()
	{
		System.out.println("after each method is executed");
	}
	@BeforeSuite
	public void BeforeSuit()
	{
		System.out.println("before suite is executed");
	}
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("after suite is execited");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before the test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after the test");
	}
	
	@Test (groups={"smoke","regression"})
	
	public void test1()
	{
		System.out.println("tests1 is executed");
	}
	@Test (groups= {"regression"})
	public void tets2()
	{
		System.out.println("tests2 is executed");
	}
}
