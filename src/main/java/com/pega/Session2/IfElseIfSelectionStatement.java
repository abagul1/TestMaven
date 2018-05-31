package com.pega.Session2;

public class IfElseIfSelectionStatement {

	public static void main(String[] args) {

		int marks=85;

		if(marks>70 &&  marks<=90){
			System.out.println("Excellent score");
		}else if(marks>90 && marks<=100){
			System.out.println("Excellent +");
		}else{
			System.out.println("Work harder");
		}

		//Bitwise operator
		//exp A & exp B - validates exp A and exp B then performs  &
		//exp A && exp B - Validates exp A is true than only it validates exp B

		int x=4, y=5 , z= 5;

		if(x==y | y==z){
			System.out.println("bitwise operator");
		}else if (x==y || y==z){
			System.out.println("logical");
		}else{
			System.out.println("None");
		}

	}
}
