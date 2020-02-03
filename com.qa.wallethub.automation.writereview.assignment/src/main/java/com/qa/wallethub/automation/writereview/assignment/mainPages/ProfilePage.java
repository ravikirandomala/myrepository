package com.qa.wallethub.automation.writereview.assignment.mainPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wallethub.automation.writereview.assignment.utilities.BasePage;

public class ProfilePage extends BasePage {
	
	@FindBy(xpath="//div[@class='brgm-button brgm-user brgm-list-box']")
	WebElement ProfileLink;
	
	@FindBy(xpath="//div[@class='brgm-list brgm-user-list']/a[contains(text(),'Profile')]")
	WebElement ProfileBtn;
	
	@FindBy(xpath="//div[@class='rating-box-wrapper']")
	public WebElement Rating;
	
	public ProfilePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyReviewRatingfunctionality() {
		
		action.moveToElement(ProfileLink)
			.moveToElement(ProfileBtn)
			.click().perform();
	}
}
