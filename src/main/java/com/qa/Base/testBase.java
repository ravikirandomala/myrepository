package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class testBase {

	public static Properties prop;
	
	public testBase() {
		
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\SwathiKiran\\eclipse-workspace"
			+"\\APITesting\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
			
		} catch(FileNotFoundException fn) {
			
			fn.printStackTrace();
		} catch (Exception e) {
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
