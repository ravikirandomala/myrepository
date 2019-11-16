package com.invisalignstaging.qa.testPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.invisalignstaging.qa.Basepage.BasePage;
import com.invisalignstaging.qa.mainPages.AppStorePage;
import com.invisalignstaging.qa.mainPages.ForPatientsPage;
import com.invisalignstaging.qa.mainPages.GooglePlayStorePage;
import com.invisalignstaging.qa.mainPages.HomePage;
import com.invisalignstaging.qa.mainPages.MyInvisalignappPage;

public class MyInvisalignappPageTest extends BasePage {
	
	HomePage homepage;
	MyInvisalignappPage myinvisalignapppage;
	ForPatientsPage forpatientspage;
	AppStorePage appstorepage;
	GooglePlayStorePage googleplaystorepage;
		
	public MyInvisalignappPageTest() {
		
		super();
	}
	
	@BeforeMethod	
	public void setUp() throws InterruptedException {
		
		Initialization();
		homepage = new HomePage();
		myinvisalignapppage = new MyInvisalignappPage();
		myinvisalignapppage = homepage.verifyGetInvisalignApplink();
		Thread.sleep(10000);
	}
	
	@Test(priority=1)
	public void verifyinvisalignTitleTest() throws InterruptedException {
		
		String invisaligntitle = myinvisalignapppage.verifyinvisalignTitle();
		System.out.println(invisaligntitle);
		Assert.assertEquals(invisaligntitle, "My Invisalign");		
	}
	
	@Test(priority=2)
	public void verifyinvisalignlogoTest() throws InterruptedException {
		
		boolean flag = myinvisalignapppage.verifyinvisalignlogo();
		Assert.assertTrue(flag, "Logo is verified");
		Thread.sleep(10000);
	}
	
	@Test(priority=3)
	public void verifymadetomovelinkTest() throws InterruptedException {
		
		forpatientspage = myinvisalignapppage.verifymadetomovelink();
		Thread.sleep(10000);
	}
	
	@Test(priority=4)
	public void verifyAppleStorelinkTest() throws InterruptedException {
		
		appstorepage = myinvisalignapppage.verifyAppleStorelink();
		Thread.sleep(10000);
	}
	
	@Test(priority=5)
	public void verifyGooglePlayStorelinkTest() throws InterruptedException {
		
		googleplaystorepage = myinvisalignapppage.verifyGooglePlayStorelink();
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
