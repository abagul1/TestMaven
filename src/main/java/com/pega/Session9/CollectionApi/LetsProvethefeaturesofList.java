package com.pega.Session9.CollectionApi;

import java.util.ArrayList;
import java.util.Iterator;

public class LetsProvethefeaturesofList {

	public static void main(String[] args) {

		//can the api accomodate
		//Duplicates
		//Insertion order
		//mutiple null

		ArrayList<String> arrList=new ArrayList<String> ();
		//Duplicates
		arrList.add ("A");
		arrList.add ("A");
		arrList.add ("A");
		arrList.add ("A");
		arrList.add ("A");

		//multiple null values

		arrList.add (null);
		arrList.add (null);
		arrList.add (null);
		arrList.add (null);
		arrList.add (null);

		//Insertion order is maintained

		arrList.add ("Z");
		arrList.add ("Y");
		arrList.add ("X");
		arrList.add ("W");

		Iterator<String> itrString=arrList.iterator ();
		while (itrString.hasNext ()){
			System.out.println (itrString.next () );
		}


	}




}
