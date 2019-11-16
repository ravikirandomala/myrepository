package com.invisalignstaging.qa.testUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.invisalignstaging.qa.Basepage.BasePage;

public class TestUtilities extends BasePage {
	
	public static int PAGE_LOAD_WAIT = 60;
	public static int IMPLICIT_WAIT = 20;
	
	public void getScreenshot () throws IOException {
		
		String methodName = new Object().getClass().getEnclosingMethod().getName();
//		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
//		String destination = System.getProperty("user.dir")+"/FailedTestsScreenshots/"+methodName+System.currentTimeMillis()+".png";
//		File finalDestination = new File(destination);
		FileUtils.copyFile(source, new File(currentDir+"/FailedTestsScreenshots/"+methodName+System.currentTimeMillis()+".png"));
	}
	
	public static Object[][] getDatafromExcel() {
		return null;
		
		
	}

}
