package PracticeTesting.PracticeTesting.TestComponents;

import java.io.IOException;
import java.time.Duration;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import PracticeTesting.PracticeTesting.LoginPage;


public class BaseTest {
public WebDriver driver;
	
	public WebDriver intializeDriver() throws IOException
	{
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 return driver;
	}
	@BeforeMethod
	public LoginPage ValidlaunchApplication() throws IOException
	{
		driver = intializeDriver();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.goTo();
		loginpage.Login("mngr526587", "gEqYneq");		
		return loginpage;
	}
}
