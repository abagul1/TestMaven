package com.pega.Session5;

public class b_TestHospital {

	public static void main(String[] args) {
		//illegal to create an object for an intrtface

		b_BostonChildren children = new b_BostonChildren();
		children.doScan();
		children.doVaccination();
		children.oprate();

		System.out.println("------------------------");
		b_mgh mgh = new b_mgh();
		mgh.doScan();
		mgh.doVaccination();
		mgh.oprate();
		//interface reference =new class that is implementing
		b_hospital h=new b_mgh();
		h.doScan();
		h.doVaccination();
		h.oprate();


		b_hospital x=null;
		x=new b_BostonChildren();
		x.oprate();



	}
}
