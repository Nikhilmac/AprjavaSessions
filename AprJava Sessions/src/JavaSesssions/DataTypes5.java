package JavaSesssions;

import java.util.Scanner;

/**
 * 
 * This Code is for DataTypes
 * 
 * @author ADMIN
 *
 */
public class DataTypes5 {
public static void main(String[] args) {
	System.out.println("Hello");
	System.out.println("Nikhil");
	int i=74;
	int j=36;
	int Sum = i+j;
    System.out.println(Sum);
    
    System.out.println("------------------------");
    int p=50;
    int k=3;
    int d=p/k;
    System.out.println(d);
    
    System.out.println("------------------------");
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter age");
    int age=s.nextInt();
    if(age>=18) {
    	System.out.println("Allowed");
    }else {
    	System.out.println("Not Allowed");
    }

    System.out.println("------------------------");

    Scanner s1=new Scanner(System.in);
    System.out.println("Enter num");
    int Num=s1.nextInt();
    
    Scanner s2=new Scanner(System.in);
    System.out.println("Enter num");
    int Num1=s1.nextInt();
    
    Scanner s3=new Scanner(System.in);
    System.out.println("Enter num");
    int Num2=s1.nextInt();
    
   // System.out.println(-Num+Num1*Num2);
    System.out.println((Num+Num1)%Num2);
    System.out.println(20+-3*5/8);
    System.out.println(5+15/3*2-8%3);
    
    
    
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
