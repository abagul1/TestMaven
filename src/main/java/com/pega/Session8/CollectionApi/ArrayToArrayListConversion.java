package com.pega.Session8.CollectionApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayToArrayListConversion {

	public static void main(String[] args) {

		String arr[] ={"A","B","C","D"};


		ArrayList<String> list = new ArrayList<String> (Arrays.asList (arr));
		list.add ("E");
		list.add ("F");

		for(String str: list){
			System.out.println (" "+str );
		}

		Iterator<String> itr=list.iterator ();
		while(itr.hasNext ()){
			System.out.println (itr.next () );
		}
	}
}
