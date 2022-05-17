package Prime_Question;
import java.util.*;

 class Prime_3 {
 public static void main (String[]args) {
	 int n = 5, count = 0;
	 System.out.print("5");
	 Scanner r= new Scanner(System.in);
	 n= r.nextInt();
	 
	 for(int i= 1; i<=n; i++) {
		 if (n%i==0) {
			 count++;
			// break;
		 }
	 }
	    if (count==2)
	    	System.out.print("Prime number");
	    else 
	    	System.out.print("Not prime number");
		 }
	 
	 
	 
	 
		 
	 
		 }
	 
 

