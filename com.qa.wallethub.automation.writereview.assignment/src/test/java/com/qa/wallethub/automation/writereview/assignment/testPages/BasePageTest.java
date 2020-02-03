package com.qa.wallethub.automation.writereview.assignment.testPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.wallethub.automation.writereview.assignment.mainPages.JoinWalletHubPage;
import com.qa.wallethub.automation.writereview.assignment.mainPages.LandingPage;
import com.qa.wallethub.automation.writereview.assignment.mainPages.ProfilePage;
import com.qa.wallethub.automation.writereview.assignment.mainPages.ReviewSubmissionPage;
import com.qa.wallethub.automation.writereview.assignment.utilities.BasePage;

public class BasePageTest extends BasePage {
	
	LandingPage landingPage;
	ReviewSubmissionPage reviewSubmissionPage;
	JoinWalletHubPage joinWalletHubPage;
	ProfilePage profilePage;
	
	public BasePageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		Initialization();
		landingPage = new LandingPage();
		reviewSubmissionPage = new ReviewSubmissionPage();
		joinWalletHubPage = new JoinWalletHubPage();
		profilePage = new ProfilePage();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}
}
