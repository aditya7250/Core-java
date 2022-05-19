//package coding_ninja;

//public class age_problem {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

import java.util.*;
class age_problem {
	public static void main(String[]args) {
	void mystery(int a) {
		for(int k =2; k<=a; k++) {
			boolean flag = true;
			for (int j=2;j<=k/2; j++) {
				if(k%j==0) {
					flag = false;
					break;
				}
			}
			 if(flag) {
				 System.out.print(k + " ");)
			 }
		}
	}
}
}