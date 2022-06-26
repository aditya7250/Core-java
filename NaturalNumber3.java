package javaprogram26;
import java.util.Scanner;
public class NaturalNumber3 {

	public static void main(String[] args) {
     int number ,i,sum=0;
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter any number");
     number = sc.nextInt();
     for (i=1; i<=number; i++) {
    	  sum= sum+i;
     }
        System.out.println("Enter any Natural number=" +sum);
     }
	}


