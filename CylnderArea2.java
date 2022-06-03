package JAVAPROGRAM3;

public class CylnderArea2 {

	public static void main(String[] args) {
        
         	double r=Double.parseDouble(args[0]);
	
            
		double h=Double.parseDouble(args[1]);
 
            	double  tsa=((2*22*r)/7)*(r+h);
 
            	System.out.println("TotalSurfaceArea Of Cylinder is:  " + tsa);
       
 
     }
}