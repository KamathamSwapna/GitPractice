package utils;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import base.BaseClass;

public class TakeScreenShot extends BaseClass {
	
	public static void takeScreenshotOnFailure(String methodname){
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\Users\\user\\eclipse-workspace\\EmployeeManagement\\Screenshots\\Failed testcases"+ methodname+".png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
	}



}
