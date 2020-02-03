package com.qa.wallethub.automation.assignment.facebook.mainPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wallethub.automation.assignment.facebook.Utilities.testBase;

public class LoginPage extends testBase {
		
//	@FindBy(xpath="//input[@type='email']")
	@FindBy(id="email")
	WebElement username;
	
//	@FindBy(xpath="//input[@type='password']")
	@FindBy(id="pass")
	WebElement password;
	
//	@FindBy(xpath="//input[@type='submit']")
	@FindBy(id="loginbutton")
	WebElement LoginBtn;
	
	@FindBy(linkText="Facebook")
	WebElement FBLogo;
	
	@FindBy(xpath="//*[@title='Profile']")
	public WebElement ProfileBtn;
	
	@FindBy(linkText="Home")
	public WebElement HomeBtn;
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyLogingPageUIElements() {
		
		return FBLogo.isDisplayed();
	}
	
	public String verifyFBLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public FBHomePage verifyLoginfunctionality(String user, String pass) {
		
		//Using Explicit wait method declared in testBase class to wait until the elements are located
		testBase.sendKeys(driver, username, 5, user);
		testBase.sendKeys(driver, password, 5, pass);
		testBase.clickElement(driver, LoginBtn, 5);

		return new FBHomePage();
		
	}

}
