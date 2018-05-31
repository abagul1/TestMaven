package com.pega.Session7.HidingInstanceVariables;

public class HidingInstanceVariables extends SubClassOrChildClass{

	String name="Instance var";

	void methodThatExplainsVariableHiding(){
		String name="local variable";
		System.out.println (name );//local variable
		System.out.println (this.name );//Instance variable
		System.out.println (super.name);
		System.out.println (SubClassOrChildClass.name );
		System.out.println (BaseClassOrParentClass.name );


	}


	public static void main(String[] args) {
		HidingInstanceVariables obj=new HidingInstanceVariables();
		obj.methodThatExplainsVariableHiding ();
	}
}
