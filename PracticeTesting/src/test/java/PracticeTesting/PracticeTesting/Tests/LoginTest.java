package PracticeTesting.PracticeTesting.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PracticeTesting.PracticeTesting.LoginPage;



public class LoginTest {
	@Test
	public void LoginErrorValidation() throws IOException, InterruptedException
	{
		//create object for page object & send driver as argument as it will give life to driver object
		LoginPage loginpage=new LoginPage(null);
		
	
	}

}
