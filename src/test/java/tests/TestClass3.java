package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass3 {
	@DataProvider(name="testdata")
	public Object[][] dataprovidefunction()
	{
		return new Object[][] {{"Lakshmi"},{"Deeps"},{"Dhwani"}};
	}
	
	
	@Test(dataProvider="testdata")
	public void test3(String names)
	{
		System.out.println("test3 executed");
		System.out.println(names);
	}

}
