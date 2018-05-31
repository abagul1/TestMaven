package com.pega.Session6.Polymorphism;

public class HowPolymorphismworks {

	//poly(many) Morph (forms)

	//two types: Compile time polymorphism or method Overloading
	//Advantage  of method overloading is increases the readability of the program
	//Run Time polymorphism or method overriding

	//adder

	int add(int a, int b){
		return a+b;
	}


	int add(int a, int b, int c){
		return a+b+c;

	}

	public static void main(String[] args) {
		HowPolymorphismworks obj=new HowPolymorphismworks();
		System.out.println(obj.add(1,3));
		System.out.println(obj.add(1,3,4));
	}
}
