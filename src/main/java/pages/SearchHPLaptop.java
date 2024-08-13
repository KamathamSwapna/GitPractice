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

public class SearchHPLaptop extends Base{
	
	//@FindBy(xpath = "//*[@id='nav-hamburger-menu']")
		//WebElement menu;
		@FindBy(xpath="//a[@id='nav-hamburger-menu']")
		WebElement menu;
		@FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[15]/a")
		WebElement computers;
		@FindBy(xpath = "//*[@id='hmenu-content']/ul[8]/li[17]/a")
		WebElement laptops;
		@FindBy(xpath = "//*[@id='s-refinements']/div[4]/ul/li[1]/span/a")
		WebElement checkHP;
		@FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal' and contains(text(),'HP 15 (2021) Thin & Light Ryzen 3-3250 Laptop, 8 GB RAM, 1TB HDD, 39.62 cms (15.6\") FHD Screen, Windows 10, MS Office (15s-gr0011AU)')]")
		WebElement selectLaptop;
		@FindBy(xpath="//input[@id='add-to-cart-button' and @name='submit.add-to-cart']")
		//@FindBy(xpath = "//*[@id='add-to-cart-button']")
		WebElement cart;

		public void SearchHPLaptop() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			PageFactory.initElements(driver, this);
		}

		public void SelectLaptop() {
			menu.click();
			computers.click();
			laptops.click();
			checkHP.click();
			selectLaptop.click();
			System.out.println("User succesfully clicked the Laptop");
		}

		public void addCart() throws InterruptedException {
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
			      cart.click();
			//driver.findElement(By.id("add-to-cart-button")).click();
			System.out.println("Laptop is successfully added to cart");

		}

		public void viewCart() {
			driver.findElement(By.id("nav-cart")).click();
			System.out.println("Cart Details");
		}



	

}
