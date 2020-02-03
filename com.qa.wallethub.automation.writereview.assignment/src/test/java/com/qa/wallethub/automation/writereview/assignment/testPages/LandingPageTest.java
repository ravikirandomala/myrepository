package com.qa.wallethub.automation.writereview.assignment.testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest extends BasePageTest {
		
	@Test(priority=1, description="Scenario to verify whether the user is landed on correct page by verifying the title")
	public void verifyLandingPageTest() {
		
		String title = landingPage.verifyLandingPage();
		System.out.println(title);
		String modifiedreviews = landingPage.ReviewsCount.getText().replaceAll("[^0-9,]", "");
		System.out.println(modifiedreviews);
		Assert.assertEquals(title, "Test Insurance Company Reviews: "+modifiedreviews+" User Ratings");//Test Insurance Company Reviews: 2,463 User Ratings
	}
	
	@Test(priority=2, description="Scenario to verify whether the user is navigated to the Review Submission page on selecting Write a Review button")
	public void verifyWriteaReviewbuttonfunctionalityTest() {
		
		reviewSubmissionPage = landingPage.verifyWriteaReviewbuttonfunctionality();
		Assert.assertTrue(landingPage.ReviewSubmissionpageheader.isDisplayed());
	}

}
