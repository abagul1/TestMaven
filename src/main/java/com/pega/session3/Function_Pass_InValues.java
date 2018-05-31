package com.pega.session3;

public class Function_Pass_InValues {

	public static void main(String[] args) {

		int sum=sumALL(23,1,4);

		if(sum>100){
			System.out.println("Sum greater than 100");
		}else{
			System.out.println("its not");
		}


		sumALL("Test",2,4);

		findSUM(100);

		System.out.println("Sum of first 100...."+findSUM(100));
		System.out.println("Sum of first 200...."+findSUM(200));


	}

	/**
	 *
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */

	public static int sumALL(int a, int b, int c){
		int sum=a+b+c; //local variable
		System.out.println(sum);
		return sum;
	}


	public static void sumALL(String a, int b, int c){


	}

	public static int findSUM(int n){

		int sum=0;
		for(int i=0;i<=n;i++){
			sum=sum+i;
		}

		return sum;
	}
}
