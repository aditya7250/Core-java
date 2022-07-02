package Dsa_problem;
import java.util.*;
public class Hollowdiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n / 2; // don't hardcode the values to unable to test for different test cases
		int row = 1;
		int nsp = 1; // nsp =1 increase the value of nsp after row 2
		while (row <= n) {
			if (row == 1 || row == n) {         // print all stars for row 1 and row n
				int cst = 1;
				while (cst <= n) {
					System.out.print("*\t");
					cst++;
				}
				row++;
				System.out.println();
			} else {
				// stars
				int cst = 1;
				while (cst <= nst) {
					System.out.print("*" + "\t");
					cst++;
				}
				// spaces
				int csp = 1;
				while (csp <= nsp) {
					System.out.print("\t");
					csp++;
				}
				// stars
				int ast = 1;
				while (ast <= nst) {
					System.out.print("*" + "\t");
					ast++;
				}
				if (row <= n / 2) { // n-2 is not half no. of n rows so use n/2
					nst = nst - 1;
					nsp += 2;
				} else {
					nst = nst + 1;
					nsp -= 2;
				}
				row = row + 1;
				System.out.println();
			}
		}
	}
}