package pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class SearchAppleLaptop extends Base {
//	@FindBy(xpath = "//*[@id='nav-hamburger-menu']")
	//WebElement menu;
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	WebElement menu;
	@FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[15]/a")
	WebElement computers;
	@FindBy(xpath = "//*[@id='hmenu-content']/ul[8]/li[17]/a")
	WebElement laptops;
	@FindBy(xpath = "//span[@class='a-size-base a-color-base' and contains(text(),'Apple')]")
	WebElement checkApple;
	@FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal' and contains(text(),'2020 Apple MacBook Air (13.3-inch/33.78 cm, Apple M1 chip with 8-core CPU and 7-core GPU, 8GB RAM, 256GB SSD) - Space Grey')]")
	WebElement selectApple;
	@FindBy(xpath="//input[@id='add-to-cart-button' and @name='submit.add-to-cart']")
//	@FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
	WebElement addCart;
	
	public void SearchAppleLaptop() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	public void SelectAppleLaptop() {
		menu.click();
		computers.click();
		laptops.click();
		checkApple.click();
		selectApple.click();
		System.out.println("Apple laptop is clicked");
			
	}

	public void cart() throws InterruptedException {

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				 Thread.sleep(5000);
				System.out.println(driver.switchTo().window(child_window).getTitle());

				
			}

		}
		// switch to the parent window
		//driver.switchTo().window(parent);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button' and @name='submit.add-to-cart']")));
		addCart.click();
		// driver.findElement(By.name("submit.add-to-cart")).click();
		// driver.findElement(By.id("submit.add-to-cart-announce")).click();
		// driver.findElement(By.xpath(".//input[@id='add-to-cart-button']")).click();
		System.out.println("Apple loptop is added to cart");

	}

	public void cartDetails() {
		driver.findElement(By.id("nav-cart")).click();
		// driver.findElement(By.className("nav-cart-icon nav-sprite")).click();

		 //viewCart.click();
		System.out.println("Cart is Viewed");
	}



}
