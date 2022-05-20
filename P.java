//package Loop_Problem;
//import java.util.*;
//public class Problem_2 {

	//public static void main(String[] args) {
	  
//package problem_2;
import java.util.*;

public class P{
  public static void main(String[] args) {
  
System.out.println("Enter number of lines(odd lines)");
  Scanner sc = new Scanner(System.in);

  int lines = sc.nextInt();
  int mid = (lines+1)/2;
  //upper

      for(int i= 1;i<=mid; i++){
           //space
      for(int s = 1; s<=(mid-i); s++) 
      System.out.print(" ");     
      } 

      //star
      for(int j =1; j <=(j*2 - 1); j++) {
      
       System.out .println("*");
       System.out.println();
  }
  //lower
    for (int i = 1; i<=(mid-1); i++) {
         //space
          for (int s = 1; s<=i; s++) {
               System.out.print(" ");
          }
          //star
           for (int j = 1; j<= 2*(mid-i)-1; j++){
               System.out.print("*");
           } 
           System.out.println();


           }
}
}
 
      