package AssignmentProgram4;

public class AddalldigitProgram {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n ,r , sum =0;
		System.out.println("Enter Any Number");
		   n = sc.nextInt();
		while (n>0) {
			 r = n%10;
			 sum = sum + r;
			 n = n/10;
		}
		 System.out.println("Sum of digit is " +sum);
	}

}
