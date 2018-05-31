package com.pega.Session5;

public class A_Encapsulation {

	public static void main(String[] args) {
		isKMSpeedind();

	}

	public static void isKMSpeedind(){

		if(A_CalculateSpeed.calculatedspeed(1000,10)>50){
			System.out.println("KM is speeding");
		} else{
			System.out.println("not");
		}
	}
}
