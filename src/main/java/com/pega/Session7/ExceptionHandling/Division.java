package com.pega.Session7.ExceptionHandling;

public class Division {

	public static void main(String[] args) {
		System.out.println("Starts");

		/*try {
			System.out.println("A");
			//int i=2/2;
			int i = 2 / 0; //we call error but its not that it is an exception

			System.out.println(i);
			//control terminates here, you need to report this and move forward
			System.out.println("B");
		}catch(Exception e){//exception is in build class in java, object of exce is created in memory and you can access it
			System.out.println("some error"+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("C");*/

		try{
			multiply();}
		catch (Throwable e){
			//you can exception and errors
			System.out.println("error A"+""+e.getMessage());
			//click on control +L
			e.printStackTrace();
		}
		System.out.println("ends");

	}

 public static void multiply(){

	divide();
		/*try{
		divide();}
		catch (Exception e){
			System.out.println("error B"+""+e.getMessage());
			e.printStackTrace();
		}*/
 }


	public static void divide(){

	/*	System.out.println("A");
		int i = 2 / 0;
		//click on control +L
		System.out.println(i);
		System.out.println("------");
		//control terminates here, you need to report this and move forward
		System.out.println("B");*/

		try {
			System.out.println("A");
			//int i=2/2;
			int i = 2 / 0; //we call error but its not that it is an exception
			//click on control +L
			System.out.println(i);
			//control terminates here, you need to report this and move forward
			System.out.println("B");
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
