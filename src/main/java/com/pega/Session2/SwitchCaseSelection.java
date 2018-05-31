package com.pega.Session2;

public class SwitchCaseSelection {

	public static void main(String[] args) {
		grade('A');
		grade('E');


	}

	public static void grade(char grade){
		int sucess;

		switch(grade){
			case 'A':
				System.out.println("Excellent grade");
				sucess=1;
				break;
			case 'B':
				System.out.println("Good grade");
				sucess=1;
				break;
			case 'C':
				System.out.println("Average grade");
				sucess=0;
				break;
			case 'D':
				System.out.println("Failed");
				sucess=-1;
				break;
			default:
				System.out.println("Unknown grade");
				sucess=-1;
				break;


		}
passTheGrade(sucess);

	}

	public static void passTheGrade(int sucess){
		switch(sucess){
			case 1:
				System.out.println("Passed");
				break;
			case 0:
				System.out.println("Just passed");
				break;
			case -1:
				System.out.println("Failed");
				break;
			default:
				System.out.println("Unknown Failed");
				break;
		}

	}
}
