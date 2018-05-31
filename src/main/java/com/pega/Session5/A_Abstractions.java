package com.pega.Session5;

public class A_Abstractions {
	//calculate speed and if that its greater than 50

	public static void main(String[] args) {
		A_Abstractions obj=new A_Abstractions();
		obj.isKMSpeedingAbstractionMethod();
	}

	public void isKMSpeeding(){
		int distance=1000;
		int time=10;

		int kmspeed=distance/time;

		if(kmspeed>50){
			System.out.println("KM is speeding");
		}else{
			System.out.println("Not speedinf");
		}

	}


	public int calculateSpeed(int distance,int time){
		return distance/time;
	}

	public void isKMSpeedingAbstractionMethod(){
		if(calculateSpeed(1000,10)>50){
			System.out.println("He is speeding");
		}else{
			System.out.println("not spped");
		}
	}

}
