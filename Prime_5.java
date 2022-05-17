package Prime_Question;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new  Scanner(System.in);
  int n = sc.nextInt();
  
  for(int i =2; i<=n; i++) {
	  
	 for(int j = 2; j<=i; j++) {
		  if (i%j==0) {
			  temp++;
			  break;
		  }}
	 if (temp==0) {
		 System.out.println(i);
		 
		  }
	 }
  }
	}


