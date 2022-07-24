package AssignmentProgram4;

public class PrimeNumber2 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int n, count =0;
		String  c;
		 do {
			  System.out.println("Enter Any Number");
			   n = sc.nextInt();
//			   if (n<2) {
//					 System.out.println("Invalid number");
//				 }else {
			  for(int i =1; i<=n; i++) {
				   if(n%i==0) {
					    count++;
				   }
			  }
			    if (count == 2) {
			    	 System.out.println("So it is prime Number");
			    }else {
			    	 System.out.println("It is not prime Number");
			    }
			     System.out.println("Do you wanna Continue?[Yes/No]");
					c=sc.next();
				}
				while(c.equalsIgnoreCase("Yes"));	 

		 }
		 }
	