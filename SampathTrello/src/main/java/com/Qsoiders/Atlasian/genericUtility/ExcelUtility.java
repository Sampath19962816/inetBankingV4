package com.Qsoiders.Atlasian.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Sampath P
 *
 */
public class ExcelUtility {
/**
 * This method will get the cell value which of String type
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @return cellData
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String readStringDataFromExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TrelloTestCaseSpecificData.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		String cellData = workBook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		workBook.close();
	    return cellData;
	}
/**
 * It will be used to read the numeric cell value from the workbook	
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @return cellData
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public double readNumericDataFromExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TrelloTestCaseSpecificData.properties");
		Workbook workBook = WorkbookFactory.create(fis);
		double cellData = workBook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		workBook.close();
	    return cellData;
	}
	
}
