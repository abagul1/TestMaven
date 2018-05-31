package com.pega.Session8.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class WhatGenericsAre {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String> ();
		list.add ("A");
		list.add ("B");

		ArrayList<Integer> list1 = new ArrayList<Integer> ();
		list1.add (1);
		list1.add (2);

		//first advantage is object type safety-can hold single type of data,
		//Type casting
		//Compile time checking(it is better to handle the problem at compile time tha at the runtime)
		//post jdk 1.5 you wont get any classcastexception just with usage of generics

		LinkedList<Integer> intList=new LinkedList<Integer> ();
		intList.add (1);

		String s=list.get (1);
		System.out.println (s );

		System.out.println (intList.get (0) );
		System.out.println ("-----------" );

		Iterator<String> itr=list.iterator();
		while(itr.hasNext ()){
			System.out.println (itr.next () );
		}

		System.out.println ("-----------" );

		Iterator<Integer> itrForint=intList.iterator ();
		while(itrForint.hasNext ()){
			System.out.println (itrForint.next () );
		}
	}
}