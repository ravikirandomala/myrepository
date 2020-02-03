package com.qa.wallethub.automation.writereview.assignment.testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinWalletHubPageTest extends BasePageTest {
		
	@Test(priority=1,description="Scenario to verify whether the user is navigated to profile page after successful login")
	public void verifyLoginfunctionalityTest() throws InterruptedException {
		
		landingPage.verifyWriteaReviewbuttonfunctionality();
		reviewSubmissionPage.verifyReviewSubmissionfunctionality();
		joinWalletHubPage.verifyLoginfunctionality();
		Assert.assertTrue(joinWalletHubPage.ProfileLink.isDisplayed());
	}
}
