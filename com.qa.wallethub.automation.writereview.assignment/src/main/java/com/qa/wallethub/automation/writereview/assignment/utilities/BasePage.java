package com.qa.wallethub.automation.writereview.assignment.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public static Actions action;
	
	public BasePage() {
		
		try {
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
					"\\src\\main\\java\\com\\qa\\wallethub\\automation\\writereview\\assignment\\config\\config.Properties");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
	}
	
	public static void Initialization() {
		
		String browsername = prop.getProperty("Browser");
		
		if(browsername.equals("FireFox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browsername.equals("safari")) {
			
			driver = new SafariDriver();
		}
		else {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testUtilities.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testUtilities.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
		
		action = new Actions(driver);
	}
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickableElement(WebDriver driver, WebElement element, int timeout) {
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click(); 	
	}

}
