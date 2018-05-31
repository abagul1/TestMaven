package com.pega.Session2;

public class concatination_operator {

	public static void main(String[] args) {

		String x="Hello ";
		String y="world";
		int a=200;
		int b=100;

		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));

		// || &&
		//> < >= <= !=

		String p="Selenium method";
		String q="Selenium method";

		if(p==q){}

		if(p.equals(q)){
			System.out.println("p and q are equal");
		}    else{
			System.out.println("not equal");
		}

	}
}
