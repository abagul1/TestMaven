package com.pega.Session10.d_ReadingPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException{

		Properties prop=new Properties ();

		FileInputStream ip=new FileInputStream (System.getProperty ("user.dir")+"/src/main/java/com/pega/Section10/d_ReadingPropertiesFile/Employee.properties");
		prop.load (ip);

		System.out.println (prop.getProperty ("name") +" "+prop.getProperty ("Age"));
		System.out.println (prop.getProperty ("DOB") );
	}


}
