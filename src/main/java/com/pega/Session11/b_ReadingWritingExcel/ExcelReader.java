package com.pega.Session11.b_ReadingWritingExcel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {

	public static final String SAMPLE_XLSX_FILE_PATH=System.getProperty ("user.dir")+"/src/main/java/com/pega/Session11/b_ReadingWritingExcel/sample-xlsx-file.xlsx";


	public static void main(String[] args) throws IOException,InvalidFormatException {
		//Creating a workbook from  a excel file
		//WorkbookFactory
		//Iterating methods
		//DataFormatter


		Workbook workbook= WorkbookFactory.create (new File (SAMPLE_XLSX_FILE_PATH));
		//Retrive the number of sheets

		System.out.println ("Workbook has : "+workbook.getNumberOfSheets ()+" Sheets" );

		//Iterating over all the sheets in the workbook

		//1. Using sheetIterator and iterate over it

		Iterator<Sheet> sheetIterator=workbook.sheetIterator ();

		System.out.println ("Retriveing the sheet using the sheetIterator" );
		while (sheetIterator.hasNext ()){
			Sheet sheet=sheetIterator.next ();
			System.out.println ("=> "+sheet.getSheetName () );
		}

		//Iterate over all the rows and columns in a sheet

		//Getting the sheet at index zero

		Sheet sheet=workbook.getSheetAt (0);

		//Create a DataFormatter to format and get each cell's value as string

		DataFormatter dataFormatter=new DataFormatter ();

		//We can rowIterator and columnIterator

		System.out.println ("\n\nIterate over rows and columns using Iterator" );

		Iterator<Row> rowIterator=sheet.rowIterator ();
		while (rowIterator.hasNext ()){
			Row row=rowIterator.next ();

			Iterator<Cell> cellIterator=row.cellIterator ();
			while (cellIterator.hasNext ()){
				Cell cell=cellIterator.next ();
				String cellvalue=dataFormatter.formatCellValue (cell);
				System.out.print (cellvalue+"\t" );
			}
			System.out.println ( );
		}


	}

}