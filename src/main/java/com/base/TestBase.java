package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.utill.TestUtill;
import com.utill.WebEventListener;

public class TestBase {
	public static TestUtill utils;
	public static WebDriver driver;
	public static Properties prop;
	public static int click = 5;
	public static EventFiringWebDriver eventFiring;
	public static WebEventListener eventListener;
	
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/khosuzzaman/MyTest/"
					+ "AutomationSuitOfIndex/src/main/"
					+ "java/com/configuration/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/khosuzzaman/MyTest/AutomationSuitOfIndex/chromedriver"); 
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "/Users/khosruzzaman/MyTest/AutomationSuitOfIndex/geckodriver");
			driver = new FirefoxDriver();
		}else {
			driver = new SafariDriver();
		}
		
		eventFiring = new EventFiringWebDriver(driver);
		
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
	
		eventFiring.register(eventListener);
		driver = eventFiring;
		
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOADE_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICITLY_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
