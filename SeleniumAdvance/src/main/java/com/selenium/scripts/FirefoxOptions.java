package com.selenium.scripts;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxOptions {

	public static void main(String[] args) {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		//FirefoxOptions capabilities = new FirefoxOptions();
		//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		 capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("61.0.1");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", false);
		 
		 WebDriver driver = new FirefoxDriver();

	}

}
