package com.pega.Session10.c_ReadingWritingTextFiles;

import java.io.*;

public class ReadingWritingTextFiles {

	public static void main(String[] args) throws IOException {
		//creating a file

		File f=new File (System.getProperty ("user.dir")+"/src/main/java/com/pega/Section10/c_ReadingWritingTextFiles/java.txt");
		f.createNewFile ();

		//writing into a file

		FileWriter writer = new FileWriter (System.getProperty ("user.dir")+"/src/main/java/com/pega/Section10/c_ReadingWritingTextFiles/java.txt");
		BufferedWriter out=new BufferedWriter (writer);
		out.write ("Hello i am writing into this file");
		out.newLine ();
		out.write ("New line");
		out.flush ();
		out.close ();

		//Reading from the file
		FileReader reader = new FileReader (System.getProperty ("user.dir")+"/src/main/java/com/pega/Section10/c_ReadingWritingTextFiles/java.txt");
        BufferedReader r=new BufferedReader (reader);

		/*System.out.println (r.readLine () );
		System.out.println (r.readLine () );
		System.out.println (r.readLine () );*/

		String x="";
		while((x=r.readLine ())!=null){
			System.out.println (x );
		}


	}
}
