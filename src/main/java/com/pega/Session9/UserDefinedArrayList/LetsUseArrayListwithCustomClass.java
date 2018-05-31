package com.pega.Session9.UserDefinedArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LetsUseArrayListwithCustomClass {


	public static void main(String[] args) {

		List<Book> BookList=new ArrayList<Book> ();

		Book b1=new Book (1,"A","B","C",10);
		Book b2=new Book (2,"P","Q","R",20);
		Book b3=new Book (3,"G","H","I",30);

		BookList.add (b1);
		BookList.add (b2);
		BookList.add (b3);

		//Enhanced for

		for(Book b:BookList){
			System.out.println (b.id+" "+b.name+" "+b.publisher );
		}

		//Iterator

		Iterator iterator=BookList.iterator ();
		while(iterator.hasNext ()){
			Book book = (Book)iterator.next ();
			System.out.println (book.id+" "+book.author );
		}




	}
}
