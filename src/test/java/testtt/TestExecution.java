package testtt;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.EmployeeId;


public class TestExecution {
	
	BaseClass launch;
	EmployeeId emp;
	@BeforeMethod
	public void launch() {
		launch = new BaseClass();
		launch.launchBrowser();
	}
	@Test(priority=0)
	public void testCase1() throws InterruptedException
	{
		emp = new EmployeeId();
		//System.out.println("Admin Clicked ");
		emp.admin();
	}
	
	
	/*@AfterMethod
	public void close() {
		launch = new BaseClass();
		launch.closeBrowser();
	}*/

}
