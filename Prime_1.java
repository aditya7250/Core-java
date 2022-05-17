package Prime_Question;

public class Prime_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n ,count = 0;
 System.out.print("Enter the number");
 Scanner r = new Scanner (System.in);
 n = r.nextInt();
   for(int i=1; i<=n; i++);
   {
	   if ( n%i==0)
	   {
		   count++;
	   }}
   if (count==2)
	   System.out.print("prime number");
	   else
		   System.out.print(" not prime number");
	   }
   
	}

}
