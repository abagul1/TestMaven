package com.pega.session1;

public class FirstJavaProgram {

//Break Points f6 -line by line , f8 regular program win, F7 and F9 mac

//Control comes here first
	public static void main(String[] args) {
		//Java is a case sensitive language +Ctrl +space
 		System.out.println("Print Something");
		System.out.println("Print next line");
		System.out.println(1234);
		System.out.println("---------------------------------------");
		System.out.print("FirstLine");
		System.out.print("Print Something");
		System.out.print("Print next line");
		System.out.print(1234);
		System.out.println("");
		System.out.println("---------------------------------------");


		int a =100000;//32 bits
		long b=-100000L;//64 bits
		System.out.println(a);

		System.out.println("a");
        //int a=300;
		a=200;
		System.out.println(a);

		double c =1935.34;
		System.out.println(c);

		char d='s';

		byte b1=99;

		boolean e=true;
		System.out.println(1000>200); //output of any conditional operator will come up as trur or false
		//Conditional operators  > < >= <= ==
		//comparision operators will be handy when we work with Selenium : Basis for if statements

		int i=1010;
		int j=100;
		System.out.println(i==j);

		//control flow

		if(i>j){
			System.out.println("i is greatest "+ i);
		}else{
			System.out.println("j is the greatest "+ j);
		}

		int x=200;
		int y=50;
		int z=300;

		if(x>y & x>z){
			System.out.println("x is greatest " +x);
		}else if(y>z){
			System.out.println("y is geatest " +y);
		}else
		{
			System.out.println("z is greatest "+ z);
		}

        //Color of string is different since it is not a data type. will cover String class in more detail
		String str = "We are learning java for selenium";
	}
}
