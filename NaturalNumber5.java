package javaprogram26;
import java.util.Scanner;
public class NaturalNumber5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int start,i,end,sum=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Starting value");
       System.out.println("Enter Ending Value");
        start = sc.nextInt();
        end =  sc.nextInt();
        for (i=start; i<=end; i++) {
        	sum= sum+i;
        }
        	System.out.println("The Natural number is ="+sum);
       }
	}


