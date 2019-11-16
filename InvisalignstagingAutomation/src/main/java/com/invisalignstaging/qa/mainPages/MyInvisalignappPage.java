package com.invisalignstaging.qa.mainPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.invisalignstaging.qa.Basepage.BasePage;

public class MyInvisalignappPage extends BasePage {
	
	@FindBy(xpath="//*[@class='slogan slogan-black hidden-xs']")
	WebElement Madetomovelink;
	
	@FindBy(xpath="//div[@id='logo']")
	WebElement invisalignlogo;
	
	@FindBy(xpath="//*[@alt='Appstoe']")
	WebElement AppleStorelink;
	
	@FindBy(xpath="//*[@id='playstore']")
	WebElement GooglePlayStorelink;
	
	public MyInvisalignappPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyinvisalignTitle() {
		
//		driver.switchTo().window((driver.getWindowHandle()));
		driver.switchTo().window("2147483652");
		return driver.getTitle();
	}
	
	public boolean verifyinvisalignlogo() {
		
		
//		driver.switchTo().window((driver.getWindowHandle()));
		driver.switchTo().window("2147483652");
		return invisalignlogo.isDisplayed();		
	}
	
	public ForPatientsPage verifymadetomovelink() {
		
		driver.switchTo().window("2147483652");
		Madetomovelink.click();
		return new ForPatientsPage();
	}
	
	public AppStorePage verifyAppleStorelink() {
		
		driver.switchTo().window("2147483652");
		AppleStorelink.click();
		return new AppStorePage();
	}
	
	public GooglePlayStorePage verifyGooglePlayStorelink() {
		
		driver.switchTo().window("2147483652");
		GooglePlayStorelink.click();
		return new GooglePlayStorePage();
	}
	

}
