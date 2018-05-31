package com.pega.Session9.CollectionApi;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HowListIteratorWorkswithLinkedList {

	public static void main(String[] args) {

		List<String> ListObject=new ArrayList<String> ();
		ListObject.add ("A");
		ListObject.add ("B");

		ListIterator<String> listitr=ListObject.listIterator();
		System.out.println ("Forward traversing" );
		while(listitr.hasNext ()){
			System.out.println (listitr.next () );
			System.out.println (listitr.nextIndex () );
			//listitr.set ("Replace");

		}


		System.out.println ("Backwards" );
		while (listitr.hasPrevious ()){
			System.out.println (listitr.previous () );
		}
	}

}
