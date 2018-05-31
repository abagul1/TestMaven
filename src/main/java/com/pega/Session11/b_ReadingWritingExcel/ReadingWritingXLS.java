package com.pega.Session11.b_ReadingWritingExcel;

public class ReadingWritingXLS {

	//poi architecture/Users/mekak2/Documents/workspace/JavaSeleniumSessions/src/main/java/com/pega/Session11/b_ReadingWritingExcel/Data.xlsx
	//dependencies
	//Using the customised XLS_READER
	//getRowCount, getCellData(overloading), getColumnCount

	public static void main(String[] args) {
		Xls_Reader datatable=new Xls_Reader (System.getProperty ("user.dir")+"/src/main/java/com/pega/Session11/b_ReadingWritingExcel/Data.xlsx");
	   int r= datatable.getRowCount ("Record");
		System.out.println (r );

		String data=datatable.getCellData ("Record","City",2);
		System.out.println (data );
		System.out.println (datatable.getColumnCount ("Record") );

		datatable.setCellData ("Record","Name",10,"Selenium");
	}






}
