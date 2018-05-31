package com.pega.Session5;

public class a_TestPhone {

	public static void main(String[] args) {

		a_Phone p=new a_Phone();
		p.call();
		p.voiceMail();


		System.out.println("------------------");

		a_MobilePhone m=new a_MobilePhone();
		m.call();
		m.roamfree();
		m.voiceMail();

		System.out.println("-------------------");

		a_SmartPhone s=new a_SmartPhone();
		s.apps();
		s.roamfree();
		s.voiceMail();
	}
}
