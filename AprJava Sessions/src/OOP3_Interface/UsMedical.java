package OOP3_Interface;
/**
 * By Interface we can achieve multiple Inheritance
 * Interface Method are also called abstract method which doesnot have method body.
 * 
 * @author ADMIN
 *
 */
public interface UsMedical

{
	
	int min_fee=100;
	
	
         public void cardioServices();
         public void ambulanceServices();
         public void physioServices();
         
         
         /*
          * Interface variables are static bydefault
          * cannot have any static methods in interface
          * cannot create object of interface
          * No method body no method declaration
          * 
          *after JDk 1.8;
          *
          *1.Can have default method 
          * 
          *2.Can have static method
          *
          */
         
         default void test() {
        	 System.out.println("Test Method");
         }
         
         
         static void display() {
        	 System.out.println("Static Method Display");
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         

}
