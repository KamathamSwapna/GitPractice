package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kamatham.swapna\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("opencart");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[2]/div[3]/div/ul[1]/li[1]/h3/a")).click();

	}


	

}
