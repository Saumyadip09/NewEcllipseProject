package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TooltipValidation {

	public static void main(String[] args) {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("56.0");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", false);
		 System.setProperty("webdriver.gecko.driver", "C:/Users/Saumyadip Dasgupta/Desktop/geckodriver-v0.18.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		String tooltip = driver.findElement(By.xpath("//li[@id='menu_documentation']")).getAttribute("title"); 
		System.out.println(tooltip);
		driver.close();

	}

}
