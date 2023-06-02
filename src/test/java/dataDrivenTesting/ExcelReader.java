package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
		static XSSFWorkbook workbook;
		

			public ExcelReader(String path) {

				File f= new File(path);
				try {
					FileInputStream fis =new FileInputStream(f);
					 workbook = new XSSFWorkbook(fis);
					}
		      catch (Exception e)
				    {
				     	e.printStackTrace();
					}
			}
			//fetch the data from sheet as per requirement wise
			public String getData(int sheetIndex, int row, int cell)
			{
				XSSFSheet sheet= workbook.getSheetAt(sheetIndex);
				String data =sheet.getRow(row).getCell(cell).getStringCellValue();
				return data;
			}
			
			//count the no. of rows
			public int getRowsCount(int sheetIndex)
			{
				int rows = workbook.getSheetAt(sheetIndex).getLastRowNum();
				return rows;
			}
			
			//count the no. of cell
			public int getCellCount(int sheetIndex)
			{
				int cells= workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
				return cells;
			}
			
			
			}