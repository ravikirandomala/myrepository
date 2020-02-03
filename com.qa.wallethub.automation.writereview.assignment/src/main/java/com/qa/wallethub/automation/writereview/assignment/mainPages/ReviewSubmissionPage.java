package com.qa.wallethub.automation.writereview.assignment.mainPages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.wallethub.automation.writereview.assignment.utilities.BasePage;
import com.qa.wallethub.automation.writereview.assignment.utilities.testUtilities;

public class ReviewSubmissionPage extends BasePage {
	
	@FindBy(css="#reviews-section > modal-dialog > div > div > write-review > review-star > div > svg:nth-child(1) > g")
	WebElement StarsBtn1;
	
	@FindBy(css="#reviews-section > modal-dialog > div > div > write-review > review-star > div > svg:nth-child(2) > g")
	WebElement StarsBtn2;
	
	@FindBy(css="#reviews-section > modal-dialog > div > div > write-review > review-star > div > svg:nth-child(3) > g")
	WebElement StarsBtn3;
	
	@FindBy(css="#reviews-section > modal-dialog > div > div > write-review > review-star > div > svg:nth-child(4) > g")
	WebElement StarsBtn4;
	
	@FindBy(xpath="//*[contains(text(),'Select...')]")
	WebElement PolicyDropdown;
	
	@FindBy(xpath="//textarea[@placeholder='Write your review...']")
	WebElement WriteReviewTxtbox;
	
	@FindBy(xpath="//*[@class='sbn-action semi-bold-font btn fixed-w-c tall']")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//li[contains(text(),'Health Insurance')]")
	WebElement PolicyType;
	
	@FindBy(xpath="//h2")
	public WebElement Confirmationmsg;
	
	public ReviewSubmissionPage() {
		
		PageFactory.initElements(driver, this);
	}
		
	public JoinWalletHubPage verifyReviewSubmissionfunctionality() {
		
		action.moveToElement(StarsBtn1)
			.moveToElement(StarsBtn2)
			.moveToElement(StarsBtn3)
			.moveToElement(StarsBtn4)
			.click()
			.perform();
		
		PolicyDropdown.click();
		action.moveToElement(PolicyType)
			.click()
			.perform();		
		
		String randomString = RandomStringUtils.random(testUtilities.STRING_LENGTH, "a-zA-Z0-9 ");
		WriteReviewTxtbox.sendKeys(randomString);
		
		SubmitBtn.click();
		return new JoinWalletHubPage();
	}
}
