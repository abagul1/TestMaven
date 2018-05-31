package com.pega.Session2;

public class ForLoopConstruct {

	public static void main(String[] args) {

		System.out.println(" print number 1 through 10");
		for(int i=1;i<=10;i++){ //initization happens only once

			System.out.println(i);

		}

		System.out.println("Sum of first 100 number");
		int sum=0;
		for(int i=0;i<=100;i++){
			sum=sum+i;

		}

		System.out.println("Sum is  "+ sum);
		//Fibonacci series
		//0 1 1 2 3 5 8 13 21 34

		System.out.println();
		System.out.println("-------------");

		for(int i=0,j=1;i<50;i=i+j,j=i-j){
			System.out.println(i+"");

		}



	}
}
