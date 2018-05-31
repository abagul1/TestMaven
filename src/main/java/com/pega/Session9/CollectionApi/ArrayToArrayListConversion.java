package com.pega.Session9.CollectionApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayToArrayListConversion {

	public static void main(String[] args) {

		String arr[]={"A","B","C","D","E"};

		ArrayList<String> list = new ArrayList<String> (Arrays.asList(arr));
		list.add ("F");
		list.add ("G");

		for(String str: list){
			System.out.println (str );
		}

		System.out.println ("----------" );

		Iterator<String> itr=list.iterator ();
		while(itr.hasNext ()){
			System.out.println (itr.next () );
		}

	}
}
