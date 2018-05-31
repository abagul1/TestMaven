package com.pega.session3;

public class TwoDimensionalArrays {


	public static void main(String[] args) {

		                       //rows cols
		String[][] s=new String[3][4];

		//row 1
		s[0][0]="A1";
		s[0][1]="B1";
		s[0][2]="C1";
		s[0][3]="D1";


       // row 2

		s[1][0]="A2";
		s[1][1]="B2";
		s[1][2]="C2";
		s[1][3]="D2";

		//row 3
		s[2][0]="A3";
		s[2][1]="B3";
		s[2][2]="C3";
		s[2][3]="D3";


		int rows=s.length;
		int cols=s[0].length;

		for(int i=0;i<rows;i++){
			 for(int j=0;j<cols;j++){
				 System.out.print(s[i][j]+" ");
				 System.out.print("");
			 }
			System.out.println();
			System.out.println("--------------------");
		}



		Object[][] o=new Object[3][4];
		o[0][0]=45343;
		o[0][1]="String";
		o[0][2]='A';
		o[0][3]=43.43;

		o[1][0]=45343;
		o[1][1]="String";
		o[1][2]='A';
		o[1][3]=43.43;

		o[2][0]=45343;
		o[2][1]="String";
		o[2][2]='A';
		o[2][3]=43.43;


		int r=o.length;
		int col=o[0].length;


		for(int i=0;i<r;i++){
			for(int j=0;j<col;j++){
				System.out.print(o[i][j]+" ");
				System.out.print("");
			}
			System.out.println();
			System.out.println("--------------------");
		}



	}
}
