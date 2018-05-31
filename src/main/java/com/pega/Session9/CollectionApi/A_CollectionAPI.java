package com.pega.Session9.CollectionApi;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class A_CollectionAPI {


	//suppose i am automating with selenium and have to store  all the names of links in a page into a array,
	// every time i refresh the count changes, because of this count changes
	//Collections Framework provides us an architecture to store/manipulate objects using some classes
	//Collections:
	// List interface there are 4 implemtation classes:
	//List accomidates -Duplicates, mutiple null, insertion order
	//The 4 implementation classes are
	// ArrayList, - which api should i be choosing for what work
	// LinkedList,
	// Vector,
	// Stack
	//------------
	//Set: accomidates -Unique, only one null element, random order of insertion, TreeSet- Ascending order
	//HashSet
	//LinkedHashSet
	//TreeSet
	//------------
	//Map: - Key, value pair
	//HashMap
	//LinkedHashMap
	//TreeMap
	//Legacy class with name HashTable

	public static void main(String[] args) {

		//Arraylist is an in built class in java that can be used to store dynamically changing data structures.
		//Arraylist is a dynamic data structure which grows with the index
		//Memory utilization is perfect in arraylist
       //Users dynamic array-size grows
		//allows duolicates, maintains the insertion order, multiple nulls
		//is non -synchronized(they use vectors instead)i.e not used in multi threaded applications

		//Only disadvantage is manipulation is slow-bit wise manipulation
		//we use linkedlist since manipulation is fast-uses doubly linked list data structure


		ArrayList<String> list1 = new ArrayList<String> ();
		list1.add ("A"); //index 0
		list1.add ("B"); //index 1
		list1.add ("C");//2
		list1.add ("D");//3
		list1.add ("E");//4 - it keep on growing and can never define a final size
		//values can be extracted this way
		System.out.println (list1.get (2) );
		//size
		System.out.println (list1.size ());
		System.out.println ("------------------" );

		//i can also use a for loop to print all the values from the list this way using for loop contrsuct

	  Iterator<String> itrString=list1.iterator ();
	  while(itrString.hasNext ()){
		System.out.println (itrString.next () );
	   }

		System.out.println ("------------------" );

		ArrayList<Integer>  list2 = new ArrayList();
		list2.add (1); //index 0
		list2.add (2); //index 1
		list2.add (3);//2
		list2.add (4);//3
		list2.add (5);//4 - it keep on growing and can never define a final size
		//values can be extracted this way
		System.out.println (list2.get (2) );
		//size
		System.out.println (list2.size ());
		System.out.println ("------------------" );

		//i can also use a for loop to print all the values from the list this way using for loop contrsuct

		Iterator<Integer> intItr=list2.iterator ();
		while(intItr.hasNext ()){
			System.out.println (intItr.next () );
		}
		System.out.println ("------------------" );


		for(Integer  intI: list2){
			System.out.println (intI );
		}
		 //we use it in selenium when we have to extract objects in bulk
        //for xxample you have 4 buttons same property value and you need to pick third one you use
		//also when handling pop ups
		//this looks similar to teh arrays but it not, it is very important and useful




		//In selenium sometimes you use to store the test data
		//Arraylist is a dynamic data structure which grows with the index
		//THere is one more thing known as HashTable, although hashtable is also dynamically growing
		//HashTable  is a dynamic data structure which grows with key, value pairs

		Hashtable<String,String> table = new Hashtable<String,String> ();
		//It has key , value pair
		table.put ("name","Kalyan");
		table.put ("place","Cambridge");
		table.put ("profession","IT");

		System.out.println (table.get ("name") );
		System.out.println (table.get ("place") );

		//One key can have only one value

		table.put ("name","Test");
		System.out.println (table.get ("name") );

		//Some time you have to use this. i.e Arraylist inside an arraylist or Hashtable inside hashtable


	}

}
