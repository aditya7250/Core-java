package LoopControl;

public class ForLoopEx7 {

	public static void main(String[] args) {
		for(int x=1;x++<=10;x++,++x) { 
			System.out.println(x--);
		}	
	}
}
