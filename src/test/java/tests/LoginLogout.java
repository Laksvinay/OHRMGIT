package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import businessFunctions.BaseClass;
import businessFunctions.LoginLogoutFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageRepository.HomePage;
import pageRepository.LoginPage;

public class LoginLogout extends BaseClass {

	/*static WebDriver driver=null;
	
	public static By txtUserName=By.id("txtUsername");
	public static By txtPassword=By.id("txtPassword");
	public static By btnLogin=By.name("Submit");
	
	
	public staic void enteruserName()
	{
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public static void enterPassword()
	{
		driver.findElement(By.id("txtPassword")).sendKeys(" admin123");
	}
	
	//-------------------------------------------------------------
	*/
	public static void main(String s[])
	{
		
		BaseClass.openBrowser();
		//WebDriver driver;
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
        //driver.manage().window().maximize();
       // driver.get("https://opensource-demo.orangehrmlive.com");
      //===========================================================================================
		/*LoginPage.enteruserName();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        LoginPage.enterPassword();
        LoginPage.clickLogout();*/
		LoginLogoutFunctions.login();
		
      //  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//WebElement logoutlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txtPassword\"]")));
		//logoutlink.click();

		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[10]/ul/li[3]/a"));
	/*	HomePage.clickWelcome();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		HomePage.clickLogout();*/
		LoginLogoutFunctions.logout();
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	driver.close();
		//driver.quit();
		//BaseClass.closeBrowser();
		System.out.println("Logged out");

	} }


