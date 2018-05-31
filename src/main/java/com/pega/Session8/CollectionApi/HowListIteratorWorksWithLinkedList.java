package com.pega.Session8.CollectionApi;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HowListIteratorWorksWithLinkedList {

	public static void main(String[] args) {


		List<String> ListObject=new ArrayList ();

		ListObject.add ("A");
		ListObject.add ("B");


		ListIterator<String> listitr=ListObject.listIterator ();
		System.out.println ("Forward" );
		while (listitr.hasNext ()){
			System.out.println (listitr.next () );
			System.out.println (listitr.nextIndex () );
			listitr.set ("Replace");
		}


		System.out.println ("Backwards" );
		while (listitr.hasPrevious ()){
			System.out.println (listitr.previous () );
		}


	}
}
