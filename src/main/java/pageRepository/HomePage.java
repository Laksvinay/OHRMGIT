package pageRepository;

import org.openqa.selenium.By;
import businessFunctions.BaseClass;

public class HomePage extends BaseClass {
	//public static WebDriver driver=null;

	public static By linkWelcome=By.xpath("//*[@id=\"welcome\"]");
	
	public static By linkLogout=By.linkText("Logout");
	
	public static void clickWelcome()
	{
		driver.findElement(linkWelcome).click();
		
	}
	public static void clickLogout()
	{
		driver.findElement(linkLogout).click();
	}
}
