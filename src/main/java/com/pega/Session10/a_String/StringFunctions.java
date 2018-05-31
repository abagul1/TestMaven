package com.pega.Session10.a_String;

public class StringFunctions {


	public static void main(String[] args) {


		String str="The spring has started here";
		String str1="The spring not started here";


		System.out.println (str.charAt (5) );
		System.out.println (str.length () );
		System.out.println ("First Occurance of s "+str.indexOf ('s') );
		System.out.println ("Second occurance od s "+str.indexOf ('s',5) );
		System.out.println (str.indexOf ("started") );
		System.out.println (str.indexOf ("hello") );

		System.out.println (str.equals (str1) );

		//cut out part of string

		System.out.println (str.substring (0,10) );

		//most important, segregating the string

		String temp[]=str.split (" ");
		for(int i=0;i<temp.length; i++){
			String s=temp[i];
			System.out.println (s );
		}

		//how to convert datatypes

		String x="100";//100A-Exception
		int i=Integer.parseInt (x);
		System.out.println (i );

		//Convert to i to string

		String z=String.valueOf (i);
		System.out.println (z );

		Boolean b=Boolean.valueOf ("true");
		System.out.println (b );

	}
}
