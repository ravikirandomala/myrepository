package com.invisalignstaging.qa.testPages;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.invisalignstaging.qa.Basepage.BasePage;

public class ExtentReportsClass extends BasePage {

	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeTest
	public void startReport() {
		
//		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/STMExtentReport.html",true);
//		extent 
	}
	
}
