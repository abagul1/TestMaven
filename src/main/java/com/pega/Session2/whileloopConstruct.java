package com.pega.Session2;

public class whileloopConstruct {

	public static void main(String[] args) {


		int i=1; //initialization
		while(i<=10){ //boolean condition
			System.out.println(i);
			i++; //i=i+1 //updation
		}

		System.out.println("------------------------");

		int j=10;
		while(j>0){
			System.out.println(j);
			j--;
		}

		System.out.println("------------------------");

		while(true){
			System.out.println("Infinite loop");
			break;
		}

		int z=10;
		while(z<10){
			System.out.println(z);
			z++;
		}
		int s=10;

		do{
			System.out.println(s);
			s++;

		}while(s<10);


	}
}
