package com.invisalignstaging.qa.testPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.invisalignstaging.qa.Basepage.BasePage;
import com.invisalignstaging.qa.mainPages.DoctorLoacatorPage;
import com.invisalignstaging.qa.mainPages.ForDoctorsPage;
import com.invisalignstaging.qa.mainPages.ForPatientsPage;
import com.invisalignstaging.qa.mainPages.HomePage;
import com.invisalignstaging.qa.mainPages.MyInvisalignappPage;
import com.invisalignstaging.qa.mainPages.SmartTrackMaterialPage;
import com.invisalignstaging.qa.mainPages.SmileAssessmentPage;

public class HomePageTest extends BasePage {
	
	HomePage homepage;
	MyInvisalignappPage myinvisalignapppage;
	ForPatientsPage forpatientspage;
	ForDoctorsPage fordoctorspage;
	SmileAssessmentPage smileassessmentpage;
	SmartTrackMaterialPage smarttrackmaterialpage;
	DoctorLoacatorPage doctorlocatorpage;
	
	public HomePageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		Initialization();
		homepage = new HomePage();
	}

	@Test(priority=1)
	public void verifyTitleTest() {
		
		String homtitle = homepage.verifyTitle();
		System.out.println(homtitle);
		Assert.assertEquals(homtitle, "Invisalign Clear Aligners | Invisalign");		
	}
	
	@Test(priority=2)
	public void verifyLogoTest() {
		
		boolean flag = homepage.verifyLogo();
		Assert.assertTrue(flag, "Logo is verified");
	}
	
	@Test(priority=3)
	public void verifyGetInvisalignApplinkTest() throws InterruptedException {
		
		myinvisalignapppage = homepage.verifyGetInvisalignApplink();
		Thread.sleep(30000);
	}
	
	@Test(priority=4)
	public void verifyforpatientslinkTest() throws InterruptedException {
		
		forpatientspage = homepage.verifyforpatientslink();
		Thread.sleep(30000);
	}
	
	@Test(priority=5)
	public void verifyForDoctorslinkTest() throws InterruptedException {
		
		fordoctorspage = homepage.verifyForDoctorslink();
		Thread.sleep(10000);
	}
		
	@Test(priority=6)
	public void verifySmileAssessmentlinkTest() throws InterruptedException {
		
		smileassessmentpage = homepage.verifySmileAssessmentlink();
		Thread.sleep(10000);
	}
	
	@Test(priority=7)
	public void verifysmarttrackmaterialslinkTest() throws InterruptedException {
		
		smarttrackmaterialpage = homepage.verifysmarttrackmaterialslink();
		Thread.sleep(10000);
	}
	
	@Test(priority=8)
	public void verifydoctorlocatorslinkTest() throws InterruptedException {
		
		doctorlocatorpage = homepage.verifydoctorlocatorslink();
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
