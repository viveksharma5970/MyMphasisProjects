package com.Mphasis.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormRegistration {
	static File f;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static String[] data;
	
	static WebDriver driver;
	
	public static void invokeBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-start-maximized");
		driver = new ChromeDriver(option);
		System.out.println("Browser launched successfully");;
	}
	public static void runURL(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Url running.......");
	}
	public static void captureData() throws IOException {
		f = new File("TestData//formData.xlsx");
		fis = new FileInputStream(f);
//		System.out.println(f.getName());
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
//		count num of rows
		int numRows = sheet.getLastRowNum();
		
		row = sheet.getRow(numRows);
		
//		count num of cols
		int numCells = row.getLastCellNum();
		System.out.println("Number of Rows: "+ numRows);
		System.out.println("Number of cells: " + numCells);
		
		data = new String[numCells];
		
		data[0] = sheet.getRow(numRows).getCell(0).getStringCellValue();
		driver.findElement(By.id("uname")).sendKeys(data[0]);
		
		data[1] = sheet.getRow(numRows).getCell(1).getStringCellValue();
		driver.findElement(By.id("uemail")).sendKeys(data[1]);
		
		double age =sheet.getRow(numRows).getCell(2).getNumericCellValue();
//		convert numerical data into string
		data[2] = String.valueOf(age);
		driver.findElement(By.id("phone")).sendKeys(data[2]);
		
	}
	
	public static void main(String[] args) throws IOException {
		invokeBrowser();
		System.out.println("---------------------------");
		runURL("https://webapps.tekstac.com/FormRegistration/FormRegistration.html");
		System.out.println("---------------------------");
		captureData();
		
		
	}
}
