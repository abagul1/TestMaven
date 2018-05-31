package com.pega.Session6.constructors;

public class HowConstructorWorks {
	//default is 0
	int num;


	//constructor :It is like a method that ensures that the  objects of class are created correctly
	//How to recognise a constructor , name is same as the class and doesnt have a return type


	//No argument constructor
	HowConstructorWorks(){
		num =10;
		System.out.println("No Arg constructor  ");

	}


	//Constructors doesnt have a return types, it helps with doing the initialising of all non static variables and doing basic work on the object
	//Argument based constructors
	HowConstructorWorks(int num){
		if(num<1){
			System.out.println("Number is negative");
		} else {
			System.out.println("Num is positive");
		}
		this.num=num;
	}

	//Can i have a method with the same name as class
//Method with same class name, constructors dont have no return type
	void HowConstructorWorks(){
		System.out.println("Normal method");

	}



	//Java provided a default constructor for the class


	//this not a good programming practice, good practice is what ever you want to do with a variable and if those work related to the object then  create it as part of constructor

	/*void setNumber(int num){
		if(num<1){
			System.out.println("Number is negative");
		} else {
			System.out.println("Num is positive");
		}
		this.num=num;
	}*/



	public static void main(String[] args) {

		HowConstructorWorks obj=new HowConstructorWorks(-10);
		//obj.setNumber(-10);
		System.out.println("The value of number is "+obj.num);
		obj.HowConstructorWorks();

		HowConstructorWorks o=new HowConstructorWorks();
		System.out.println("The value of number is "+o.num);
		o.HowConstructorWorks();

	}
}
