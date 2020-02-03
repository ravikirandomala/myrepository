package com.qa.wallethub.automation.writereview.assignment.testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewSubmissionPageTest extends BasePageTest {
	
	@Test(priority=1, description="Scenario to verify whether the user is navigated to Join WalletHub page on successful submission of a review")
	public void verifyReviewSubmissionfunctionalityTest() throws InterruptedException {
		
		landingPage.verifyWriteaReviewbuttonfunctionality();
		joinWalletHubPage = reviewSubmissionPage.verifyReviewSubmissionfunctionality();
		Thread.sleep(3000);
		Assert.assertEquals(reviewSubmissionPage.Confirmationmsg.getText(), "Login or sign up so we can post your review.");		
	}
}
