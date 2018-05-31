package com.pega.Session4;

public class HowBreakKeywordWorks {

	//break is used break out of the loop

	public static void main(String[] args) {

	 	A:for(int j=1;j<=5;j++){
			  for(int i=1;i<=5;i++){
			  	 if(j==3 && i==3){
			  	 	break A;
				 }
				  System.out.println(j +"----"+i);

			  }
			System.out.println();
		}
	}

}
