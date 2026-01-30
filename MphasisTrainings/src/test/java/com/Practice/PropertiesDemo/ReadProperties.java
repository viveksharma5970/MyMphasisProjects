package com.Practice.PropertiesDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	static File f;
	static FileInputStream fis;
	static Properties prop;
	
	public static String getUrl() throws IOException {
		f = new File(System.getProperty("user.dir") + "//TestData//config.properties");
		fis = new FileInputStream(f);
		
		prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		return url;
	}
	
	public static String getSearchText() {
		return prop.getProperty("searchText");
	}
}
