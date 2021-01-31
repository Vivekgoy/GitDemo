package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeLoginPage;

public class ActitimeLoginTest extends BaseTest{

	@Test
	public void login() throws Exception{
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
	   System.out.println("Hello");
	}
}
