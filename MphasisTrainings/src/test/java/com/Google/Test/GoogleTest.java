package com.Google.Test;

import org.testng.annotations.Test;

import com.Google.BaseClass.BaseClass;
import com.Google.ObjectRepository.GooglePO;

public class GoogleTest extends BaseClass{
	
	@Test
	public static void searchGoogle() {
		GooglePO google = new GooglePO(driver);
		google.setValue();
	}
}
