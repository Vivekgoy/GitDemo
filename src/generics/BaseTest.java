package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest implements ConstantItems {
	
	public WebDriver driver;
	@BeforeTest
	public void OpenApp(){
		System.setProperty(chrome_SilentKey, chrome_SilentValue);
		System.setProperty(chrome_Key, chrome_Value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterTest
	public void closeApp(){
		driver.close();
	}

}
