package com.qa.wallethub.automation.writereview.assignment.mainPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wallethub.automation.writereview.assignment.utilities.BasePage;

public class JoinWalletHubPage extends BasePage {
	
	@FindBy(xpath="//*[@id=\"join-light\"]//li[2]/a")
	WebElement LoginLink;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement EmailTxt;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement PasswordTxt;
	
	@FindBy(xpath="//div[@class='btns']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[@class='brgm-button brgm-user brgm-list-box']")
	public WebElement ProfileLink;
	
	public JoinWalletHubPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public ProfilePage verifyLoginfunctionality() {
		
		LoginLink.click();
		EmailTxt.sendKeys(prop.getProperty("Email"));
		PasswordTxt.sendKeys(prop.getProperty("Password"));
		LoginBtn.click();
		
		return new ProfilePage();
	}

}
