package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.testBase;
import com.qa.client.RestClient;

public class GetAPITest extends testBase {
	
	testBase testbase;
	String serviceurl;
	String apiurl;
	String url;
	RestClient restclient;
	
	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException {
		
		testbase = new testBase();
		serviceurl = prop.getProperty("URL");
		apiurl = prop.getProperty("serviceURL");
		
		url= serviceurl+apiurl;
		
	}
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
		
		restclient = new RestClient();
		restclient.get(url);
	}
	
}
