package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TooltipChromeDriver {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Saumyadip Dasgupta/Desktop/geckodriver-v0.18.0-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.seleniumhq.org/");
			String tooltip = driver.findElement(By.xpath("//li[@id='menu_documentation']/a")).getAttribute("title"); 
			Thread.sleep(3000);
			System.out.println(tooltip);
			System.out.println("Hello");
			driver.close();
	
	
	}

}
