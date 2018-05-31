package com.pega.session3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ForLoopPerformanceCheck {


	static long startTime;
	static long endTime;
	static List<Integer> list = new ArrayList<Integer>();

	static {

		for(int i=0;i<10000000;i++){
			list.add(i);

		}
	}

	public static void main(String[] args) {

	//Scenario 1
		startTime= Calendar.getInstance().getTimeInMillis();
		for(int i:list){

		}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Enhanced for loop "+(endTime-startTime)+" in ms");


	//Scenario 2
		startTime= Calendar.getInstance().getTimeInMillis();
		for(int i=0;i<list.size();i++){

		}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Basic for loop "+(endTime-startTime)+" in ms");

	//Scenario 3

		startTime= Calendar.getInstance().getTimeInMillis();
		int size=list.size();
		for(int i=0;i<size;i++){

		}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("initilizing before the  for loop "+(endTime-startTime)+" in ms");


		//Scenario 4
		startTime= Calendar.getInstance().getTimeInMillis();
		for(int i=list.size();i>0;i--){

		}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Decrementing before the  for loop "+(endTime-startTime)+" in ms");

	}
}
