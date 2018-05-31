package com.pega.Session9.CollectionApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HowArrayListWorks {

	public static void main(String[] args) {

		List<String> arrayList=new ArrayList<String> ();
		arrayList.add ("A");
		arrayList.add ("B");
		arrayList.add ("C");
		arrayList.add ("D");
		arrayList.add ("E");

		List<String> arrayList1=new ArrayList<String> ();
		arrayList1.add ("1");
		arrayList1.add ("2");
		arrayList1.add ("3");
		arrayList1.add ("4");

		//How to add two arrayLists

		arrayList.addAll(arrayList1);

		Iterator<String> itr=arrayList.iterator ();
		while(itr.hasNext ()){
			System.out.println (itr.next () );
		}

		//Using Enhanced for loop

		System.out.println ("-------------" );

		for(String str:arrayList){
			System.out.println (str );
		}


	}
}
