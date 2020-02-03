package com.qa.wallethub.automation.writereview.assignment.mainPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wallethub.automation.writereview.assignment.utilities.BasePage;

public class LandingPage extends BasePage {
	
	@FindBy(xpath="//button[@class='btn blue-brds']")
	WebElement WriteReviewButton;
	
	@FindBy(xpath="//h4[contains(text(),'Test Insurance Company')]")
	public WebElement ReviewSubmissionpageheader;
	
	@FindBy(xpath="//span[@class='review']")
	public WebElement ReviewsCount;
		
	public LandingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLandingPage() {
		
		return driver.getTitle();		
	}
	
	public ReviewSubmissionPage verifyWriteaReviewbuttonfunctionality() {
		
		WriteReviewButton.click();
		return new ReviewSubmissionPage();
	}

}
