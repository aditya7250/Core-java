package AssignmentProgram3;

 class PrimeNumber {
	public static void main(String[] args) {

	java.util.Scanner sc=new java.util. Scanner( System.in );
	
			System.out.println("Enter Any Number");
			int n , count = 0;
			 n = sc.nextInt();		
			 if (n<2) {
			 System.out.println("Invalid number");	
			
			 }else {
			
			 for (int i= 1; i<=n; i++) {
				  if (n%i==0) {
					  count++;
				  }
			 }
				    if (count==2) {
				    	 System.out.println("It is prime number");
				    }else {
				    	 System.out.println("It is not Prime Number");
				    }
			 }
}
 }
 	