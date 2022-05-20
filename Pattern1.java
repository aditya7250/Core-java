 package lec2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc,nextInt();
     int row = 1;
     int nst = n; //no of stars in each row
     while (row<=n) {
    	 //Stsrt point
    	 
    	 int cst = 1; //count of star
    	 while (cst<=nst) {
    		 System.out.println("*"+"");
    		 cst++;
    	 }
     }
	}

}
