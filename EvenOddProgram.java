package AssignmentProgram4;

public class EvenOddProgram {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String  c;
		 do {
			 System.out.println("Enter Any Number");
			  int n = sc.nextInt();
			    if (n%2==0) {
			    	System.out.println("Even Number");
			    }else {
			    	System.out.println("Odd Number");
			    }
			    System.out.println("Do you wanna Continue?[Yes/No]");
				c=sc.next();
			}
			while(c.equalsIgnoreCase("Yes"));
}
}
		 
