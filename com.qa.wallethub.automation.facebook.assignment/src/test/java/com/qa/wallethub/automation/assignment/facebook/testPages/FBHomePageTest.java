package com.qa.wallethub.automation.assignment.facebook.testPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.wallethub.automation.assignment.facebook.Utilities.testBase;
import com.qa.wallethub.automation.assignment.facebook.mainPages.FBHomePage;
import com.qa.wallethub.automation.assignment.facebook.mainPages.LoginPage;

public class FBHomePageTest extends testBase {
	
	LoginPage loginPage;
	FBHomePage fbHomePage;
	
	public FBHomePageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initializeDriver();
		loginPage = new LoginPage();
		fbHomePage = new FBHomePage();		
	}
	
	@Test(priority=1, description="Scenario to verify whether the logged in user is able to post a message successfully")
	public void verifyCreatePostfunctionalityTest() throws InterruptedException {
		
		loginPage.verifyLoginfunctionality(prop.getProperty("username"), prop.getProperty("password"));
		fbHomePage.verifyCreatePostfunctionality();
		Thread.sleep(5000);
		String post = fbHomePage.postedText.getText();
		Assert.assertEquals(post, "Hello World");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
}
