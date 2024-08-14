package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class EmployeeId extends BaseClass {
	//@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-edgeStart MuiIconButton-sizeMedium css-wl7902-MuiButtonBase-root-MuiIconButton-root']")
	// @FindBy(xpath="//*[@id='root']/div/header/div/button/svg")
	// @FindBy(xpath="//*[@id='root']/div/header/div/button")
	// @FindBy(xpath="//*[@id='root']/div/header/div/button/span")
	//WebElement button = driver.find_element_by_xpath("//button[@aria-level='open drawer']") 
	//@FindBy(xpath="//button[@aria-label='open drawer']")
	@FindBy(xpath="//button[@aria-label='open drawer']//*[name()='svg']")
	WebElement home;
	@FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-khxyyy-MuiTypography-root' and contains(text(),'Admin')]")
	WebElement adminn;
	@FindBy(xpath = "//span[contains(text(),'Generate Id')]")
	WebElement genId;
	@FindBy(xpath="//input[@id=':r1:']")
	WebElement firstName;
	@FindBy(xpath="//input[@id=':r3:']")
	WebElement middleName;
	@FindBy(xpath="//textarea[@id=':r5:']")
	WebElement lastName;
	@FindBy(xpath="//div[@id='gender']")
	WebElement gender;
	@FindBy(xpath="//textarea[@id=':r7:']")
	WebElement offEmail;
	@FindBy(xpath="//div[@id='practiceunit']")
	WebElement pracUnit;
	@FindBy(xpath="//input[@id=':r9:']")
	WebElement desgn;
	@FindBy(xpath="//input[@id=':rb:']")
	WebElement workLoc;
	@FindBy(xpath="//input[@id=':rd:']")
	WebElement dateJoin;
	@FindBy(xpath="//*[@id=\'root\']/div/main/div[2]/div[2]/div/div/form/div[1]/div[10]/div/div/label[1]/span[1]/input")
	WebElement permanent;
	@FindBy(xpath="//*[@id=\'root\']/div/main/div[2]/div[2]/div/div/form/div[1]/div[10]/div/div/label[2]/span[1]/input")
	WebElement contract;
	@FindBy(xpath="//*[@id=\'root\']/div/main/div[2]/div[2]/div/div/form/div[2]/div[1]/button")
	WebElement reset;
	@FindBy(xpath="//*[@id=\'root\']/div/main/div[2]/div[2]/div/div/form/div[2]/div[2]/button")
	WebElement generateIdButton;
	
	
	

	public void EmployeeId() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	public void admin() throws InterruptedException {
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		// Actions act = new Actions(driver);
		// act.moveToElement(home).click().build().perform();
		home.click();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();", home);
		Thread.sleep(1000);
		adminn.click();
		genId.click();
		

	}

	public void getId() {
		

	}

}
