package com.Properties.Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	static File f;
	static FileInputStream fis;
	static Properties prop;
	static final String path=System.getProperty("user.dir");
	public static void main(String[] args) throws IOException {
//		Create an object of file class
		f = new File(path+"//TestData//config.properties");
//		Create an object of fis class
		fis = new FileInputStream(f);
//		Create an object of properties
		prop = new Properties();
//		load the properties
		prop.load(fis);
//		capture the value
		String browserName = prop.getProperty("browserName");
		String url = prop.getProperty("url");
		
		System.out.println("Name of browser: "+ browserName);
		System.out.println("Url is: " + url);
	}
}
