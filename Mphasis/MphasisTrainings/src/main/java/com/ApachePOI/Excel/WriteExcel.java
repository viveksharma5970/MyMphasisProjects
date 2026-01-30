package com.ApachePOI.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcel {
	static File f;
	static FileOutputStream fos;
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static HSSFRow row;
	static HSSFCell cell;
	static FileInputStream fis;
	public static void writeExcelFile() {
		/**
		 * Create a File
		 * File class
		 * FileOutputStream
		 */
		f = new File("TestData//Mphasis.xls");

		wb = new HSSFWorkbook();
		sheet = wb.createSheet("MphasisEmployee");
		row = sheet.createRow(0);
		cell = row.createCell(0);
		try {
			cell.setCellValue("John");
			fos = new FileOutputStream(f);
			wb.write(fos);
			fos.close();
			wb.close();
			System.out.println("Data is sucessfully written");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void readTheData() throws IOException {
		f = new File("TestData//Mphasis.xls");
		fis = new FileInputStream(f);
		wb = new HSSFWorkbook(fis);
		sheet = wb.getSheet("MphasisEmployee");
		row = sheet.getRow(0);
		cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
	}

	public static void main(String args[]) throws IOException {
		//		writeExcelFile();
		readTheData();
	}
}
