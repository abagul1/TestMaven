package com.pega.Session4;


//class: data and methods that act on the data. It is a template for the object
//Object: Instance or  copy of a class
public class Car {

	String model;
	static int wheels=4;
	int price;
	//why main is static?


	public Car(String model, int price){

		//For the first example
	/*	model=m;
		price=p;*/

		//Second example -here local variable name is becoming equal to the local variable name because of this global variable is hiding
	  model=model;
		price=price;

		//third introduce this- this will always point to the current object
		this.model=model;
		this.price=price;
	}

	public Car(){
		System.out.println("Constructor without any args");
	}


	public static void main(String[] args) {

		Car c1=new Car();
		c1.model="Merc";
		c1.price=65656565;
		System.out.println(c1.model+" "+wheels);
		c1.start();
		c1.acce();

	    Car c2=	new Car();
	    c2.model="BMW";
	   c2.price=65656565;
	   c2.start();
	   c2.wheels=4;
	   c2.acce();


	   fillGas(300); //not a good practice to call satic functions with a reference


	}

	public void start(){
		System.out.println(model+" "+"starting");

	}

	public void acce(){
		System.out.println(model+" "+"accelerating");

	}

	public static void fillGas(int quant){

	}
}
