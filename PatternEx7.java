package PatternProgram;

public class PatternEx7 {

	public static void main(String[] args) {
		int a=9;
		int b=4;
		int c=1;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=b;y++) {
				System.out.print(" ");
			}
			for(int y=1;y<=c;y++) {
				System.out.print("*");
			}
			System.out.println();
			if(x<=a/2) {
				b--;
				c++;
			}else {
				b++;
				c--;
			}
			
		}
	}
	}


