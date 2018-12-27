package com.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Saumyadip Dasgupta/Desktop/geckodriver-v0.18.0-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.seleniumhq.org/");
		

	}

}
