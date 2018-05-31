package com.pega.Session6.constructors;

public class HowConstructorWorks2 {

	long start,end;

//What is the difference between method and constructor

	//Contsructor helps with initialize the state of the object //method is used to expose the behaviour of the object
	//must not have return type                                 //must have a return type
	//Can be invoked implicitly                                 //Explicitly
	//Java compiler provided one default one default constructor as part of jvm  //no default method is provided
	//Name same as Class             //May or May not be same


	HowConstructorWorks2(long start, long end) {
	//checkInterval(start,end);

		if(start>=end){
			//throw new IllegalArgumentException("Invalid data");
			System.out.println("start should never be greater than or equal to end");
		}
		System.out.println("Don't worry...start came less than end variable");
		this.start=start;
		this.end=end;
}


/*
 void checkInterval(long start,long end){
		if(start>=end){
			System.out.println("start should never be greater than end");
		}
		this.start=start;
		this.end=end;
}*/

	public static void main(String[] args) {
		HowConstructorWorks2 obj=new HowConstructorWorks2(30, 20);
		System.out.println(obj.duration());

	}

	long duration(){
		return end-start;
	}
}
