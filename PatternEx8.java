package PatternProgram;

public class PatternEx8 {

	public static void main(String[] args) {
		int a=5;
		int b=1;
		int c=7;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			for(int y=1;y<=c;y++) {
				System.out.print(" ");
			}
			if(x==a) {
				b--;
			}
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			System.out.println();
			b++;
			c-=2;
		}
	}
}
