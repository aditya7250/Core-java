package LoopControl;

public class ForLoopEx5 {

	public static void main(String[] args) {
java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter a number between 1 to 100");
		int a=sc.nextInt();
		if(a>=1 && a<=100) {
			int sum=0;
			for(int x=1;x<=a;x++) { 
				sum += x;
				System.out.print(x);
				if(x!=a) {
					System.out.print("+");
				}
			}
			System.out.println("="+sum);
		}else {
			System.out.println("Invalid Number");
		}
	}
}
