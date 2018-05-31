package com.pega.Session8.CollectionApi;

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


		arrayList.add (null);
		arrayList.add (null);
		arrayList.add (null);
		arrayList.add (null);



		List<String> arrayList2=new ArrayList<String> ();
		arrayList2.add ("l");
		arrayList2.add ("m");
		arrayList2.add ("n");
		arrayList2.add ("o");
		arrayList2.add ("p");

		//how to add two arraylists

		arrayList.addAll (arrayList2);

		//remove
		arrayList.remove ("o");

		//set

		arrayList.set (1,"Replace the existing element");

		//retainAll

		arrayList.retainAll (arrayList2);



		//other methods : add, addAll, remove, removeAll, set, clear, retainAll
		System.out.println ("Traversing using Iterator" );

		Iterator<String> itr=arrayList.iterator ();
		while(itr.hasNext ()){
			System.out.print (" "+itr.next () );
		}

		System.out.println ( );
		//remove all

		arrayList.removeAll (arrayList2);




		System.out.println ("Traversing using enhanced for loop" );

		for(String str:arrayList){
			System.out.print(" "+str );
		}


		//clear

		arrayList.clear ();

		for(String str:arrayList){
			System.out.print(" "+str );
		}

	}
}
