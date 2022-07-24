package AssignmentProgram2;

public class GreatestNumberProgram {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner (System.in);
		System.out.println("Enter Any Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a>b) {
			 System.out.println( "Greatest number is  " +a);
		}else {
			System.out.println( " Greatest number is  " +b);
		}
	}

}
