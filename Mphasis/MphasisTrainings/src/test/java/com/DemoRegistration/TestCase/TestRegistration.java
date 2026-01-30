package com.DemoRegistration.TestCase;

import org.testng.annotations.Test;

import com.DemoRegistration.BaseClass.BaseClass;
import com.DemoRegistration.ObjectRepository.IndexPO;
import com.DemoRegistration.ObjectRepository.RegisterFormPO;

public class TestRegistration extends BaseClass{
	
	@Test
	public static void runIndexPage() {
		IndexPO index = new IndexPO(driver);
		index.setValue();
		index.enterSubmit();
	}
	
	@Test
	public static void runRegistrationForm() throws InterruptedException {
		RegisterFormPO register = new RegisterFormPO(driver);
		register.enterValues();
	}
}
