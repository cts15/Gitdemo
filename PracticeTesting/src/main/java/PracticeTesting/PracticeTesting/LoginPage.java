package PracticeTesting.PracticeTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver)
	{
		super();
		this.driver=driver;
		//this.driver refers to local driver
		PageFactory.initElements(driver, this); //to intialize elements using driver
	}
	//PageFactory design pattern
		@FindBy(name="uid")
		WebElement username;
		
		@FindBy(name="password")
		WebElement passwordelement;
		
		@FindBy(name = "btnLogin")
		WebElement login;
		public void Login(String email,String password)
		{
			username.sendKeys(email);
			passwordelement.sendKeys(password);
			login.click();
		}
		public void goTo()
		{
			driver.get("http://www.demo.guru99.com/V4/");
		}
}
