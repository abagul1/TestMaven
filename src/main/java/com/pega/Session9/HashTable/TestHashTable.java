package com.pega.Session9.HashTable;

import java.util.Hashtable;

public class TestHashTable {

	public static void main(String[] args) {


		Hashtable<String,String> table1=new Hashtable<String, String> ();
		table1.put ("city1","LA");
		table1.put ("city2","Boston");
		table1.put ("city3","Chicago");

		Hashtable<String,String> table2=new Hashtable<String, String> ();
		table2.put ("city1","4343");
		table2.put ("city2","7676");
		table2.put ("city3","656565");

		//Hashtable inside a collection

		Hashtable<String,Hashtable<String,String>> table=new Hashtable<String,Hashtable<String,String>>();
	table.put ("name",table1);
	table.put ("zip",table2);

		System.out.println (table.get ("name").get ("city2") );
		System.out.println (table.get ("zip").get ("city3") );

	}
}
