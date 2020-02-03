package com.qa.wallethub.automation.assignment.facebook.testPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.wallethub.automation.assignment.facebook.Utilities.testBase;
import com.qa.wallethub.automation.assignment.facebook.mainPages.FBHomePage;
import com.qa.wallethub.automation.assignment.facebook.mainPages.LoginPage;

public class LoginPageTest extends testBase {
	
	LoginPage loginPage;
	FBHomePage fbhomePage;
	
	public LoginPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initializeDriver();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1, description="Scenario to verify whether the user is landed on the FB Login page")
	public void verifyLogingPageUIElementsTest() {
		
		boolean flag = loginPage.verifyLogingPageUIElements();
		Assert.assertTrue(flag);
	}

	@Test(priority=2, description="Scenario to verify whether the correct title is returned")
	public void verifyFBLoginPageTitleTest() {
		
		String title = loginPage.verifyFBLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test(priority=3, description="Scenario to verify whether the Login functionality is successful")
	public void verifyLoginfunctionalityTest() {
		
		fbhomePage = loginPage.verifyLoginfunctionality(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(loginPage.ProfileBtn.isDisplayed());
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();	
	}	
}
