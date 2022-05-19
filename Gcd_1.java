package gcd;

import java.util.Scanner;

//import.java.uti
public class Gcd_1 {
  public static int gcd(int first_num,int sec_num)
  {
	   int i=first_num%sec_num;
	   while(1!=0)
	   {
		     first_num= sec_num;
		     sec_num=i;
		     i= first_num%sec_num;
	   }
	     return sec_num;
  }
      public static void main(String [] args)
      {
    	   Scanner static void main(String[]args)
    	   {
    		    Scanner sc= new Sccaner(System.in);
    		    system.out.println("Enter the first number: ");
    		    int num1= sc.nextInt();
    		    System.out.println("Enter the second number: ");
    		    int num2= sc.nextIn("GCD of two number: "+gcd(num1,num2));
       
	   
  }
}
