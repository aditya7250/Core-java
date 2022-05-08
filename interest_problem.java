package coding_ninja;

//public class interest_problem {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		import java.util.Scanner;
		class interest_problem {
			
			public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int PA = sc.nextInt();
		double ROI = sc.nextDouble();
		int TP = sc.nextInt();
		int SI = (int)(PA*ROI*TP)/100;
		System.out.println(SI);
		}

		}
