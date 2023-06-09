package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * This is a generic method for reading the data from property file
	 * @param Key
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getPropertyData(String Key) throws EncryptedDocumentException, IOException{
		FileInputStream fis= new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String data = p.getProperty(Key);
		return data;
	}
	
	/**
	 * This is a generic method for reading the data from the excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	/**
	 * THis is a generic method for writing data to excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException{
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos= new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
	}
}
