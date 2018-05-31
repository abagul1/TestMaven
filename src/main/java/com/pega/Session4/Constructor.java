package com.pega.Session4;

public class Constructor {

	public static void main(String[] args) {

		Car a=new Car();
		Car b=new Car();
		Car c= new Car();

		a.model = "BMW";
		a.price=22323;

		Car d=new Car("Toyota",7676);
		System.out.println(d.model+"----"+d.price);

		Car ex_constructor = new Car("dddd",778);
	}
}
