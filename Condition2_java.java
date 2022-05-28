package Eassy_java21;
import java.util.*;


public class Condition2_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int password ;
   System.out.println("please enter the password -");
    Scanner obj = new Scanner(System.in);
    password = obj.nextInt();
    if (password == 0000) {
    	 System.out.println("The name of the criket king is virat kohli");
    	 System.out.println("He is from delhi");
    	 System.out.println("He won the many world cup");
    	 }
    else {
    	System.out.println("Wrong password");
    }
	}

}
