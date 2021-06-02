package businessFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;



public  class BaseClass {
	public static WebDriver driver;
	
	public static void openBrowser()
	{
		
		//WebDriverManager.firefoxdriver().setup();
	//WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com");
}
	public static void closeBrowser()
	{
		driver.close();
		driver.quit();
	}
}
