package com.invisalignstaging.qa.mainPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SmileAssessmentPage extends HomePage {

	@FindBy(id="logo")
	WebElement Logo;
	
	@FindBy(xpath="//*[@class='btn btn-teen']")
	WebElement TeenBtn;
	
	@FindBy(xpath="//*[@class='col-xs-4 parent-select']")
	WebElement ParentBtn;
	
	@FindBy(xpath="//*[@class='col-xs-4 adult-select']")
	WebElement AdultBtn;
	
	@FindBy(xpath="//div[1]/label[contains(text(),'Overbite')]")
	WebElement OverbiteBtn;
	
	@FindBy(xpath="//div[1]/label[contains(text(),'Underbite')]")
	WebElement UnderbiteBtn;
	
	@FindBy(xpath="//div[1]/label[contains(text(),'Crossbite')]")
	WebElement CrossbiteBtn;
	
	@FindBy(xpath="//div[1]/label[contains(text(),'Gap Teeth')]")
	WebElement GapteethBtn;
	
	@FindBy(xpath="//div[1]/label[contains(text(),'Open Bite')]")
	WebElement OpenbiteBtn;
	
	@FindBy(xpath="//div[1]/label[contains(text(),'Crooked Teeth')]")
	WebElement CrookedteethBtn;
	
	@FindBy(xpath="//div[1]/label[contains(text(),'Generally Straight Teeth')]")
	WebElement generalstraightteethBtn;
	
	@FindBy(xpath="//img[@class='inv_first']")
	WebElement mixedteethBtn;
	
	@FindBy(xpath ="//select[@id='status']")
	WebElement Selectdrpdwn;
	
	@FindBy(id ="first_name")
	WebElement Firstnametxtbox;
	
	@FindBy(id ="last_name")
	WebElement Lastnametxtbox;
	
	@FindBy(id="txtDOB")
	WebElement Birthdatetxtbox;
	
	@FindBy(id="txtZip")
	WebElement ziptxtbox;
	
	@FindBy(id="phone")
	WebElement phonenumtxtbox;
	
	@FindBy(id="email")
	WebElement emailtetxtbox;
	
	@FindBy(xpath="//span[@class='checkmark checkk_box0']")
	WebElement checkbox;
	
	@FindBy(xpath="//div[2]//a[@class='lifetimeFormSubmit']")
	WebElement ChkResultsBtn;
	
	public SmileAssessmentPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifysmileassessmentpagetitle() {
		
		return driver.getTitle();
	}
	
	public ResultsPage verifysmileassessmentteenfunctionality(String first, String last, String DOB, String zip, String phone, String email) {
		
		TeenBtn.click();
		mixedteethBtn.click();
		Select Jrnydrpdwn = new Select(Selectdrpdwn);
		System.out.println(Jrnydrpdwn.getAllSelectedOptions());
		Jrnydrpdwn.selectByIndex(1);
		Firstnametxtbox.sendKeys(first);
		Lastnametxtbox.sendKeys(last);
		Birthdatetxtbox.sendKeys(DOB);;
		ziptxtbox.sendKeys(zip);
		phonenumtxtbox.sendKeys(phone);
		emailtetxtbox.sendKeys(email);
		checkbox.click();
		ChkResultsBtn.click();	
		return new ResultsPage();
		
	}
	
}
