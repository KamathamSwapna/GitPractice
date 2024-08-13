package base;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public Base() {
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream(
					// "C:\\Users\\kamatham.swapna\\eclipse_workspace2021\\SeleniumHackathon\\src\\main\\java\\com\\hcl\\base\\configure.properties");
					"C:\\Users\\lenovo\\Documents\\Automation Projects\\eclipse-workspace\\eclipse-workspace\\SeleniumAmz\\src\\main\\java\\base\\configure.properties");
			prop.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void launchBrowser() {
    		{
    			String browserName = prop.getProperty("browserName");

    			if (browserName.equalsIgnoreCase("chrome")) {
    				WebDriverManager.chromedriver().setup();
    				driver = new ChromeDriver();
    			} else if (browserName.equalsIgnoreCase("edge")) {
    				WebDriverManager.edgedriver().setup();
    				driver = new EdgeDriver();
    			} else if (browserName.equalsIgnoreCase("firefox")) {
    				WebDriverManager.firefoxdriver().setup();
    				driver = new FirefoxDriver();
    			} else if (browserName.equalsIgnoreCase("safari")) {
    				WebDriverManager.safaridriver().setup();
    				driver = new SafariDriver();
    			}
    		driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		driver.get(prop.getProperty("url"));
    		}
    		
    	}

	public void closeBrowser() {
		driver.quit();
	}

}
