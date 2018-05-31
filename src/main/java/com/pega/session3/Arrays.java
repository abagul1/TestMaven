package com.pega.session3;

public class Arrays {

	//single dimensional arrays
	//Array are space allocation in memory to store values


	public static void main(String[] args) {

		String FirstName="Kalyan";
		String LastName="mekala";
		String Email="km@gmail.com";
		String city="Boston";

		String[] st=new String[4];
		st[0]="Kalyan";
		st[1]="Mekala";
		st[2]="km@gmail.com";
		st[3]="Boston";

		System.out.println(st[0]);
		System.out.println(st[1]);
		System.out.println(st[2]);
		System.out.println(st[3]);

		System.out.println("----------------");
		for(String i:st){
			System.out.println(i);
		}

		System.out.println("----------------");
		for(int i=0;i<st.length;i++){
			System.out.println(st[i]);
		}


		char[] c=new char[3];
		c[0]=1;
		c[1]='B';
		c[2]='C';

		for(char i:c){
			System.out.println(i);
		}

		System.out.println(c.length);



	}
}
