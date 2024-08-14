package base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties properties;

	public BaseClass() {

		try {
			properties = new Properties();
			FileInputStream fileInputStream = new FileInputStream(
					"C:\\Users\\user\\eclipse-workspace\\EmployeeManagement\\src\\main\\java\\base\\configure.properties");
			properties.load(fileInputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void launchBrowser() {

	    WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}

	public static void closeBrowser() {
		driver.close();
	}

}
