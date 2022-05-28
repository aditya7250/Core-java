package Eassy_java21;

import java.util.Scanner;

public class Division_function {
  public static float division(float p,float q) {
	  float division = (p/q);
	  return division;
  }
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
			float p = sc.nextFloat();
			float q = sc.nextFloat();
			float result = division(p,q);
			System.out.println("The value of division is :" + result);
		}
	
}