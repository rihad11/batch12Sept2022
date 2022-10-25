package com.abc.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

		
		public static FileInputStream fi;
		public static XSSFWorkbook wb;
		public static XSSFSheet ws;
		public static XSSFRow row;
		public static XSSFCell cell;

		public static int getRowCount(String Xlfile, String Xlsheet) throws Exception {
			
			fi = new FileInputStream(Xlfile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(Xlsheet);
			int rowcount = ws.getLastRowNum();
			wb.close();
			fi.close();
			return rowcount;
		}
		
		public static int getCellCount(String Xlfile, String Xlsheet, int rownum) throws Exception {
			
			fi = new FileInputStream(Xlfile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(Xlsheet);
			row= ws.getRow(rownum);
			int cellcount = row.getLastCellNum();
			wb.close();
			fi.close();
			return cellcount;
		}
		
		public static String getCellData(String Xlfile, String Xlsheet, int rownum, int colnum) throws Exception {
			
			fi = new FileInputStream(Xlfile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(Xlsheet);
			row= ws.getRow(rownum);
			cell=row.getCell(colnum);
			String data;
			
			try {
				DataFormatter formatter = new DataFormatter();
				String celldata = formatter.formatCellValue(cell);
				return celldata;
			} catch (Exception e) {
				data="";
			}
			wb.close();
			fi.close();
			return data;
		}
		

	

	
	
}
	

