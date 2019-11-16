package com.invisalignstaging.qa.Basepage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.invisalignstaging.qa.testUtil.TestUtilities;

public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BasePage() {
		
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\SwathiKiran\\eclipse-workspace\\InvisalignstagingAutomation\\src\\main"
			+"\\java\\com\\invisalignstaging\\qa\\config\\config.properties");
			prop.load(ip);
			
		} catch (IOException e) {
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void Initialization() {
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("FireFox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\selenium-3.141.59\\geckodriver.exe");
			FirefoxOptions Options = new FirefoxOptions(); 
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("network.cookie.cookieBehavior",1);
//			Options.setProfile(profile);
			Options.addPreference("dom.webnotifications.enabled", false);
			Options.addPreference("geo.location.enabled", false);
			driver = new FirefoxDriver(Options);
		} else {
			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium-3.141.59\\chromedriver.exe");
			ChromeOptions Options = new ChromeOptions();
			Options.setCapability("disable-restore-session-state", false);
			driver = new ChromeDriver(Options);	
		}
	
	driver.manage().deleteAllCookies();	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));	
	}	
	
}
