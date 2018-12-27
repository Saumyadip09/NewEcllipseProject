package com.selenium.scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	//public static WebDriver driver;
		public static void screenshot(String filename,WebDriver driver) throws IOException
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			//String destination = "C:\\Back Up\\Elements Naveen\\src\\com\\capture\\screenshot";
			//FileUtils.copyFile(src,new File("C:\\Back Up\\Elements Naveen\\src\\com\\capture\\screenshot"+Filename+".png"));
			  FileUtils.copyFile(src,new File("C:\\Back Up\\Elements Naveen\\src\\com\\capture\\screenshot"+filename+".png"));
			
		}


}
