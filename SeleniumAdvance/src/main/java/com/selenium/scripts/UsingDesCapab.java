package com.selenium.scripts;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UsingDesCapab {

	public static void main(String[] args) {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//FirefoxOptions capabilities = new FirefoxOptions();
		//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("61.0.1");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", false);
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saumyadip Dasgupta\\Desktop\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(capabilities);
		

	}

}
