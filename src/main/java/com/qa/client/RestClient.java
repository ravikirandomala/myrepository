package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	//1. GET Method
	public void get(String url) throws ClientProtocolException, IOException {
	CloseableHttpClient httpClient = HttpClients.createDefault(); //Initializing the http method
	HttpGet httpget = new HttpGet(url); //Initializing the get method
	CloseableHttpResponse closeablehttpResponse = httpClient.execute(httpget); // Hit the GET URL
	
	int statusCode = closeablehttpResponse.getStatusLine().getStatusCode(); // getting the status code
	System.out.println("Status code is --->"+ statusCode);
	
	String responseString = EntityUtils.toString(closeablehttpResponse.getEntity(), "UTF-8"); // converting the data in UTF-8 string format
	
	JSONObject jsonResponse = new JSONObject(responseString); // parsing the data in JSON format
	System.out.println("Response JSON from API--->"+jsonResponse);
	
	Header[] headerArray = closeablehttpResponse.getAllHeaders(); // retrieve all headers
	
	HashMap<String,String> allHeaders = new HashMap<String,String>();
	
	for(Header header:headerArray) {
		
		allHeaders.put(header.getName(), header.getValue());//retrieve each header and its value
	}
	
	System.out.println("Header Array--->"+headerArray);//print all the headers and its values
	
}
}