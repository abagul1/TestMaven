package com.pega.Session4;

public class static_and_nonstatic {

	//Global variable

	String name; //non-static variable
	static int age;//static global

	//static can only access static
	public static void main(String[] args) {//static method
		//name="kalyan";
		sum();
		//sendPackage();
		age=35;

	}

	public static void sum(){ //static
		 int x=10; //local variable


	}

	public void sendPackage(){//non static
		name="kalyan";
		sum();
		sendPackage();
		age=35;

	}
}
