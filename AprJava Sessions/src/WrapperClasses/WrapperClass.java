package WrapperClasses;

public class WrapperClass {

	public static void main(String[] args) {
		
		
      //String to int Converstion
		String  x="100";
		System.out.println(x+20);
		System.out.println(20+x);
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		String fare="1200";
		
		
//		System.out.println(fare+20);
//		int cashback = 100;
//		int farevalue=Integer.parseInt(fare);
//		int finaltotal = farevalue - cashback;
//		System.out.println(finaltotal);
		
		
	    int fareval =	WrapperClass.getIntegerValue(fare);
		System.out.println(fareval-100);
		
		
		
//		String y="100A";
//		int p =Integer.parseInt(y); //NumberFormatException(Interview Question): For input string: "100A"
//		System.out.println(p+20);

		
		//String to Double
	
		String t="12.33";
		//String t="Null";
//		double d=Double.parseDouble(t);
//		System.out.println(d+20);
//		WrapperClass.getDoubleValue(t);
		
    	double c=WrapperClass.getDoubleValue(t);
	    System.out.println(c+20);
		
		//int to String:
	    int amount = 1000;
	    System.out.println(amount+200-20);
	    
	    String amt = String.valueOf(amount);
	    System.out.println(amt+22);
	    
	    int p=9;       // 1/0 = infinity( Arthimetic Exception Error )
	    int q=p/3;     // 0/1 = 0
	    System.out.println(q);
	    
		
	}
	
	
	
	/**
	 * This Method is Used to Convert a String value to an Integer Value
	 * 
	 * @param value
	 * @return
	 */
	
	//Generic Utility
	//mouse over on getIntegerValue
	
	public static int getIntegerValue(String value) {
		return  Integer.parseInt(value);
	}
	/**
	 * This Code is to Convert String to Double
	 * @param value1
	 * @return
	 */
      
    public static double getDoubleValue(String value1) {
    return	Double.parseDouble(value1);
    }







}



