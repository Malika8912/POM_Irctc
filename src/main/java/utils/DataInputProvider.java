package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {
	
	
	public static String[][] getData(String sheetName){
		
		String[][] testData = null;
		
		try {
			FileInputStream fis = new FileInputStream("./testData/TestDataSheet.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet Sheet = wb.getSheet(sheetName);
			
			int rowcount = Sheet.getLastRowNum();
			
			int columncount = Sheet.getRow(0).getLastCellNum();
			
			System.out.println("Rowcount :" +rowcount);
			
			System.out.println("Columncount :" +columncount);
			
			testData = new String[rowcount][columncount];
			
			for(int i=1; i<=rowcount; i++) {
				
			    XSSFRow row = Sheet.getRow(i);
			
				for(int j=0; j<columncount; j++) {
					
					String cellData = row.getCell(j).getStringCellValue();
					
					System.out.println("The value of row " +i+ " and column " +j+ " is : "  +cellData);
					
					testData[i-1][j]=cellData;
					
					
				}
			
			}
							
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return testData;
		
	}

}

