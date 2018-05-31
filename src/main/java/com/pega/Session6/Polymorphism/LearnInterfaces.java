package com.pega.Session6.Polymorphism;

/**
 * Rules: 
 * When overriding methods defined in interfaces there are several rules to be followed: 
 * Checked exceptions should not be declared on implementation methods other than the ones declared by the interface method or subclasses of those 
 * declared by the interface method. 
 * Signature of the interface method and the same return type or subtype should be maintained when overriding the methods.
 * 
 * An implementation class can be abstract and if so interface method need not be implemented.
 * 
 * Extending Interfaces: An interface can extend another interface, similarly to the way that a class can extend another class. The extends keyword is 
 * used to extend an interface, and the child interface inherits the methods of the parent interface.
 * 
 * An interface with no methods in it is referred to as a tagging interface. 
 * 
 * You can use a tagging interface to create a common parent among a group of interfaces. For example, when an interface extends EventListener, the JVM 
 * knows that this particular interface is going to be used in an event delegation scenario.
 */

interface Sports {
	 int i = 10; //public static final
	public void setHomeTeam(String name);
	public void setVisitingTeam(String name);
	public String getPrice();
	abstract public void setName();
}

interface Football extends Sports {
	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
	public void endOfQuarter(int quarter);
}

interface Hockey {
	public void homeGoalScored();
	public void visitingGoalScored();
	public void endOfPeriod(int period);
	public void overtimePeriod(int ot);
}

abstract class classImplementingFB implements Football {


	public void homeTeamScored(int points) {

	}

	public void visitingTeamScored(int points) {

	}

	public void endOfQuarter(int quarter) {

	}

	public void setHomeTeam(String name) {

	}

	public void setVisitingTeam(String name) {

	}

	public String getPrice() {
		return null;
	}

	public void setName() {

	}
}

public class LearnInterfaces implements Hockey {


//Run-time polymorphism
@Override
	public void visitingGoalScored() {
		// TODO Auto-generated method stub
	}

@Override
	public void endOfPeriod(int period) {
		// TODO Auto-generated method stub
	}

@Override
	public void overtimePeriod(int ot) {
		// TODO Auto-generated method stub
	}

@Override
	public void homeGoalScored() {
		// TODO Auto-generated method stub
	}
}