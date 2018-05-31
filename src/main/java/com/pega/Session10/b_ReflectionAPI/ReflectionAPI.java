package com.pega.Session10.b_ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectionAPI {

	//Arraylist
	//For construct- Method and class.getMethos, mothod.invoke

	public static void main(String[] args)
			throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

		ArrayList<String> list = new ArrayList<String> ();
		list.add ("sampleTest");
		list.add ("secondTest");

		for(int i=0;i<list.size ();i++){

			System.out.println (list.get (i) );
			String X=list.get (i);
			Method method=ReflectionAPI.class.getMethod (X,String.class);
			method.invoke (method,"Hello");
			System.out.println ("End" );
		}

	}

	public static void sampleTest(String X){
		System.out.println ("in sample test static method" +X);

	}

	public static void secondTest(String Y){
		System.out.println ("in second test static method" +Y);
	}

}
