package String;
public class StringEx10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I love. my INDIA";
		
//		String s1[]=s.split(" ");
//		String s1[]=s.split("my");
//		String s1[]=s.split("");
//		String s1[]=s.split(".");//can not split with . 
		String s1[]=s.split("\\.");//can split like this for . 
		for(String x:s1) {
			System.out.println(x);
		}
	}
}