package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base {
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement account;
	@FindBy(xpath="//span[@class='nav-action-inner' and contains(text(),'Sign in')]")
	WebElement signIn;
	@FindBy(xpath="//input[@name='email']")
	public WebElement emaill;
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continuee;
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement passwordd;
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement signInButton;
	
	public LoginPage(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}       
	public void Verify(String email, String password) {
		Actions actions  = new Actions(driver);
		actions.moveToElement(account).perform();
		signIn.click();
		emaill.sendKeys(email);
		System.out.println("Username Entered");
		continuee.click();
		passwordd.sendKeys(password);
		System.out.println("Password Entered ");
		signInButton.click();
		System.out.println("User successfully loged in");	
	}
	
	


}
