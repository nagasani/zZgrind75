package com.grind.misc;

public class StringReplace {

	public static void main(String[] args) {
		String url = "http://localhost/bisweb/PropertyProfileOverview?rama=raju";
		if(url.startsWith("http://localhost")) 
		{			
			url = url.replace("http://localhost", "https://localhost");
		}
		System.out.println(url);		
	}
	
	private static String replaceHttpWithHttps(String input) 
	{
		if (input.startsWith("http://localhost")) 
		{
			return input.replace("http://localhost", "https://localhost");
		} 
		else 
		{
			return input;
		}
	}
}
