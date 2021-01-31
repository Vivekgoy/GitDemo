package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class ActitimeLoginPage {
	
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(css="input[name='pwd']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="loginRecoveryLinkContainer")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public WebDriver driver;
	public ActitimeLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws Exception{
		usernameTextField.sendKeys(ExcelLibrary.getData(1, 0));
		passwordTextField.sendKeys(ExcelLibrary.getData(1, 1));
		keepmeloggedinCheckbox.click();
		loginButton.click();
	 
	}
	
	public void forgotyourpasswordMethod(){
		forgotyourpasswordLink.click();
	}
	
	public void actitimeincMethod(){
		actitimeincLink.click();
	}
	

}
