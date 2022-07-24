package PatternProgram;

public class PatternEx3 {

	public static void main(String[] args) {
		int a=4;
		int b=4;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			System.out.println();
			b--;
		}
	}
}
