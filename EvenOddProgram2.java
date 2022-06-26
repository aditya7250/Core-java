package javaprogram26;
import java.util.Scanner;
public class EvenOddProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any Number");
    number =sc.nextInt();
    if(number %2==0) {
    	 System.out.println("Even number");
    }else {
    	System.out.println("Odd number");
    }
	}

}
