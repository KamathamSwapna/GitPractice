package testt;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import data.LoginPageData;
import pages.LoginPage;
import pages.SearchAppleLaptop;
import pages.SearchHPLaptop;

public class TestExecution {
	
	Base launch;
	LoginPage login;
	LoginPageData signin;
	SearchHPLaptop hp;
	SearchAppleLaptop apple;

	@BeforeMethod
	public void launch() {
		launch = new Base();
		launch.launchBrowser();
	}

	@Test(priority = 0, enabled = true)
	public void verifyLogin() {
		signin = new LoginPageData();
		login = new LoginPage();
		login.Verify(signin.getEmail(), signin.getPassword());
	}

	@Test(priority = 1, enabled = true)
	public void shopHPLaptop() {
		signin = new LoginPageData();
		login = new LoginPage();
		login.Verify(signin.getEmail(), signin.getPassword());
		hp = new SearchHPLaptop();
		hp.SearchHPLaptop();
		hp.SelectLaptop();
	}

	@Test(priority = 2, enabled = true)
	public void selectHPLaptopToCart() throws InterruptedException {
		signin = new LoginPageData();
		login = new LoginPage();
		login.Verify(signin.getEmail(), signin.getPassword());
		hp = new SearchHPLaptop();
		hp.SearchHPLaptop();
		hp.SelectLaptop();
		hp.addCart();
	}
	/*
	 * @Test(priority = 3, enabled = true) public void addHPLaptopToCart() throws
	 * InterruptedException { signin = new LoginPageData(); login = new LoginPage();
	 * login.Verify(signin.getEmail(), signin.getPassword()); hp = new
	 * SearchHPLaptop(); hp.SearchHPLaptop(); hp.SelectLaptop(); hp.addCart(); }
	 */

	/*
	 * @Test(priority = 4, enabled = true) public void viewCart() { signin = new
	 * LoginPageData(); login = new LoginPage(); login.Verify(signin.getEmail(),
	 * signin.getPassword()); hp = new SearchHPLaptop(); hp.viewCart(); }
	 */

	@Test(priority = 3, enabled = true)
	public void searchAppleLaptop() {
		signin = new LoginPageData();
		login = new LoginPage();
		login.Verify(signin.getEmail(), signin.getPassword());
		apple = new SearchAppleLaptop();
		apple.SearchAppleLaptop();
		apple.SelectAppleLaptop();

	}

	@Test(priority = 4, enabled = true)
	public void addAppleLaptopToCart() throws InterruptedException {
		signin = new LoginPageData();
		login = new LoginPage();
		login.Verify(signin.getEmail(), signin.getPassword());
		apple = new SearchAppleLaptop();
		apple.SearchAppleLaptop();
		apple.SelectAppleLaptop();
		apple.cart();
	}

	@Test(priority = 5, enabled = true)
	public void viewCartDetails() throws InterruptedException {
		signin = new LoginPageData();
		login = new LoginPage();
		login.Verify(signin.getEmail(), signin.getPassword());
		apple = new SearchAppleLaptop();
		apple.SearchAppleLaptop();
		apple.cartDetails();

	}

	

}
