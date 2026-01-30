package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchData {

	static File f;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	public static Object[][] getUserLoginCredentials() throws IOException  {
		f = new File(System.getProperty("user.dir") + "//TestData//Login_credentials.xlsx");
		fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		
		int noOfRows=sheet.getLastRowNum();
//		System.out.println(noOfRows);
		int noOfCells=sheet.getRow(noOfRows).getLastCellNum();
		
//		System.out.println(noOfCells);
//		String[][] data=new String[noOfRows+1][noOfCells];
		String[][] data=new String[1][2];
		data[0][0] = sheet.getRow(1).getCell(0).getStringCellValue();
		data[0][1] = sheet.getRow(1).getCell(1).getStringCellValue();
		
		return data;
	}
	
	public static Object[][] getSystemUserDetails() throws IOException {
		f = new File(System.getProperty("user.dir") + "//TestData//System_users.xlsx");
		fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		
		int noOfRows=sheet.getLastRowNum();
//		System.out.println(noOfRows);
		int noOfCells=sheet.getRow(noOfRows).getLastCellNum();
		
//		System.out.println(noOfCells);
		String[][] data = new String[1][noOfCells];
//		for(int i=1; i<data.length; i++)
//		{
//			for(int j=0; j<data[0].length; j++)
//			{
//				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
//				System.out.println(data[i][j]);
//			}
//		}
		for(int i=0; i<noOfCells; i++) {
			data[0][i] = sheet.getRow(1).getCell(i).getStringCellValue();
		}
		return data;
		
	}

}
