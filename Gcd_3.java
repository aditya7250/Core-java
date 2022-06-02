//package gcd;

//public class Gcd_3 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}

import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
	  Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int j = rows;
		for (int i = 1; i <= rows; i++) {

			for (int l = rows; l >= 1; l--) {

				System.out.print(l + " ");
			}

			System.out.println();
		}
  }
}

