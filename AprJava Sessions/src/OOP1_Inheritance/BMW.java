package OOP1_Inheritance;

public class BMW extends Car {
	
//Method Overrding : When we have same method with same number of parameters in parent class and child class
// Static method cannot be overidden
// Static menthod can be overloaded
// Polymorphism means method overiding and method overloading
// Polymorphism : dynamic or RunTime Polymorphism	
// Method Overiding : Run Time Polymorphism
// Method Overloading : Compile time Polymorphism
	
	
	
	public void start() {
		System.out.println("BMW........Start");
	}
	
	public void theftSafety() {
		System.out.println("BMW Car is theftSafty");
	}
	
	
	

}
