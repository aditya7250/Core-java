import java.util.*;
// package String;

public class StringEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I love. my INDIA";
//		StringTokenizer st = new StringTokenizer(s," ");
		StringTokenizer st = new StringTokenizer(s,"mD");
		int c=st.countTokens();
		System.out.println(c);
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
//		for(int x=1;x<=c;x++) {
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}