package com.pega.Session6.Polymorphism;
/**
 *  Polymorphism: Another OOPS Concept - Polymorphism is an ability to define a function in multiple forms. In Java there are two types of polymorphism: 
 *  compile time polymorphism (overloading) and runtime polymorphism (overriding).

 *	Overloading: Overloading is determined at the compile time. It occurs when several methods have same names with different method signature and 
 *  different number or type of parameters.
 *  
 *  Same method signature but different number of parameters. Same method signature and same number of parameters but of different type.

 *  Method overriding: Overriding occurs when a class method has the same name and signature as a method in parent class. When you override methods, 
 *  JVM determines the proper methods to call at the programs run time, not at  the compile time.
 */

// 1st Example
class ClassWhichOverloadMethods {
	public void display(char c, double d) {
		System.out.println(c + " " + d);
	}

	public void display(double d, char c) {
		System.out.println(d + " " + c);
	}
}

class LetsUnderstandMethodOverloading {
	public static void main(String args[]) {
		ClassWhichOverloadMethods obj = new ClassWhichOverloadMethods();
		obj.display('a', 10);
		obj.display(10, 'a');
	}
}

// 2nd Example
 class ClassWhichOverloadMethodsExample2 {
	public void display(String c) {
		System.out.println(c);
	}

	public void display(char c) {
		System.out.println(c);
	}
}

class LetsUnderstandMethodOverloadingExample2 {
	public static void main(String args[]) {
		ClassWhichOverloadMethodsExample2 obj = new ClassWhichOverloadMethodsExample2();
		obj.display("a as a String");
		obj.display('a');
	}
}

// Example 3
class ClassWhichOverloadMethodsExample3 {
	public void disp(char c, int num) {
		System.out.println("I am the first definition of method disp");
	}

	public void disp(int num, char c) {
		System.out.println("I am the second definition of method disp");
	}
}

class LetsUnderstandOverloading3 {
	public static void main(String args[]) {
		ClassWhichOverloadMethodsExample3 obj = new ClassWhichOverloadMethodsExample3();
		obj.disp('x', 51);
		obj.disp(52, 'y');
	}
}


/**
 * Examples - Please go through them
 * 
 * Case 1:
 * int mymethod(int a, int b, float c) 
 * int mymethod(int var1, int var2, float var3)
 * Result: Compile time error. Argument lists are exactly same. Both methods are having same number, data types and same sequence of data types in 
 * arguments.
 * 
 * Case 2:
 * int mymethod(int a, int b) 
 * int mymethod(float var1, float var2)
 * Result: Perfectly fine. Valid case for overloading. Here data types of arguments are different.
 * 
 * Case 3:
 * int mymethod(int a, int b)
 * int mymethod(int num)
 * Result: Perfectly fine. Valid case for overloading. Here number of arguments are different.
 * 
 * Case 4:
 * float mymethod(int a, float b) 
 * float mymethod(float var1, int var2)
 * Result: Perfectly fine. Valid case for overloading. Sequence of the data types are different, first method is having (int, float) and second is having
 * (float, int).
 * 
 * Case 5:
 * int mymethod(int a, int b)
 * float mymethod(int var1, int var2)
 * Result: Compile time error. Argument lists are exactly same. Even though return type of methods are different, it is not a valid case. Since return 
 * type of method doesn't matter while overloading a method.
 **/