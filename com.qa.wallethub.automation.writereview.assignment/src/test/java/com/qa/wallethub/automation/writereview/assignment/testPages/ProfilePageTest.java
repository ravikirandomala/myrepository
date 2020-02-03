package com.qa.wallethub.automation.writereview.assignment.testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfilePageTest extends BasePageTest {

	@Test(priority=1, description="Scenario to verify whether the given rating is updated in profile page")
	public void verifyReviewRatingfunctionalityTest() {
		
		landingPage.verifyWriteaReviewbuttonfunctionality();
		reviewSubmissionPage.verifyReviewSubmissionfunctionality();
		joinWalletHubPage.verifyLoginfunctionality();
		profilePage.verifyReviewRatingfunctionality();
		Assert.assertTrue(profilePage.Rating.isDisplayed());
	}
}
