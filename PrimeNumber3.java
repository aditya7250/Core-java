package AssignmentProgram4;

public class PrimeNumber3 {

	public static void main(String[] args) {
java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter a no.: ");
		int n=sc.nextInt();
		if(n<2) {
			System.out.println("Invalid Number.");
		}else {
			boolean flag=true;
			for(int x=2;x<=n/2;x++) {
				if(n%x==0) {
					System.out.println(n+ " is Not Prime.");
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(n+" is Prime");
			}
		}
	}
}
