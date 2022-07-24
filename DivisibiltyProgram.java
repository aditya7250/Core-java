package AssignmentProgram2;

public class DivisibiltyProgram {

	public static void main(String[] args) {
	 java.util.Scanner sc = new java.util.Scanner (System.in);
	 System.out.println("Enter Any Number");
	 int a = sc.nextInt();
	 if (a%5==0 && a%3==0) {
		 System.out.println( a+ " is divisible by 5 and 3:");
	 }

	}

}
