package com.Practice.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandleDataDriven {
	static WebDriver driver;
	
	static File f;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	
	static int numRows;
	static String[] data;
	
	@BeforeClass
	static void invokeBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-start-maximized");
		driver = new ChromeDriver(option);
		System.out.println("Chrome invoked successfully");
		System.out.println("-------------------------------------");
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://facebook.com");
		System.out.println("Url running...");
		System.out.println("-------------------------------------");
	}
	
	@Test(priority=1)
	static void inputDataFromExcel() throws IOException {
		f = new File("TestData//formData2.xlsx");
		fis = new FileInputStream(f);
		
		wb = new XSSFWorkbook(fis);
		
		sheet = wb.getSheet("Sheet1");
		System.out.println("Sheet feteched successfully");
		System.out.println("-------------------------------------");
		
		numRows = sheet.getLastRowNum();
		System.out.println("Number of rows: " + numRows);
		System.out.println("-------------------------------------");
		
		data = new String[numRows];
		
		for(int i=0; i<numRows; i++) {
//			row = sheet.getRow(numRows);
			data[i] = sheet.getRow(i).getCell(0).getStringCellValue();
		}
		System.out.println("Data fetched...");
		System.out.println("-------------------------------------");
	}
	
	@Test(priority=2)
	public static void fillForm() {
		driver.findElement(By.id("first-name")).sendKeys(data[0]);
		driver.findElement(By.id("last-name")).sendKeys(data[1]);
		driver.findElement(By.id("job-title")).sendKeys(data[2]);
		driver.findElement(By.id("radio-button-2")).click();
	}
	
	
//	@Test
	public static void fill() {
		WebElement pass = driver.findElement(By.id("pass"));
		driver.findElement(RelativeLocator.with(By.id("email")).above(pass)).sendKeys("mphasis.com");
	}
	
}
