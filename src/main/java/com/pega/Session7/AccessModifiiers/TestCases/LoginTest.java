package com.pega.Session7.AccessModifiiers.TestCases;

import com.pega.Session7.AccessModifiiers.FileReading.ReadingXLSFile;
import com.pega.Session7.AccessModifiiers.Reporting.html.BetterHtmlReports;
import com.pega.Session7.AccessModifiiers.Reporting.html.HTMLReporting;
import com.pega.Session7.AccessModifiiers.Reporting.xls.XLSReports;

public class LoginTest {


	public static void main(String[] args) {

		HTMLReporting htmlReporting = new HTMLReporting ();
		BetterHtmlReports betHTML=new BetterHtmlReports ();
		XLSReports xlsReports = new XLSReports ();
		SendMailTest sendMail=new SendMailTest ();

		//public -Any package

		//private-only can be accessed within the class

		//default-only be accessed within the class and class in the package

		//protected(Extension of default)-only be accessed within the class and class within the package and childclass in different packages

		ReadingXLSFile xlsFile = new ReadingXLSFile ();
		//System.out.println(xlsFile.xlspath);

		//For explaining null point exception, i wont say that put this in try-catch as a programmer you have initialised the object what is the purpose of try catch
		HTMLReporting h = null;
		h.generate ();
	}
}
