package com.qa.wallethub.automation.assignment.facebook.mainPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wallethub.automation.assignment.facebook.Utilities.testBase;
import com.qa.wallethub.automation.assignment.facebook.Utilities.testUtilities;

public class FBHomePage extends testBase {
	
	@FindBy(name="xhpc_message")
	WebElement PostTxt;		
	
	@FindBy(xpath="//button[@data-testid='react-composer-post-button']")
	WebElement PostButton;
	
	@FindBy(xpath="//div[@class='_5_jv _58jw']")
	public WebElement postedText;
	
	public FBHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCreatePostfunctionality() {
		
		testBase.clickElement(driver, PostTxt, testUtilities.ELEMENT_WAIT_TIME);
		testBase.sendKeys(driver,PostTxt,testUtilities.ELEMENT_WAIT_TIME,prop.getProperty("Message"));
		PostButton.click();
	}
}
