package OOP1_Inheritance;

public class TestCar {
	
	
	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
//		c.theftSafety(); Parent cannot take anything from child
		
		Vehicle v =new BMW();
		v.engine();
		
		
		
		//Top Casting
		//child class object can be referred  by parent class ref variable
	    Car c1 = new BMW(); //child class Object.
	    c1.start();
		c1.stop();
		c1.refuel();
//		c1.theftSafety(); Parent cannot access theftSafety Method

	
//		BMW b1 = new Car(); cannot create this Object 
		
		
		//Down Casting;
		//BMW b1 = (BMW)new Car();
		
		//compile will pass it
		// But Run Time Will get  
		//Exception in thread "main" java.lang.ClassCastException
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
