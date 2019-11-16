package com.invisalignstaging.qa.testPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.invisalignstaging.qa.Basepage.BasePage;
import com.invisalignstaging.qa.mainPages.HomePage;
import com.invisalignstaging.qa.mainPages.ResultsPage;
import com.invisalignstaging.qa.mainPages.SmileAssessmentPage;

public class SmileAssessmentPageTest extends BasePage {

	HomePage homepage;
	SmileAssessmentPage smileassessmentpage;
	ResultsPage resultspage;
	
	public SmileAssessmentPageTest() {
		
		super();		
	}
	
	@BeforeMethod
	public void setUp() {
		
		Initialization();
		homepage = new HomePage();
		smileassessmentpage = new SmileAssessmentPage();
		smileassessmentpage = homepage.verifySmileAssessmentlink();
	}
	
	@Test(priority=1)
	public void verifysmileassessmentpagetitleTest() throws InterruptedException {
		
		String smilepagetitle = smileassessmentpage.verifysmileassessmentpagetitle();
		System.out.println(smilepagetitle);
		Assert.assertEquals(smilepagetitle, "Should I Get Invisalign? | Smile Assessment | Invisalign");		
		Thread.sleep(20000);
	}
	
	@Test(priority=2)
	public void verifysmileassessmentteenfunctionalityTest() throws InterruptedException {
		
		resultspage = smileassessmentpage.verifysmileassessmentteenfunctionality(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("DOB"), prop.getProperty("zipcode"), prop.getProperty("phonenum"), prop.getProperty("emailid"));
		Thread.sleep(20000);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
