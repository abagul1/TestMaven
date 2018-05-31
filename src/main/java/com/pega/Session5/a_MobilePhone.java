package com.pega.Session5;

public class a_MobilePhone extends a_Phone{

	public void roamfree(){

	}
	//control o or right click generate


	@Override
	public void call() {
		System.out.println("mobile call");
	}

	@Override
	public void voiceMail() {
		System.out.println("Mobile VM");
	}
}
