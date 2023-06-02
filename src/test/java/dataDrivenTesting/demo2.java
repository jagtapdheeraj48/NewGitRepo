package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo2 {

	public static void main(String[] args) throws Exception {

		File t= new File("D:\\\\file CLass\\\\New folder\\\\vvvvvvv\\\\file2.xlsx");
	  
		System.out.println(t.exists());
		
		FileInputStream fis = new FileInputStream(t);
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		String k=sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(k);
		
	     int row=sheet.getLastRowNum();
	     System.out.println(row);
	     
	     int cells= sheet.getRow(0).getLastCellNum();
	     System.out.println(cells);
		
		for(int i=0;i<=row;i++)
		{
		  String data=sheet.getRow(i).getCell(0).getStringCellValue();
		  String ty=sheet.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(data+" "+ty);
		}
		
		
		
	}

}
