package com.pega.Session8.CollectionApi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HowLinkedListWorks {


	public static void main(String[] args) {

		LinkedList<String> arrayList=new LinkedList<String> ();
		arrayList.add ("A");
		arrayList.add ("B");
		arrayList.add ("C");
		arrayList.add ("D");
		arrayList.add ("E");

        arrayList.addFirst ("FIRST");
        Object var=arrayList.getFirst ();
		System.out.println (var );


		arrayList.addLast ("END");
		Object end=arrayList.getLast ();
		System.out.println (end );

		System.out.println ("Index of A is "+arrayList.indexOf ("FIRST") );

		arrayList.removeFirstOccurrence ("A");
		arrayList.removeLastOccurrence ("END");

		arrayList.add (null);
		arrayList.add (null);
		arrayList.add (null);
		arrayList.add (null);



		List<String> arrayList2=new LinkedList<String> ();
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

		//arrayList.removeAll (arrayList2);



		System.out.println ("Traversing using enhanced for loop" );

		for(String str:arrayList){
			System.out.print(" "+str );
		}


	/*	//clear

		arrayList.clear ();


		for(String str:arrayList){
			System.out.print(" "+str );
		}
*/
	}
}
