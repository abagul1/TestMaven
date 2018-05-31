package com.pega.Session4;

public class Value_and_reference {


	int x;
	int y;

	public static void main(String[] args) {
		Value_and_reference p=new Value_and_reference();
		p.x=10;
		p.y=20;
		System.out.println(p.x+"  "+p.y);
		swap(p.x,p.y);
		System.out.println(p.x+"  "+p.y);
		swapVal(p);
		System.out.println(p.x+"  "+p.y);

	}

	public static void swap(int a,int b){

		int temp=a;
		a=b;
		b=temp;
	}


	public static void swapVal(Value_and_reference t){
		int temp=t.x;
		t.x=t.y;
		t.y=temp;
	}

}
