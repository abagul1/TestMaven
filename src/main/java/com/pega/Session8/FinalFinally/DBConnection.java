package com.pega.Session8.FinalFinally;

public class DBConnection {
	final int z=10;//this cannot be changed, it is mandatory to initialize the final variable


	public static void main(String[] args) {


		try{
			//connecting to the database -success
			//query which pulls value -Exception
			//closing the connection
			System.out.println("A");
			int i = 2/0;
			System.out.println("B");

		}catch(Exception e){
			//you will come to know what the exception is,but there are other mandatory acions you need to do, for that we use finally
			System.out.println("error");
			//e.printStackTrace();
		}finally {
			//close if established - similar example with selenium
			System.out.println("Finally");
		}
	}
}