package com.selenium.scripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ScreenshotusingScreenshotUtility {
	
public static WebDriver driver;
	
	public static void screenshot1(String filename) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:/Back Up/SeleniumAdvance/src/main/java/com/selenium/screenshots"+filename+".png"));
	}

	public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saumyadip Dasgupta\\Desktop\\geckodriver-v0.18.0-win64\\geckodriver.exe") ;
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		//String screenshotName = "facebookchecks";
		screenshot1("facebookchecks");
		//ScreenshotUtility.screenshot("facebooklogin",driver);
		driver.close();

	}

}
