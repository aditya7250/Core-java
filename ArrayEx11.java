import java.util.Scanner;
public class ArrayEx11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size:");
		int m=sc.nextInt();
		System.out.println("Please Enter the No of Elements in each Array:");
		int n=sc.nextInt();
		int [][]a=new int[m][n];
		
		for(int x=0;x<a.length;x++) {
			System.out.println("Enter values for Array "+(x+1));
			for(int y=0;y<a[x].length;y++) {
				a[x][y]=sc.nextInt();
			}
		}
		System.out.println("Entered Array Values Are:");
		int c=1;
		for(int y[]:a) {
			System.out.println("Values for Array "+c++);
			for(int x:y) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
	}
}