package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Concept {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Kumar\\eclipse-workspace\\Adactin_Cucumber\\Data Sheet.xlsx");
		
		FileInputStream fl = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fl);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int rowSize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowSize; i++) {
			
			Row row = sheetAt.getRow(i);
			
	    int cellSize = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cellSize; j++) {
			
			Cell cell = row.getCell(j);
			
		
		CellType cellType = cell.getCellType();	
		if (cellType.equals(cellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			
			System.out.println(stringCellValue);
		}	
			
		else if (cellType.equals(cellType.NUMERIC)) {
			double n = cell.getNumericCellValue();
			
			long value = (long) n; 
			
			String valueof = String.valueOf(value);
			
			System.out.println(value);
		}
		
		}	
			
		}
		
		
	}

}
