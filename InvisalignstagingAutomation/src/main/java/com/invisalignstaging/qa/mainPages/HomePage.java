package com.invisalignstaging.qa.mainPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.invisalignstaging.qa.Basepage.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(id="logo")
	WebElement Logo;
	
	@FindBy(xpath="//*[@class='get-start for_desk']")
	WebElement SmileAssessBtn;
	
	@FindBy(xpath="//*[@class='bullet-points']/a[1]/h2")
	WebElement SmartTrackMaterialbtn;
	
	@FindBy(xpath="//*[@class='bullet-points']/a[2]/h2")
	WebElement DocLocatorBtn;
	
	@FindBy(xpath = "//*[@id=\"for-links\"]/a[1]")
	WebElement GetourInvisalignapplink;
	
	@FindBy(xpath = "//*[@id=\"for-links\"]/a[2]")
	WebElement ForPatientslink;
	
	@FindBy(xpath = "//*[@id=\"for-links\"]/a[3]")
	WebElement ForDoctorslink;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle() {
		
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyLogo() {
		
		return Logo.isDisplayed();		
	}
	
	public MyInvisalignappPage verifyGetInvisalignApplink() {

		GetourInvisalignapplink.click();
		System.out.println(driver.getWindowHandles());
		return new MyInvisalignappPage();
	}
	
	public ForPatientsPage verifyforpatientslink() {
		
		ForPatientslink.click();
		System.out.println(driver.getWindowHandles());
		return new ForPatientsPage();
	}
	
	public ForDoctorsPage verifyForDoctorslink() {
		
		ForDoctorslink.click();
		System.out.println(driver.getWindowHandles());
		return new ForDoctorsPage();
	}
	
	public SmileAssessmentPage verifySmileAssessmentlink() {
		
		SmileAssessBtn.click();
		return new SmileAssessmentPage();
	}
	
	public SmartTrackMaterialPage verifysmarttrackmaterialslink() {
		
		SmartTrackMaterialbtn.click();
		return new SmartTrackMaterialPage();
	}
	
	public DoctorLoacatorPage verifydoctorlocatorslink() {
		
		DocLocatorBtn.click();
		return new DoctorLoacatorPage();
	}
}
